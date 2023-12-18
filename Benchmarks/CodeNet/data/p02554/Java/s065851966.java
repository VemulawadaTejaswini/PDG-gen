import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int mod = 1000000007;
        long sum = (2 * pow(9, n, mod)) % mod;
        long part = sum - pow(8, n, mod);
        if (part < 0) part += mod;
        long ans = pow(10, n, mod) - part;
        System.out.println(ans < 0 ? ans + mod : ans);
    }

    static long pow(int x, int y, long mod) {
        if (y == 0) return 1L;
        long res = pow(x, y / 2, mod);
        if (y % 2 == 1) {
            return (res * res * x) % mod;
        }
        return (res * res) % mod;
    }
}