import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            int H = sc.nextInt();
            int W = sc.nextInt();
            char[][] S = new char[H][];
            for (int i = 0; i < H; i++) {
                S[i] = sc.next().toCharArray();
            }

            int max = 0;

            for (int h = 0; h < H; h++) {
                for (int w = 0; w < W; w++) {
                    if (S[h][w] == '#') {
                        continue;
                    }

                    int[][] D = new int[H][W];
                    for (int i = 0; i < H; i++) {
                        Arrays.fill(D[i], Integer.MAX_VALUE);
                    }
                    D[h][w] = 0;

                    while (true) {
                        boolean update = false;

                        for (int i = 0; i < H; i++) {
                            for (int j = 0; j < W; j++) {
                                if (D[i][j] == Integer.MAX_VALUE) {
                                    continue;
                                }

                                if (i > 0 && S[i - 1][j] == '.') {
                                    if (D[i - 1][j] > D[i][j] + 1) {
                                        D[i - 1][j] = D[i][j] + 1;
                                        update = true;
                                    }
                                }

                                if (i < H - 1 && S[i + 1][j] == '.') {
                                    if (D[i + 1][j] > D[i][j] + 1) {
                                        D[i + 1][j] = D[i][j] + 1;
                                        update = true;
                                    }
                                }

                                if (j > 0 && S[i][j - 1] == '.') {
                                    if (D[i][j - 1] > D[i][j] + 1) {
                                        D[i][j - 1] = D[i][j] + 1;
                                        update = true;
                                    }
                                }

                                if (j < W - 1 && S[i][j + 1] == '.') {
                                    if (D[i][j + 1] > D[i][j] + 1) {
                                        D[i][j + 1] = D[i][j] + 1;
                                        update = true;
                                    }
                                }
                            }
                        }

                        if (!update) {
                            break;
                        }
                    }

                    for (int i = 0; i < H; i++) {
                        for (int j = 0; j < W; j++) {
                            if (D[i][j] != Integer.MAX_VALUE) {
                                max = Math.max(max, D[i][j]);
                            }
                        }
                    }
                }
            }

            System.out.println(max);
        }
    }

}
