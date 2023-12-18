import java.util.*;
import java.math.*;

public class Main {
    private static long gcdThing(long a, long b) {
        BigInteger b1 = BigInteger.valueOf(a);
        BigInteger b2 = BigInteger.valueOf(b);
        BigInteger gcd = b1.gcd(b2);
        return gcd.longValue();
    }
    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            while (sc.hasNextLong()) {
                long a = sc.nextLong();
                long b = sc.nextLong();
                long c = gcdThing(a,b);
                System.out.printf("%d %d\n",c,a/c*b);
            }
        }
    }
}
