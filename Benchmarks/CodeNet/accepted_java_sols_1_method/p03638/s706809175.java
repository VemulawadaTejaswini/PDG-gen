import java.util.*;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        int N = sc.nextInt();

        int[] a = new int[N + 1];
        for (int i = 1; i < N + 1; i++) {
            a[i] = sc.nextInt();
        }

        int[][] ans = new int[H][W];
        int aIndex = 1;
        for (int h = 0; h < H; h++) {
            if (h % 2 == 0) {
                int w = 0;

                while (w < W) {
                    int tmpW = a[aIndex];

                    boolean next = true;
                    if (w + tmpW > W) {
                        tmpW = W - w;
                        a[aIndex] -= tmpW;
                        next = false;
                    }

                    for (int j = w; j < w + tmpW; j++) {
                        ans[h][j] = aIndex;
                    }

                    w += tmpW;
                    if (next) {
                        aIndex++;
                    }
                }
            } else {
                int w = W;

                while (w > 0) {
                    int tmpW = a[aIndex];

                    boolean next = true;
                    if (w - tmpW < 0) {
                        tmpW = w;
                        a[aIndex] -= tmpW;
                        next = false;
                    }

                    for (int j = w - 1; j >= w - tmpW; j--) {
                        ans[h][j] = aIndex;
                    }

                    w -= tmpW;
                    if (next) {
                        aIndex++;
                    }
                }
            }
        }

        for (int h = 0; h < H; h++) {
            for (int w = 0; w < W; w++) {
                out.print(ans[h][w]);
                if (w != W - 1) {
                    out.print(" ");
                }
            }
            out.println();
        }
    }
}