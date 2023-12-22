import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    /** 借金額 */
    private static final int LOAN = 100000;

    /** 1週間ごとの利子（％） */
    private static final int INTEREST = 5;

    /** 切り上げの単位 */
    private static final int ROUND_UP_SCALE = 1000;

    /**
     * <p>
     * 引数で与えられたn週間後の借金額の残高を出力する。<br/>
     * 借金額は10万円、利子は1週間につき5％、利子の計算後に1,000円未満を切り上げることとする。<br/>
     * <br/>
     * 標準入力から以下を入力値として受け取る。<br/>
     * ・何週間後か（0?100）<br/>
     * </p>
     *
     * @param args
     *            利用しない。
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {

        // 入力値を受け取る
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int weeks = Integer.parseInt(line);

        // n週間後の借金の残高を計算する
        int loanBalance = calcLoanBalance(weeks);

        // 結果を出力する
        System.out.println(loanBalance);

    }

    /**
     * <p>
     * 引数で与えられた週数が経過したときの借金の残高を計算する。<br/>
     * 1週間経過するごとに利子と残高を再計算する。<br/>
     * この際、金額の1,000円未満を切り上げる。<br/>
     * </p>
     *
     * @param weeks
     *            経過週数
     * @return 利子額
     */
    private static int calcLoanBalance(int weeks) {

        int loanBalance = LOAN;
        for (int i = 0; i < weeks; i++) {
            loanBalance = roundUp(loanBalance + (loanBalance * INTEREST) / 100,
                    ROUND_UP_SCALE);
        }

        return loanBalance;

    }

    /**
     * <p>
     * 引数で与えられた数値を、引数で指定された単位で切り上げる。<br/>
     * </p>
     *
     * @param amount
     *            単位
     * @param scale
     *            切り上げの単位
     * @return 結果
     */
    private static int roundUp(int amount, int scale) {

        int quotient = amount / scale;
        int remainder = amount % scale;

        if (remainder == 0) {
            return amount;
        } else {
            return (quotient + 1) * scale;
        }

    }
}