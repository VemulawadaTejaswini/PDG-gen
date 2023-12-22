import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            BigInteger A = new BigInteger(scanner.next());
            BigInteger B = new BigInteger(scanner.next());
            BigInteger C = new BigInteger(scanner.next());
            BigInteger D = new BigInteger(scanner.next());

            BigInteger A_1 = A.subtract(BigInteger.ONE);
            BigInteger CD = lcm(C, D);

            BigInteger divide_C1 = A_1.divide(C);
            BigInteger divide_D1 = A_1.divide(D);
            BigInteger divide_CD1 = A_1.divide(CD);

            BigInteger divide_C2 = B.divide(C);
            BigInteger divide_D2 = B.divide(D);
            BigInteger divide_CD2 = B.divide(CD);

            BigInteger before_A = divide_C1.add(divide_D1).subtract(divide_CD1);
            BigInteger to_B = divide_C2.add(divide_D2).subtract(divide_CD2);

            System.out.println(B.subtract(A).add(BigInteger.ONE).subtract(to_B.subtract(before_A)));
        }
    }

    private static BigInteger lcm(BigInteger c, BigInteger d) {
        return c.multiply(d).divide(gcd(c, d));
    }

    private static BigInteger gcd(BigInteger c, BigInteger d) {
        if (c.compareTo(d) < 0) {
            return gcd(d, c);
        }
        if (d.equals(BigInteger.ZERO)) {
            return c;
        }
        return gcd(d, c.divideAndRemainder(d)[1]);
    }

}
