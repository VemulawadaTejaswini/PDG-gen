import java.util.*;

public class Main{
    final long MOD = 1000000007;
    void solve(){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println((pow(10, n) - 2 * pow(9, n) % MOD + pow(8, n)) % MOD);
    }

    long pow(long x, long n){
        if(n == 0) return 1;
        long ret = pow(x * x % MOD, n / 2);
        if((n & 1) == 1) ret = ret * x % MOD;
        return ret;
    }

    public static void main(String[] args){
        new Main().solve();
    }
}
