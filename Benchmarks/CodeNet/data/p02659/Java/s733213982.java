import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String... args) {
        Scanner scan = new Scanner(System.in);
        long A = scan.nextLong();
        float B = scan.nextFloat();
        BigDecimal a = BigDecimal.valueOf(198);
        BigDecimal b = BigDecimal.valueOf(1.10);
        System.out.println(a.multiply(b).longValue());
    }
}
