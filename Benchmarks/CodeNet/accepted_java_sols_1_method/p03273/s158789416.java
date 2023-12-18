import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int H = sc.nextInt();
        int W = sc.nextInt();

        char[][] grid = new char[H][W];
        sc.nextLine();
        for (int i = 0; i < H; i++) {
            String line = sc.nextLine();
            for (int j = 0; j < W; j++) {
                grid[i][j] = line.charAt(j);
            }
        }

        // row check
        NEXT_ROW: for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                if (grid[i][j] == '#') continue NEXT_ROW;
            }

            for (int j = 0; j < W; j++) {
                grid[i][j] = '+';
            }
        }

        // col check
        NEXT_COL: for (int j = 0; j < W; j++) {
            for (int i = 0; i < H; i++) {
                if (grid[i][j] == '#') continue NEXT_COL;
            }

            for (int i = 0; i < H; i++) {
                grid[i][j] = '+';
            }
        }

        for (int i = 0; i < H; i++) {
            boolean needN = false;

            for (int j = 0; j < W; j++) {
                if (grid[i][j] == '+') continue;
                System.out.print(grid[i][j]);
                needN = true;
            }

            if (needN) System.out.print('\n');
        }
    }
}