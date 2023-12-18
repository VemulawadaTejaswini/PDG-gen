import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();
            int[] A = new int[N];
            int[][] x = new int[N][];
            int[][] y = new int[N][];
            for (int n = 0; n < N; n++) {
                A[n] = in.nextInt();
                x[n] = new int[A[n]];
                y[n] = new int[A[n]];
                for (int a = 0; a < A[n]; a++) {
                    x[n][a] = in.nextInt() - 1;
                    y[n][a] = in.nextInt();
                }
            }

            int max = 0;
            maskLoop: for (int mask = 0; mask < (1 << N); mask++) {
                int mask2 = mask;
                for (int n = 0; n < N; n++) {
                    if ((mask & (1 << n)) == 0) {
                        continue;
                    }
                    for (int a = 0; a < A[n]; a++) {
                        if (y[n][a] == 0) {
                            mask2 &= -1 ^ (1 << x[n][a]);
                        }
                        if (y[n][a] == 1) {
                            if ((mask & (1 << x[n][a])) == 0) {
                                continue maskLoop;
                            }
                        }
                    }
                }

                if (mask2 == mask) {
                    max = Math.max(max, Integer.bitCount(mask));
                }
            }

            System.out.println(max);
        }
    }
}
