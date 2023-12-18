import java.util.*;
import java.math.*;

public class Main {
    private static BigInteger comb( BigInteger n, BigInteger r ) {
        BigInteger sub = n.subtract(r);
        if ( r.compareTo(sub) > 0 )
            r = sub;
        BigInteger a = BigInteger.ONE;
        BigInteger b = BigInteger.ONE;
        while ( ! r.equals( BigInteger.ZERO ) ) {
            a = a.multiply(n);
            b = b.multiply(r);
            r = r.subtract( BigInteger.ONE );
            n = n.subtract( BigInteger.ONE );
        }
        return a.divide(b);
    }

    public static void main( String[] args ) {
        Scanner s = new Scanner( System.in );
        while ( s.hasNext() ) {
            BigInteger n = s.nextBigInteger();
            BigInteger m = s.nextBigInteger();
            BigInteger r = s.nextBigInteger();
            BigInteger nm = n.multiply(m);

            BigInteger a = n.add(r).subtract(BigInteger.ONE).subtract(nm);
            BigInteger b = r.subtract(nm);
            System.out.println( comb( a, b ) );
        }
    }
}