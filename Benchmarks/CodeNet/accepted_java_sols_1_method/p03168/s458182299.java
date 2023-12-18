import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double dp[] = new double[n + 1];
        dp[0] = 1;
        for(int coin = 0; coin < n; coin++) {
            double p = sc.nextDouble();
            for(int i = coin + 1; i >= 0; i--) {
                dp[i] = ((i == 0) ? 0 : dp[i - 1] * p) + (dp[i] * (1 - p));
            }
        }
        double ans = 0;
        for(int heads = 0; heads <= n; heads++) {
            int tails = n - heads;
            if(heads > tails) {
                ans += dp[heads];
            }
        }
        System.out.println(ans);
    }
}
