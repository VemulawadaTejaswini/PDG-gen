import java.util.*;
import sun.misc.Unsafe;
import java.lang.reflect.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Field f = Unsafe.class.getDeclaredField("theUnsafe");
        f.setAccessible(true);
        Unsafe unsafe = (Unsafe) f.get(null);

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        for (int i=0; i<n; i++) {
            a[i] = sc.nextInt();
        }

        long[][] dp = new long[n][n];
        for (int i=0; i<n; i++) {
            dp[i][i] = a[i];
        }

        for (int i = n - 2; i > -1; i--) {
            for (int j = i + 1; j < n; j++) {
                dp[i][j] = Math.max(a[i] - dp[i + 1][j], a[j] - dp[i][j - 1]);
            }
        }
        System.out.println(dp[0][n - 1]);
    }
}