import java.io.*;
import java.util.*;

public class Main {
    static PrintWriter out = new PrintWriter(System.out);
    static Scanner sc = new Scanner(System.in);
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    long mod = 998244353;
    long inv2 =1;
    public static void main(String[] args) throws IOException {
        Main main = new Main();
        main.solve();
//        out.println(main.solve());
        out.flush();
    }
    void solve() throws IOException {
        int n = sc.nextInt(), S = sc.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++) a[i] = sc.nextInt();
        long[][] dp = new long[n][S+1];
        inv2 = power(2, mod-2);
        if(a[0]<=S) dp[0][a[0]] = power(2, n-1);
        for(int i=1; i<n; i++){
            int cur = a[i];
            for(int j=1; j<=S; j++) dp[i][j] = dp[i-1][j];
            if(cur<=S){
                dp[i][cur] = (dp[i][cur]+power(2,n-1))%mod;
            }
            for(int j=cur+1; j<=S; j++){
                dp[i][j] += dp[i-1][j-cur]*inv2%mod;
                dp[i][j] %= mod;
            }
        }
        long ans = dp[n-1][S];
        out.println(ans);
    }
    long power(long base, long p){
        long ans = 1;
        while(p>0){
            if(p%2==1) ans = ans*base%mod;
            base = base*base%mod;
            p /= 2;
        }
        return ans;
    }
}