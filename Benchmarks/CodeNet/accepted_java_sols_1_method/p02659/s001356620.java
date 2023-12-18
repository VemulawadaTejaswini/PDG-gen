import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);

        long A = scanner.nextLong();
        double B = scanner.nextDouble();

        BigDecimal a = new BigDecimal(String.valueOf(A));
        BigDecimal b = new BigDecimal(String.valueOf(B));

        System.out.println(a.multiply(b).longValue());
    }
}
