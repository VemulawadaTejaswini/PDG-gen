import java.math.BigDecimal;
import java.util.Scanner;
class Main {
    public static final BigDecimal DEPT = new BigDecimal(100000);
    public static final BigDecimal INTEREST = new BigDecimal("0.05");
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int week = Integer.parseInt(s.next());
        BigDecimal repay = DEPT;
        for (int i = 0; i < week; ++i) {
            repay = repay.add(repay.multiply(INTEREST)).setScale(-3,
                    BigDecimal.ROUND_CEILING);
        }
        s.close();
        System.out.println(repay.toPlainString());
    }
}