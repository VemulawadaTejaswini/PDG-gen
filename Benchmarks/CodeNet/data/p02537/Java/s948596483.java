import java.util.*;

public class Main{
    void solve(){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++) a[i] = scan.nextInt();
        int[] dp = new int[n];
        dp[0] = 1;
        Arrays.fill(dp, 1);
        for(int i = 1; i < n; i++){
            int max = 1;
            for(int j = 0; j < i; j++){
                if(Math.abs(a[i] - a[j]) <= k){
                    max = Math.max(max, dp[j] + 1);
                }
            }
            dp[i] = max;
        }
        System.out.println(dp[n - 1]);
    }

    public static void main(String[] args){
        new Main().solve();
    }
}
