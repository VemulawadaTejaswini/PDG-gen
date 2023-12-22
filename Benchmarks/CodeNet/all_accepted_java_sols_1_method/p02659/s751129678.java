import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {

    public static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = Long.parseLong(sc.next());
        String b = sc.next();
        BigDecimal A = new BigDecimal(a);
        BigDecimal B = new BigDecimal(b);
        BigDecimal c = A.multiply(B);
        System.out.println(c.setScale(0, RoundingMode.DOWN));
    }
}