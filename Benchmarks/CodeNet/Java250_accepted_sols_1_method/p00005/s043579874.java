import java.util.*;
import java.lang.Math;
import java.math.BigInteger;

class Main {
    public static void main (String [] args) {

        Scanner sc = new Scanner(System.in);

        BigInteger a, b;

        while (true) {
            try {
               a = new BigInteger(sc.next());
               b = new BigInteger(sc.next());
            } catch (NoSuchElementException e) {
               break;
            }

            BigInteger g = a.gcd(b);
           System.out.printf("%d %d\n", g, a.divide(g).multiply(b)); 
        }
    }
}