import java.util.Scanner;

public class Main {
    private static final long MOD = 1000000007;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        if (Math.abs(N - M) > 1) {
            System.out.println(0);
            return;
        }
        long ans = 1;
        int n = N;
        int m = M;
        while (N > 0 || M > 0) {
            ans = (ans * Math.max(N, M)) % MOD;
            if (N >= M) {
                N--;
            } else {
                M--;
            }
        }
        if (n == m) {
            ans = (ans * 2) % MOD;
        }
        System.out.println(ans);
    }
}
