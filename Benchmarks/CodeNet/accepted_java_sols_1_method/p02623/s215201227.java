import java.util.*;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // Input
            int N = Integer.parseInt(sc.next());
            int M = Integer.parseInt(sc.next());
            int K = Integer.parseInt(sc.next());
            long[] a = new long[N + 1];
            long[] b = new long[M + 1];
            for (int i = 1; i <= N; i++) {
                a[i] = Long.parseLong(sc.next());
                a[i] += a[i - 1];
            }
            for (int i = 1; i <= M; i++) {
                b[i] = Long.parseLong(sc.next());
                b[i] += b[i - 1];
            }

            // Calc
            int bi = M, max = 0;
            for (int i = 0; i <= N; i++) {
                for (int j = bi; j >= 0; j--) {
                    bi = j;
                    if (a[i] + b[j] <= K) {
                        int total = i + j;
                        max = Math.max(max, total);
                        break;
                    }
                }
            }
            System.out.println(max);
        }
    }
}