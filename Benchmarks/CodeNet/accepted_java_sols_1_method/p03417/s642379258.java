import java.util.*;
import java.math.BigInteger;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        long m = sc.nextInt();
        if (n < 2 || m < 2) {
            if (n == 1 && m == 1) {
                System.out.println(1);
            } else {
                long l = Math.max(n, m);
                System.out.println(l - 2);
            }
        } else {
            BigInteger bign = new BigInteger("0");
            BigInteger bigm = new BigInteger("0");
            BigInteger ans = new BigInteger("0");
            bign = BigInteger.valueOf(n - 2);
            bigm = BigInteger.valueOf(m - 2);
            ans = bign.multiply(bigm);
            System.out.println(ans);
        }
    }
}
