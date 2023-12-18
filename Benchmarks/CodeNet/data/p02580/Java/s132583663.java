import java.util.HashSet;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int H = sc.nextInt();
            int W = sc.nextInt();
            int M = sc.nextInt();
            int[] h = new int[M];
            int[] w = new int[M];
            HashSet<Long> set = new HashSet<>();
            for (int i = 0; i < M; i++) {
                h[i] = sc.nextInt() - 1;
                w[i] = sc.nextInt() - 1;
                set.add(v(h[i], w[i]));
            }

            int[] sumH = new int[H];
            int[] sumW = new int[W];
            for (int i = 0; i < M; i++) {
                sumH[h[i]]++;
                sumW[w[i]]++;
            }

            int maxH = 0;
            int maxH2 = 0;
            int maxW = 0;
            int maxW2 = 0;
            for (int h2 = 0; h2 < H; h2++) {
                if (sumH[h2] > maxH) {
                    maxH = sumH[h2];
                    maxH2 = h2;
                }
            }
            for (int w2 = 0; w2 < W; w2++) {
                if (sumW[w2] > maxW) {
                    maxW = sumW[w2];
                    maxW2 = w2;
                }
            }

            int max = 0;
            for (int i = 0; i < M; i++) {
                max = Math.max(max, sumH[h[i]] + sumW[w[i]] - 1);
            }
            for (int h2 = 0; h2 < H; h2++) {
                max = Math.max(max, sumH[h2] + sumW[maxW2] - (set.contains(v(h2, maxW2)) ? 1 : 0));
            }
            for (int w2 = 0; w2 < W; w2++) {
                max = Math.max(max, sumW[w2] + sumH[maxH2] - (set.contains(v(maxH2, w2)) ? 1 : 0));
            }
            System.out.println(max);
        }
    }

    private static long v(int r, int c) {
        return (((long) r) << 32) | c;
    }

}
