import java.util.*;

public class Main {

    static long mod = 1_000_000_007L;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long all = modPow(10L, n);
        long eight = modPow(8L, n);
        long nine = modPow(9L, n);
        long ans = (all - nine - nine + eight + mod + mod) % mod;
        System.out.println(ans);
        sc.close();

    }

    static public long modPow(long base, int exp) {
        long ret = 1L;
        while(exp > 0){
            if((exp & 1) == 1){
                ret = ret * base %mod;
            }
            base = base * base %mod;
            exp >>= 1;
        }
        return ret;
    }

}
