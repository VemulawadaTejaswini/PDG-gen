import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("[a-zA-Z.\n]+");
        BigInteger r = BigInteger.ZERO;
        while (sc.hasNextBigInteger())
            r = r.add(sc.nextBigInteger());
        System.out.println(r.toString());
    }
}