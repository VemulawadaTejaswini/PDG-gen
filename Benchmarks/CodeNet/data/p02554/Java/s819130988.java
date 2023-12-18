import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        long n = sc.nextInt();
        long ans = power(10,n) - power(9, n) - power(9, n) + power(8, n);
        ans %= 1000000007;
        ans = (ans + 1000000007) % 1000000007;

        System.out.println(ans);
    }

    static long power(long x, long n, int mod) {
        if (n == 0) {
            return 1;
        }
        long result = power(x, n / 2, mod);
        result = result * result % mod;
        if (n % 2 == 1) {
            result = result * x % mod;
        }
        return result;
    }

    static long power(long x, long n) {
        return power(x, n, 1000000007);
    }
}
