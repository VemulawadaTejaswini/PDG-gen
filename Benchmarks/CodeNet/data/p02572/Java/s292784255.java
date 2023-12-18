import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            final long mod = (long) (1e9 + 7);

            int N = sc.nextInt();
            long[] A = new long[N];
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }

            long[] cumsum = new long[N + 1];
            for (int i = 0; i < N; i++) {
                cumsum[N - 1 - i] += cumsum[N - i] + A[N - 1 - i];
                cumsum[N - 1 - i] %= mod;
            }

            long sum = 0;
            for (int i = 0; i < N; i++) {
                sum += A[i] * cumsum[i + 1];
                sum %= mod;
            }

            System.out.println(sum);
        }
    }
}
