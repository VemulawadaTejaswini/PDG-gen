import java.math.BigInteger;
import java.util.*;
import java.util.Scanner;

class Main {
    static final long limit = 1000000000;

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        BigInteger S = new BigInteger(sc.next());
        BigInteger b = BigInteger.valueOf(1000000000);
        BigInteger[] sov = S.divideAndRemainder(b);
        System.err.println(Arrays.toString(sov));
        BigInteger x = b.subtract(sov[1]).mod(b);
        BigInteger y = S.add(x).divide(b);
        System.out.println("0 0 1000000000 1 " + x + " " + y);
    }
}