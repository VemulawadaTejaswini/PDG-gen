import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int H = in.nextInt();
            int W = in.nextInt();
            char[][] a = new char[H][W];
            for (int r = 0; r < H; r++) {
                String line = in.next();
                a[r] = line.toCharArray();
            }

            boolean[] is = new boolean[H];
            for (int r = 0; r < H; r++) {
                boolean iswhite = true;
                for (int c = 0; c < W; c++) {
                    iswhite &= (a[r][c] == '.' || a[r][c] == 'W');
                }
                is[r] = iswhite;
                if (iswhite) {
                    for (int c = 0; c < W; c++) {
                        a[r][c] = 'W';
                    }
                }
            }

            for (int c = 0; c < W; c++) {
                boolean iswhite = true;
                for (int r = 0; r < H; r++) {
                    iswhite &= (a[r][c] == '.' || a[r][c] == 'W');
                }
                if (iswhite) {
                    for (int r = 0; r < H; r++) {
                        a[r][c] = 'W';
                    }
                }
            }

            StringBuilder res = new StringBuilder();
            for (int r = 0; r < H; r++) {
                if (is[r]) {
                    continue;
                }
                for (int c = 0; c < W; c++) {
                    if (a[r][c] != 'W') {
                        res.append(a[r][c]);
                    }
                }
                res.append("\n");
            }

            System.out.println(res.toString());
        }
    }
}
