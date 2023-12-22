import java.math.BigDecimal;
import java.util.*;
public class Main {
    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        final int n = sc.nextInt();
        final int k = sc.nextInt();
        Double d = 0.0;
        for (int i = 1; i <= n; i++) {
            double temp = (1.0d / n);
            int t = i;
            while (t < k) {
                t *= 2;
                temp /= 2;
            }
            d += temp;
        }
        System.out.print(BigDecimal.valueOf(d).toPlainString());
    }
}