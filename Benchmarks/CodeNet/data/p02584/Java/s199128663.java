import java.math.BigInteger;
import java.util.*;
public class Main {
    public static void main(String args[]){
        //   System.out.print("Enter BigInteger Number to check prime: ");;
        Scanner in = new Scanner(System.in);
        BigInteger x = in.nextBigInteger();
        BigInteger k = in.nextBigInteger();
        BigInteger d = in.nextBigInteger();
        BigInteger mul = k.multiply(d);
        BigInteger mo = x.mod(d);

        x = x.abs();
//        System.out.println(mo) ;
//        System.out.println(mul);
        BigInteger two = BigInteger.valueOf(2);
        BigInteger zero = BigInteger.valueOf(0);
        if ( x.subtract(mul).compareTo(mo) >=0 )
        {
            System.out.println(x.subtract(mul)) ;
            return;
        }

        if ( mo.compareTo(zero) != 0 )
        {

            System.out.println( mo ) ;
            return;
        }

        if (k.mod( two).compareTo(zero) != 0  )
        {
            System.out.println(0) ;
            return;
        }
        System.out.println(d);

        in.close();
        // System.out.println(n.isProbablePrime(1) ? "prime" : "not prime");
    }
}