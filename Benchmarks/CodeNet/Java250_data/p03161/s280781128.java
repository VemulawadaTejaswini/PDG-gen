
import java.util.*;

public class Main {

    public static Scanner in = new Scanner(System.in);
    public static int n = 0, k = 0;
    public static int[] h = new int[100001];
    public static long[] dp = new long[100001];
    public final static long oo = 10000000000l;

    public static long solve(int idx) {
        if (idx == n - 1) {
            return 0;
        } else {
            if (dp[idx] == -1) {
                long min = oo;
                for (int i = 1; i <= k; i++) {
                    if (i + idx < n) {
                        min = Math.min(min, solve(idx + i) + Math.abs(h[idx] - h[idx + i]));
                    }
                }
                return dp[idx] = min;
            } else {
                return dp[idx];
            }
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100001; i++) {
            dp[i] = -1;
        }
        n = in.nextInt();
        k = in.nextInt();
        for (int i = 0; i < n; i++) {
            h[i] = in.nextInt();
        }
        System.out.println(solve(0));
    }

}
