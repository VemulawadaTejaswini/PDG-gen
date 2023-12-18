import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        int[] dp = new int[n];

        for (int i = 0; i < n; i++) {
            dp[i] = Integer.MAX_VALUE;
        }

        dp[0] = 0;

        for (int i = 1; i < n; ++i) {
            dp[i] = Math.min(dp[i], dp[i - 1] + Math.abs(array[i] - array[i - 1]));
            if (i > 1) dp[i] = Math.min(dp[i], dp[i - 2] + Math.abs(array[i] - array[i - 2]));
        }

        System.out.println(dp[n - 1]);

    }
}