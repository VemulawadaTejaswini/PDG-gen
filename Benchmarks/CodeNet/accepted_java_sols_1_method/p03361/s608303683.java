import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int H = in.nextInt();
            int W = in.nextInt();
            int[][] s = new int[H][W];
            for (int i = 0; i < H; i++) {
                String line = in.next();
                for (int j = 0; j < W; j++) {
                    s[i][j] = line.charAt(j) == '.' ? 0 : 1;
                }
            }

            int[] dr = new int[] { -1, 0, 0, 1, };
            int[] dc = new int[] { 0, -1, 1, 0, };
            for (int r = 0; r < H; r++) {
                for (int c = 0; c < W; c++) {
                    if (s[r][c] == 0) {
                        continue;
                    }
                    boolean isValid = !true;
                    for (int d = 0; d < dr.length; d++) {
                        int nr = r + dr[d];
                        int nc = c + dc[d];
                        if (nr < 0 || nr >= H || nc < 0 || nc >= W) {
                            continue;
                        }
                        if (s[nr][nc] == 1) {
                            isValid = true;
                        }
                    }
                    if (!isValid) {
                        System.out.println("No");
                        return;
                    }
                }
            }

            System.out.println("Yes");
        }
    }
}
