import java.util.*;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // Input
            int N = Integer.parseInt(sc.next());
            int M = Integer.parseInt(sc.next());
            int K = Integer.parseInt(sc.next());
            long[] a = new long[N];
            long[] b = new long[M];
            for (int i = 0; i < N; i++) {
                a[i] = Long.parseLong(sc.next());
                if (i != 0) a[i] += a[i - 1];
            }
            for (int i = 0; i < M; i++) {
                b[i] = Long.parseLong(sc.next());
                if (i != 0) b[i] += b[i - 1];
            }

            // Calc
            int bi = M - 1, max = 0;
            for (int i = 0; i < N; i++) {
                for (int j = bi; j >= 0; j--) {
                    bi = j;
                    if (a[i] + b[j] <= K) {
                        int total = (i + 1) + (j + 1);
                        max = Math.max(max, total);
                        break;
                    }
                }
            }
            System.out.println(max);
        }
    }
}