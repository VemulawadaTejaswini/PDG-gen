import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        BigInteger N = BigInteger.valueOf(n);

        if (n < 2) {
            System.out.println(0);
            return;
        }

        BigInteger mod = BigInteger.valueOf(10).pow(9).add(BigInteger.valueOf(7));
        // n * (n-1) * 10^n
        BigInteger result = N.multiply(N.subtract(BigInteger.valueOf(1))).multiply(BigInteger.valueOf(10).pow(n-2)).mod(mod);

        System.out.println(result);
    }
}