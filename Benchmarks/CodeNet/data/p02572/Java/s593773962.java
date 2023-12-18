import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mod = 1000000007;
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(sc.next());
        }

        long result = 0;
        int x = 0;
        for (int i = 0; i < a.length; i++) {
            result += ((long) a[i] % mod) * (x % mod);
            result %= mod;
            x += a[i] % mod;
        }
        System.out.println(result);
    }
}