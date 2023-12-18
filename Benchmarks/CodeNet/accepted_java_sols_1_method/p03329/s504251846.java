import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] p = {1, 6, 9, 36, 81, 216, 729, 1296, 6561, 7776, 46656, 59049};
        int[] dp = new int[n+1];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < p.length; j++) {
                if (i+p[j] > n) {
                    break;
                }

                if (dp[i+p[j]] == 0) {
                    dp[i+p[j]] = dp[i]+1;
                } else {
                    dp[i+p[j]] = Math.min(dp[i+p[j]], dp[i]+1);
                }
            }
        }

        System.out.println(dp[n]);
    }
}
