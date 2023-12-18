import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long max = (long) Math.pow(10, 18);
        BigInteger maxb = new BigInteger(String.valueOf(max));
        int n = Integer.parseInt(sc.next());
        long[] a = new long[n];
        BigInteger ans = new BigInteger(String.valueOf(1));
        for (int i = 0; i < n; i++) {
            long temp = Long.parseLong(sc.next());
            if (temp == 0) {
                System.out.println(0);
                return;
            }
            a[i] = temp;
        }
        for (int i = 0; i < n; i++) {
            ans = ans.multiply(BigInteger.valueOf(a[i]));
            if (ans.compareTo(maxb) > 0) {
                System.out.println(-1);
                return;
            }
        }
        System.out.println(ans);
    }
}