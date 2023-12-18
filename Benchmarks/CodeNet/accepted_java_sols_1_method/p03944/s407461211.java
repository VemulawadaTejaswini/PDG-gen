import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int W = in.nextInt();
            int H = in.nextInt();
            int N = in.nextInt();
            int[] x = new int[N];
            int[] y = new int[N];
            int[] a = new int[N];
            for (int i = 0; i < N; i++) {
                x[i] = in.nextInt() - 1;
                y[i] = in.nextInt() - 1;
                a[i] = in.nextInt();
            }

            boolean[][] isBlack = new boolean[H][W];

            for (int i = 0; i < N; i++) {
                if (a[i] == 1) {
                    for (int r = 0; r < H; r++) {
                        for (int c = 0; c < W; c++) {
                            if (c <= x[i]) {
                                isBlack[r][c] = true;
                            }
                        }
                    }
                } else if (a[i] == 2) {
                    for (int r = 0; r < H; r++) {
                        for (int c = 0; c < W; c++) {
                            if (c > x[i]) {
                                isBlack[r][c] = true;
                            }
                        }
                    }
                } else if (a[i] == 3) {
                    for (int r = 0; r < H; r++) {
                        for (int c = 0; c < W; c++) {
                            if (r <= y[i]) {
                                isBlack[r][c] = true;
                            }
                        }
                    }
                } else if (a[i] == 4) {
                    for (int r = 0; r < H; r++) {
                        for (int c = 0; c < W; c++) {
                            if (r > y[i]) {
                                isBlack[r][c] = true;
                            }
                        }
                    }
                }
            }

            int count = 0;
            for (int r = 0; r < H; r++) {
                for (int c = 0; c < W; c++) {
                    if (!isBlack[r][c]) {
                        count++;
                    }
                }
            }

            System.out.println(count);
        }
    }
}
