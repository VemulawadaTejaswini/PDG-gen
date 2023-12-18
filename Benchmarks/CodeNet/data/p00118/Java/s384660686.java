import java.util.Scanner;

public class Main {
    private static char[][] m;
    private static Scanner SC = new Scanner(System.in);
    private static int row, col;
    private static final int[] DX = {-1, 1, 0, 0}, DY = {0, 0, -1, 1};

    public static void dfs(int r, int c) {
        char cur = m[r][c];
        m[r][c] = 'x';
        for (int i = 0; i < 4; i++) {
            int tr = r + DX[i];
            int tc = c + DY[i];
            if (0 <= tr && tr < row && 0 <= tc && tc < col && m[tr][tc] == cur) {
                dfs(tr, tc);
            }
        }
    }

    public static void main(String[] args) {
        while (true) {
            row = SC.nextInt();
            col = SC.nextInt();
            SC.nextLine();
            if (row == 0 && col == 0) {
                break;
            }
            m = new char[row][];
            for (int i = 0; i < row; i++) {
                m[i] = SC.nextLine().toCharArray();
            }
            int count = 0;
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    if (m[i][j] != 'x') {
                        dfs(i, j);
                        count++;
                    }
                }
            }
            System.out.println(count);
        }

    }
}

