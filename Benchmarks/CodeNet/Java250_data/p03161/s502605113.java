import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] height = new int[n];
        for(int i = 0; i < n; i++){
            height[i] = scanner.nextInt();
        }
        System.out.println(new Main().f(n, k, height));
    }

    public int f(int n, int k, int[] height) {
        int[] dp = new int[n];
        if(n <= 1)
            return 0;
        for(int i = 1; i < n; i++){
            dp[i] = Integer.MAX_VALUE;
            for(int j = 1; j <= k && i - j >= 0; j++){
                dp[i] = Math.min(dp[i], dp[i-j] + Math.abs(height[i] - height[i-j]));
            }
        }
        return dp[n-1];
    }
}
