import java.util.*;

public class Main{
    void solve(){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int[] h = new int[n];
        for(int i = 0; i < n; i++) h[i] = scan.nextInt();
        int[] dp = new int[n];
        dp[1] = Math.abs(h[1] - h[0]);
        for(int i = 2; i < n; i++){
            int min = Integer.MAX_VALUE;
            for(int j = i - 1; j >= Math.max(0, i - k); j--){
                min = Math.min(min, Math.abs(h[i] - h[j]) + dp[j]);
            }
            dp[i] = min;
        }
        System.out.println(dp[n - 1]);
    }
    
    public static void main(String[] args){
        new Main().solve();
    }
}
