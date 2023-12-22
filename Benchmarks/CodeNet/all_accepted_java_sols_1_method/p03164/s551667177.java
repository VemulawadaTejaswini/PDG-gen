import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int w = scanner.nextInt();
        int[] wt = new int[n];
        int[] p = new int[n];
        for (int i = 0; i < n; i++) {
            wt[i] = scanner.nextInt();
            p[i] = scanner.nextInt();
        }
        int sum=0;
        for(int i : p)
            sum +=i;
        long[] dp = new long[sum+1];
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[0]=0;
        for (int i = 0; i < n; i++) {
            for (int j =sum-p[i]; j >=0 ; j--) {
                dp[j+p[i]] = Math.min(dp[j+p[i]],dp[j]+wt[i]);
            }
        }
        long ans = 0;
        for (int i = sum; i >=0 ; i--) {
            if(dp[i]<=w){
                ans = Math.max(ans, i);

            }
        }
        System.out.println(ans);

    }
}
