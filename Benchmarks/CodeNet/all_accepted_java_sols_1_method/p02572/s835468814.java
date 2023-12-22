import java.util.*;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            long MOD = 1000000007L;

            // in
            int N = Integer.parseInt(sc.next());
            long A[] = new long[N];
            long Ac[] = new long[N];
            for (int i = 0; i < N; i++) {
                A[i] = Integer.parseInt(sc.next());
                if (i == 0) {
                    Ac[i] = A[i];
                } else {
                    Ac[i] = A[i] + Ac[i - 1];
                }
            }

            // solve
            long sum = 0;
            for (int i = N - 1; i > 0; i--) {
                sum += (A[i] % MOD) * (Ac[i - 1] % MOD) % MOD;
            }
            sum %= MOD;
            System.out.println(sum);
        }
    }
}