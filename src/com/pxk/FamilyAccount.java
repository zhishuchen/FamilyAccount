package com.pxk;

/**
 * @author pxk
 * @create 2022-10-24-10:42
 */
public class FamilyAccount {
    public static void main(String[] args) {
        boolean loopFlag = true;
        String details = "收支\t账户金额\t\t收支金额\t说    明\n";
        double balance = 10000; //初始金额
        do {
            System.out.println("-----------------家庭收支记账软件-----------------");
            System.out.println("1 收支明细");
            System.out.println("2 登记收入");
            System.out.println("3 登记支出");
            System.out.println("4 退 出");
            System.out.print("请选择(1-4)：");

            char menuSelection = Utility.readMenuSelection();
            switch (menuSelection){
                case '1':
                    System.out.println("-----------------当前收支明细记录-----------------");
                    System.out.println(details);
                    System.out.println("--------------------------------------------------");
                    break;
                case '2':
                    System.out.print("本次收入金额：");
                    int income = Utility.readNumber();
                    System.out.print("本次收入说明：");
                    String incomeDesc = Utility.readString();
                    balance+=income;
                    details+="收入\t" + balance + "\t\t" +
                            income + "\t\t" + incomeDesc + "\n";
                    System.out.println("---------------------登记完成---------------------");
                    break;
                case '3':
                    System.out.print("本次支出金额：");
                    int spend = Utility.readNumber();
                    System.out.print("本次支出说明：");
                    String spendDesc = Utility.readString();
                    balance-=spend;
                    details+="支出\t" + balance + "\t\t" +
                            spend + "\t\t" + spendDesc + "\n";
                    System.out.println("---------------------登记完成---------------------");
                    break;
                case '4':
                    System.out.println("确认是否退出（Y/N）：");
                    char exit = Utility.readConfirmSelection();
                    if (exit=='Y'){
                        loopFlag = false;
                    }
                    break;
            }
        }while (loopFlag);
    }
}
