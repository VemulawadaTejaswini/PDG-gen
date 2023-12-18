import java.math.BigDecimal;
import java.util.Scanner;

/**
 * 0007:Debt Hell
 * 
 * @author MS14A
 * @version 2015/04/08
 */
public class Main {

    /** 初期借金額：10万円 */
    private static final BigDecimal INITIAL_DEBT = new BigDecimal("100000");

    /** 利子：5% */
    private static final BigDecimal INTEREST_RATE = BigDecimal.valueOf(0.05);

    /** 繰り上げ計算用 */
    private static final BigDecimal DIVISOR = BigDecimal.valueOf(1000);

    /**
     * 某国に住んでいる友達がお金に困って、あるヤミ金融業者から 10 万円の借金をしたまま、<br>
     * 全く返済していないといいます。<br>
     * この業者は、一週間ごとに 5% の利子を借金に加え、さらに借金の 1,000 円未満を切り上げます。<br>
     * n を入力したとき、n 週間後の借金の残高を出力し終了するプログラムを作成して下さい。<br>
     * n は 100 以下とします。
     * 
     * @param args
     *            n
     */
    public static void main(String[] args) {
        Scanner scanned = new Scanner(System.in);
        int weeks = scanned.nextInt();
        BigDecimal finalDebt = INITIAL_DEBT;

        for (int i = 0; i < weeks; i++) {
            // 利子額計算。1000で割った小数部を繰り上げる。
            BigDecimal interestAmount = finalDebt.multiply(INTEREST_RATE)
                                                            .divide(DIVISOR, 0, BigDecimal.ROUND_UP);

            // 借金額 = 前週の借金額 + 利子額
            finalDebt = finalDebt.add(interestAmount.multiply(DIVISOR));
        }

        System.out.println(finalDebt);
    }

}