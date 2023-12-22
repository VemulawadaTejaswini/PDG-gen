import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long d = sc.nextLong();

        BigInteger ac = BigInteger.valueOf(a).multiply(BigInteger.valueOf(c));
        BigInteger ad = BigInteger.valueOf(a).multiply(BigInteger.valueOf(d));

        BigInteger result1 = ac.max(ad);

        BigInteger bc = BigInteger.valueOf(b).multiply(BigInteger.valueOf(c));
        BigInteger bd = BigInteger.valueOf(b).multiply(BigInteger.valueOf(d));

        BigInteger result2 = bc.max(bd);

        System.out.println(result1.max(result2));

    }
}