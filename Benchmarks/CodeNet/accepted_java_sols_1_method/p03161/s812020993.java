import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] H = new int[n + k + 10];
        for(int i = 0; i < n; i++) H[i] = Integer.parseInt(sc.next());
        int[] dp = new int[n + k + 10];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        for(int i = 0; i < n; i++) {
            for(int j = 1; j <= k; j++) {
                dp[i + j] = Math.min(dp[i + j], dp[i] + Math.abs(H[i] - H[i + j]));
            }
        }
        System.out.println(dp[n - 1]);
    }
}
