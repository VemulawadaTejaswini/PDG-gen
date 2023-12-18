import java.util.*;
import java.math.BigInteger;

class Main {

    static void solve (BigInteger a, BigInteger b, int n) {
        int result = 0;

        for(int i = 1; i <= n; i++) {
            a = a.multiply(BigInteger.TEN);
            result += a.divide(b).mod(BigInteger.TEN).intValue();
        }


        System.out.println(result);
    }

    public static void main (String [] args) {

        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()) {
            BigInteger a = new BigInteger(sc.next());
            BigInteger b = new BigInteger(sc.next());
            int n = sc.nextInt();

            solve(a, b, n);
        }

    }
}