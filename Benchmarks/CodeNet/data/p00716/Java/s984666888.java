import java.util.Scanner;

/**
 * Created by kazuki on 2014/07/12.
 */
public class Main{
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int m;

        m = s.nextInt();

        while (m-- != 0) {
            int firstMoney = s.nextInt();
            int year = s.nextInt();
            int type = s.nextInt();
            int money;
            int maxMoney = 0;

            for (int i = 0; i < type; i++) {
                int rateType = s.nextInt();
                double rate = s.nextDouble();
                int charge = s.nextInt();


                if (rateType == 0)
                    money = singleCulc(firstMoney, rate, charge, year);
                else
                    money = doubleCulc(firstMoney, rate, charge, year);

                maxMoney = Math.max(maxMoney, money);
            }
            System.out.println(maxMoney);
        }
    }

    static int singleCulc(int firstMoney, double rate, int change, int year) {
        int interest = 0, money = firstMoney;
        for (int i = 0; i < year; i++) {
            interest += money * rate;
            money -= change;
        }
        return money + interest;
    }

    static int doubleCulc(int firstMoney, double rate, int change, int year) {
        int money = firstMoney;
        for (int i = 0; i < year; i++) {
            money = money + (int) (money * rate) - change;
        }
        return money;
    }
}