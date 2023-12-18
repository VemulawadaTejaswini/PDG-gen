import java.util.Scanner;

/**
 * 0007: Debt Hell
 * @author ueuenonon
 */
public class Main {
    /** 最初の借金 */
    public static final double FIRST_DEBT = 100000.0;
    /** 利率 */
    public static final double INTEREST_RATE = 0.05;
    /** 切り上げの基準  */
    public static final double CEIL_BASE = 1000.0;

    /**
     * エントリポイント
     */
    public static void main(String args[]) {
        System.out.println(
            calcDebt(FIRST_DEBT, new Scanner(System.in).nextInt())
        );

    }

    /**
     * n週間後の借金額を計算する。（複利式）
     * 
     * @param firstDebt 最初の借金額
     * @param nWeeks 何週間後の借金額を求めるか
     * @return 指定した週間後の借金額
     */
    private static int calcDebt(double firstDebt, int nWeeks) {
        double debt = firstDebt;
        for(int i = 0; i< nWeeks; i++) {
            debt = Math.ceil(debt * (1 + INTEREST_RATE) / CEIL_BASE) * CEIL_BASE;
        }
        return (int)debt;
    }
} 