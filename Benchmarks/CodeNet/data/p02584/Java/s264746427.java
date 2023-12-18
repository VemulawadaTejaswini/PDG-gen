import java.math.BigDecimal;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long X = Math.abs(sc.nextLong());
        long K = sc.nextLong();
        long D = sc.nextLong();
        BigDecimal x = new BigDecimal(X);
        BigDecimal k = new BigDecimal(K);
        BigDecimal d = new BigDecimal(D);
        if (X == 0) {
            System.out.println(K%2 == 0 ? 0 : D);
            return;
        }
        if (k.multiply(d).compareTo(x) == -1) {
            System.out.println(X-D*K);
            return;
        } else {
            long near = X/D;
            K -= near;
            X -= D*near;
            System.out.println(K%2 == 0 ? X : Math.abs(X-D));
        }
    }
}