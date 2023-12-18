import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] stones = new int[n];
        for(int i=0; i<n; i++) stones[i] = scanner.nextInt();
        int[] dp = new int[n];
        for(int i=1; i<n; i++) {
            dp[i] = dp[i - 1] + Math.abs(stones[i] - stones[i - 1]);
            for(int j=2; j<=k && i-j >= 0; j++)
                dp[i] = Math.min(dp[i], dp[i - j] + Math.abs(stones[i] - stones[i - j]));
        }
        System.out.println(dp[n-1]);

    }

}
