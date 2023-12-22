import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }
    
    // 変数一覧
    int n;
    int k;
    int[] h;
    long dp[];

    public void run() {
        // 入力情報取得
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        h = new int[n];
        for (int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
        }
        sc.close();

        // 解答処理
        solve();
    }
    
    private void solve() {
        dp = new long[n];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        for (int i = 1; i < n; i++) {
            dp(i);            
        }
        System.out.println(dp[n-1]);
    }
    
    private void dp(int cur) {
        int i=0;
        if (cur <= k) {
            i = 0;
        } else {
            i = cur - k;
        }
        for(; i < cur; i++){
            dp[cur] = Math.min(dp[i] + Math.abs(h[i] - h[cur]), dp[cur]);
        }
    }
}