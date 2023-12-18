import java.math.BigInteger;
import java.math.MathContext;
import java.util.*;

public class Main {

    public static void main(String args[]) {


        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        BigInteger sum = new BigInteger("1");

        for (int i= 0; i< n; i++) {

            long x = scan.nextLong();
            BigInteger x2 = BigInteger.valueOf(x);
            sum = sum.multiply(x2);
        }


        BigInteger a = new BigInteger("1000000000000000000");

        if (sum.compareTo(a) == 1) {
            System.out.println(-1);
        }
        else {
            System.out.println(sum);
        }


    }


}