import java.util.*;
import java.io.*;
public class Main {
    static int INF = 1001001009;
    static Scanner sc = new Scanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    long mod = 1000000000+7;
    long[] inv, fac;
    public static void main(String[] args) throws Exception {
        // Your code here!
        Main main = new Main();
        main.solve();
//        long ans = main.solve();
//        out.println(ans);
//        main.solve();
        out.flush();
    }
    void solve() throws Exception{
        int k = sc.nextInt();
        String s = sc.next();
        int n = s.length();
        int maxn = n+k;
        inv = new long[maxn+1]; fac = new long[maxn+1];
        fac[0] = 1;
        for(int i=1; i<=maxn; i++) fac[i] = fac[i-1]*i%mod;
        inv[0] = 1;
        inv[maxn] = power(fac[maxn], mod-2);
        for(int i=maxn-1; i>0; i--) inv[i] = inv[i+1]*(i+1)%mod;
        long ans = 0, prev = 1L;
        for(int end = n; end<=maxn; end++){
            // the last char of s is on place end (1-based)
            long cur = prev*comb(end-1, n-1)%mod;
            long rest = maxn-end;
            cur = cur*power(26, rest)%mod;
            ans = (ans+cur)%mod;
            prev = prev*25%mod;
        }
        out.println(ans);
    }
    long comb(int n, int m){
        if(n<m) return 0;
        return fac[n]*inv[m]%mod*inv[n-m]%mod;
    }
    int paIn(String s){return Integer.parseInt(s);}
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