import java.io.BufferedInputStream;
import java.math.BigInteger;
import java.util.*;

class Main {

    public static void main(String args[]) {
        Scanner cin = new Scanner(new BufferedInputStream(System.in));
        int T;
        while (cin.hasNext()) {
            BigInteger ans = BigInteger.valueOf(1);
            T = cin.nextInt();
            BigInteger tmp;
            for (int i = 0; i < T; i++) {
                tmp = cin.nextBigInteger();
                //System.out.println(ans.multiply(tmp));
                ans = ans.multiply(tmp).divide(ans.gcd(tmp));
            }
            System.out.println(ans);
        }

    }
}