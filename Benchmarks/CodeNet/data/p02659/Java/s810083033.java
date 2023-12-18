import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long A = scanner.nextLong();

        double B = scanner.nextDouble();

        scanner.close();

        System.out.println(BigInteger.valueOf((long)Math.floor(A*B)).toString());
    }
}
