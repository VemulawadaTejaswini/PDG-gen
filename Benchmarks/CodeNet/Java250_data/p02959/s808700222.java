import java.util.*;

public class Main {

    long INF = Long.MAX_VALUE;
    long[] dp;
    long n;
    long S;

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] A = new long[N + 1];
        long[] B = new long[N];
        long ans = 0;
        for (int i = 0; i <= N; i++) {
            A[i] = sc.nextLong();
        }
        for (int i = 0; i < N; i++) {
            B[i] = sc.nextLong();
        }
        for (int i = 0; i <= N; i++) {
            if (i == 0) {
                if (B[i] >= A[i]) {
                    ans += A[i];
                    B[i] -= A[i];
                } else {
                    ans += B[i];
                    B[i] = 0;
                }
                continue;
            }
            if (i == N) {
                if (B[i - 1] >= A[i]) {
                    ans += A[i];
                } else {
                    ans += B[i - 1];
                }
                continue;
            }
            A[i] -= B[i - 1];
            if (A[i] < 0) {
                ans += (B[i - 1] + A[i]);
                A[i] = 0;
                continue;
            }
            ans += B[i - 1];
            A[i] -= B[i];
            if (A[i] < 0) {
                ans += (B[i] + A[i]);
                B[i] -= ((B[i] + A[i]));
                A[i] = 0;
                continue;
            }
            ans += B[i];
            B[i] = 0;
        }
        System.out.println(ans);
    }

    int gcd(int m, int n) {
        if (m < n) {
            return gcd(n, m);
        }
        if (n == 0) {
            return m;
        }
        return gcd(n, m % n);
    }
}
