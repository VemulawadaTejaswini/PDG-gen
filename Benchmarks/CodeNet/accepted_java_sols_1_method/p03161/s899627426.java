import java.util.*;

public class Main {

      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int[] h = new int[n];
        for (int i = 0; i < n; i++) {
            h[i] = scanner.nextInt();
        }

        int[] dp = new int[h.length];
        dp[0] = 0;

        for (int i = 1; i < h.length; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = k; j > 0; j--) {
                int x = i - j;
                if (x >= 0) {
                    int vi = Math.abs(h[i] - h[x]) + dp[x];
                    min = Math.min(vi, min);
                }
            }
            dp[i] = min;
        }

        System.out.println(dp[dp.length - 1]);
    }

}