import java.util.*;

public class Main {
    static int MAX = 100;  // (1 ≦ k ≦ n ≦ 10^7 程度)
    static int MOD = 1000000007;
    static long[] fac;  // 階乗
    static long[] finv;
    static long[] inv;  // 逆元
    
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        // n = 5;
        
        long inv2 = 500000004;
        
        long[] array = new long[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextLong();
        }
        
        long parta = 0;
        for (int i = 0; i < n; i++) {
            parta += array[i];
            parta %= MOD;
        }
        parta = (parta * parta) % MOD;
        if (parta < 0) parta += MOD;
        // System.out.println(parta);
        
        long partb = 0;
        for (int i = 0; i < n; i++) {
            partb += (array[i] * array[i]) % MOD;
            partb %= MOD;
        }
        if (partb < 0) partb += MOD;
        // System.out.println(partb);
        
        long ans = 0;
        ans = parta - partb;
        if (ans < 0) ans += MOD;
        ans %= MOD;
        ans *= inv2;
        ans %= MOD;
        System.out.println(ans);
    }
    
    public static long modpow(long num, long n) {
        // ex. 3^10
        // 3^10 = 3^(0b1010)
        // = 3^8が1個 * 3^4が0個 * 3^2が1個 * 3^1が0個
        // (次の桁の値は(前の桁)^2になる)
        
        long res = 1;
        long digit = num;
        
        while (n > 0) {
            long lsb = n & 1;
            if (lsb == 1) {
                res *= digit;
                res %= MOD;
            }
            
            digit = digit * digit;
            digit %= MOD;
            n = n >> 1;
        }
        
        return res;
    }
}
