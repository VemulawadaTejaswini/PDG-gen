import java.util.Scanner;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        int n = scanner.nextInt();
        double[] arr = new double[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextDouble();
        }
        double[] dp = new double[n+1];// probability for i number of heads
        dp[0]=1.0;
        for(int coin=0;coin<n;coin++){
            for (int i = coin+1; i>=0; i--) {
                dp[i] = (i==0 ? 0 : dp[i-1]*arr[coin]) + dp[i]*(1d-arr[coin]);
            }
        }
        double res=0;
        for(int i=(n+1)/2;i<=n;i++)
            res +=dp[i];

        System.out.println(res);
    }
}
