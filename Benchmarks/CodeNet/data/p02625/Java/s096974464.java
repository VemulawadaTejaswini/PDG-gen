import java.util.*;

public class Main {

    static long mod = 1000000007;

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        init(500001);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int l = m - n;

        long res = perm(m, n) * perm(m, n) % mod;
        for(int i=1; i<=n; i++) {
            long a = conv(n, i) * perm(m, i);
            a %= mod;
            a *= perm(m-i, n-i);
            a %= mod;
            a *= perm(m-i, n-i);
            a %= mod;
            if(i % 2 == 1) {
                res += mod - a;
            } else {
                res += a;
            }
            res %= mod;
        }


        System.out.println(res);
    }



    static long[] fac;
    static long[] finv;
    static long[] inv;
    static void init(int max) {
        fac = new long[max];
        finv = new long[max];
        inv = new long[max];
        fac[0] = fac[1] = 1;
        finv[0] = finv[1] = 1;
        inv[1] = 1;
        for(int i=2; i<max; i++) {
            fac[i] = fac[i-1] * i % mod;
            inv[i] = mod - inv[(int)mod%i] * (mod / i) % mod;
            finv[i] = finv[i-1] * inv[i] % mod;
        }
    }
    static long conv(int n, int k) {
        if(n<k || n<0 || k<0) return 0;
        return perm(n, k) * finv[k] % mod;
    }
    static long perm(int n, int k) {
        if(n<k || n<0 || k<0) return 0;
        return fac[n] * finv[n-k] % mod;
    }

}