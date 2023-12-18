import java.util.Scanner;

class Main {
    static long factri[] = new long[1_000_000];
    static final long mod = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.close();
        if (Math.abs(n - m) >= 2) {
            System.out.println(0);
            return;
        }
        factri[0] = 0;
        factri[1] = 1;
        factri[2] = 2;
        for (int i = 3; i < n + 20; i++) {
            factri[i] = i * factri[i - 1];
            factri[i] %= mod;
        }
        long ans = factri[n] * factri[m] % mod;
        if (n == m) {
            ans *= 2;
            ans %= mod;
        }
        System.out.println(ans);

    }
}
