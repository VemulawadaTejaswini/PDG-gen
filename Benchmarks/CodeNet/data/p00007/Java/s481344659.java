import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

    /**
    * お金
    */
    private static final String MONEY = "100000";

    /**
    * 利子
    */
    private static final String INTEREST_RATE = "0.05";

    /**
    * @param args n週間
    */
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int weeks = in.nextInt();

        //借金を計算します。
        int debt = calcDebt(MONEY, INTEREST_RATE, weeks);

        System.out.println(debt);
        in.close();
    }

    /**
    * n週間後の借金を計算。1000未満は切り上げる。<br>
    * @param money 借金
    * @param interestRate 利子
    * @param weeks n週間
    * @return n週間後の借金
    */
    private static int calcDebt(String money,
            String interestRate, int weeks) {

        BigDecimal debt = new BigDecimal(money);

        for(int i = 0; i < weeks; i++){
            debt  = debt.add(calcInterest(debt, INTEREST_RATE));
        }
        return debt.intValue();
    }

    static BigDecimal calcInterest(BigDecimal debt, String interestRate){
        debt = (debt).multiply(new BigDecimal(interestRate));
        return debt.setScale(-3, BigDecimal.ROUND_UP);
    }
}