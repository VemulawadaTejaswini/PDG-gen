import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BigInteger A = new BigInteger(sc.next()).subtract(BigInteger.ONE);
        BigInteger B = new BigInteger(sc.next());
        BigInteger C = new BigInteger(sc.next());
        BigInteger D = new BigInteger(sc.next());

        BigInteger lcm = C.multiply(D).divide(gcd(C, D));
        BigInteger x = B.divide(C).subtract(A.divide(C));
        BigInteger y = B.divide(D).subtract(A.divide(D));
        BigInteger z = B.divide(lcm).subtract(A.divide(lcm));

        System.out.println(B.subtract(A).subtract(x.add(y).subtract(z)));
    }

    public static BigInteger gcd(BigInteger m, BigInteger n)
    {
        BigInteger temp;
        while (!m.mod(n).equals(BigInteger.ZERO))
        {
            temp = n;
            n = m.mod(n);
            m = temp;
        }
        return n;
    }
}