import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            long K = sc.nextInt();
            long[] A = new long[N];
            long[] B = new long[M];
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }
            for (int i = 0; i < M; i++) {
                B[i] = sc.nextInt();
            }

            long[] sumA = new long[N + 1];
            for (int i = 0; i < N; i++) {
                sumA[i + 1] = sumA[i] + A[i];
            }
            long[] sumB = new long[M + 1];
            for (int i = 0; i < M; i++) {
                sumB[i + 1] = sumB[i] + B[i];
            }

            int max = 0;
            for (int i = 0; i < N + 1; i++) {
                if (K - sumA[i] >= 0) {
                    max = Math.max(max, i + index(K - sumA[i], sumB));
                }
            }

            System.out.println(max);
        }
    }

    static int index(long k, long[] v) {
        int l = 0;

        int r = v.length - 1;
        if (v[r] <= k) {
            return r;
        }

        for (; l + 1 < r;) {
            int m = (l + r) / 2;
            long vm = v[m];
            if (vm <= k) {
                l = m;
            } else {
                r = m;
            }
        }

        return l;
    }
}
