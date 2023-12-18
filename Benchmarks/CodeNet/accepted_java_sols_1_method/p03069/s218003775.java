import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner std = new Scanner(System.in);
        int n = std.nextInt();
        String s = std.next();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (c == '#') {
                a[i] = 1;
            } else {
                a[i] = 0;
            }
        }

        long[] dp = new long[n+1];
        for (int i = 0; i < n; i++) {
            dp[i+1] += dp[i] + a[i];
        }

        long min = Long.MAX_VALUE;
        for (int i = 0; i <= n; i++) {
            long left = dp[i];
            long right = (n - i) - (dp[n] - dp[i]);
            min = Math.min(left + right, min);
        }

        System.out.println(min);
    }
}
