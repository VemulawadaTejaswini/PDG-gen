import java.math.BigDecimal;
import java.util.Scanner;

/*
 * プログラミングコンテスト解答(0007 Debt Hell)
 */
class Main {

    /*
     * 借金元金
     */
    public static final BigDecimal DEPT = new BigDecimal(100000);

    /*
     * 利子
     */
    public static final BigDecimal INTEREST = new BigDecimal("0.05");

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int week = Integer.parseInt(s.next());
        /*
         * 借金残高計算
         */
        BigDecimal repay = DEPT;
        for (int i = 0; i < week; ++i) {
            repay = repay.add(repay.multiply(INTEREST)).setScale(-3,
                    BigDecimal.ROUND_CEILING);
        }
        s.close();
        System.out.println(repay.toPlainString());
    }
}