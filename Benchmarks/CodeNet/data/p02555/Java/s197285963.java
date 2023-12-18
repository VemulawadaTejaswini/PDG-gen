
import java.util.Scanner;

public class Main {

    static int mod = (int)1e9 + 7;

    static int max = 1000000 * 2;
    static long[] fact = new long[max];
    static long[] modinv = new long[max];
    static long[] factinv = new long[max];

    public static void initCombi() {
        fact[0] = 1;
        fact[1] = 1;
        modinv[1] = 1;
        factinv[0] = 1;
        factinv[1] = 1;

        for (int i = 2; i < max; i++) {
            fact[i] = fact[i - 1] * i % mod;
            modinv[i] = mod - modinv[mod % i] * (mod / i) % mod;
            factinv[i] = factinv[i - 1] * modinv[i] % mod;
        }
    }

    public static long combi(int n, int k) {
        return fact[n] * (factinv[k] * factinv[n - k] % mod) % mod;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int s = Integer.parseInt(scan.next());
        scan.close();

        initCombi();

        long ans = 0;
        int i = 0;
        s -= 3;
        while (s >= i) {
            ans += combi(s, i);
            ans %= mod;
            s -= 2;
            i += 1;
        }
        System.out.println(ans);
    }
}
