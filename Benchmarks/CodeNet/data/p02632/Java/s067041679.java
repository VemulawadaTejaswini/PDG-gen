import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        char[] c = sc.next().toCharArray();


        long[] p26 = new long[2000001];
        long[] p25 = new long[2000001];
        p25[0] = 1;
        p26[0] = 1;
        for(int i=0; i<2000000; i++) {
            p25[i+1] = p25[i] * 25 % mod;
            p26[i+1] = p26[i] * 26 % mod;
        }
        init(2000001);

        long res = 0;
        int s = c.length;
        for(int i=s; i<=k+s; i++) {
            long add = conv(i-1, s-1) * p25[i-s];
            add %= mod;
            add *= p26[k+s-i];
            add %= mod;
            res += add;
            res %= mod;
        }

        System.out.println(res);

    }


    private static long mod = 1000000007;
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
        return fac[n] * (finv[k]*finv[n-k]%mod) % mod;
    }

}
