import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        long md = 1000000007l;

        long arr0or9 = (modpow(10, n, md) - modpow(8, n, md) + md) % md;
        long arr0 = (modpow(10, n, md) - modpow(9, n, md) + md) % md;
        long arr0and9 = (arr0 * 2 - arr0or9 + md) % md;
        System.out.println(arr0and9);

    }

    static long modpow(long a, long n, long mod) {
        long res = 1;
        while (n > 0) {
            if ((n & 1) == 1) {
                res = res * a % mod;
            }
            a = a * a % mod;
            n >>= 1;
        }
        return res;
    }
}
