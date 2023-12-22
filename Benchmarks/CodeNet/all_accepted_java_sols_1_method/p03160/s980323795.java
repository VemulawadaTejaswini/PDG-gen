import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[] ary = new int[n];
        for (int i = 0; i < n; i++) {
            ary[i] = Integer.parseInt(sc.next());
        }
        long[] dp = new long[n];
        Arrays.fill(dp, Long.MAX_VALUE);
        dp[0] = 0;
        for (int i = 1; i < n; i++) {
            if (i == 1) {
                dp[i] = Math.abs(ary[i] - ary[i - 1]);
            } else {
                dp[i] = Math.min(dp[i], dp[i - 1] + Math.abs(ary[i] - ary[i - 1]));
                dp[i] = Math.min(dp[i], dp[i - 2] + Math.abs(ary[i] - ary[i - 2]));
            }
        }
        System.out.println(dp[n - 1]);
    }
}