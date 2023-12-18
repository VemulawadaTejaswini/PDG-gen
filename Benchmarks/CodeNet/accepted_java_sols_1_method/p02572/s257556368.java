import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mod = 1000000007;
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[] a = new int[n];
        long[] b = new long[n + 1];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(sc.next());
            b[i + 1] = b[i] + a[i];
        }
        long result = 0;
        for (int i = 0; i < n; i++) {
            long sum = (b[n] - b[i + 1]) % mod;

            result = (result + ((long) a[i] * sum) % mod) % mod;
        }
        System.out.println(result);
    }
}