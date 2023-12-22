import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[n+1];
        for(int i=1;i<=n;i++){
            arr[i] = sc.nextInt();
        }

        int dp[] = new int[n+1];
        dp[1] = 0;
        
        for(int i=2;i<=n;i++){
            int ans = Integer.MAX_VALUE;
            int t = k;
            for(int j=i-1;j>=1 && t--> 0;j--){
                ans = Math.min(ans, Math.abs(arr[j]-arr[i]) + dp[j]);
            }
            dp[i] = ans;
        }

        System.out.println(dp[n]);

    }
}