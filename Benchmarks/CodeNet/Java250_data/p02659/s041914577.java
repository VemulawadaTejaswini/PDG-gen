import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {
    public static void main(String... args) {
        Scanner scan = new Scanner(System.in);
        long A = scan.nextLong();
        double B = scan.nextDouble();
        BigDecimal a = BigDecimal.valueOf(A);
        BigDecimal b = BigDecimal.valueOf(B);
        System.out.println(a.multiply(b).setScale(0, RoundingMode.FLOOR));
    }
}
