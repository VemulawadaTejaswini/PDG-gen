import java.util.*;

public class Main{
    static long MOD = 1000000007;
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    long N = scan.nextInt();
    scan.close();

    long ans = modpow(10,N,MOD);
    ans -= ((2 * modpow(9,N,MOD)) % MOD);
    ans += modpow(8,N,MOD);
    System.out.println(ans % MOD);
}

    static long modpow(long base, long frac, long mod) {
        long ret = 1;
        
        for(;frac > 0; base = base * base % mod, frac >>= 1){
            if((frac & 1) != 0) ret = ret * base % mod;
        }

        return ret;
    }
}
