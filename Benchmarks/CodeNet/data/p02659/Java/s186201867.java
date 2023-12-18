import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long A = Long.parseLong(scanner.next());
        float B = Float.parseFloat(scanner.next());
        scanner.close();

        BigInteger num = BigInteger.valueOf(A);
        num = num.multiply(BigInteger.valueOf((long) (B * 100f)));
        num = num.divide(BigInteger.valueOf(100L));

        System.out.println(num.toString());
    }
}
