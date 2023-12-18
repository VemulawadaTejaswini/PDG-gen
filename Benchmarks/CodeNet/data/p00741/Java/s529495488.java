import java.util.*;

public class Main {

    private static final int[] VEC = {-1, 0, 1};

    public static void main(String[] args) {
        new Main().execute();
    }


    public void execute() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int W = sc.nextInt();
            int H = sc.nextInt();

            if (W == 0 && H == 0) {
                break;
            }

            int[][] field = new int[H][W];
            for (int i = 0; i < H; i++) {
                for (int j = 0; j < W; j++) {
                    field[i][j] = sc.nextInt();
                }
            }
            System.out.println(countIslands(W, H, field));
        }

        sc.close();
    }

    private int countIslands(int w, int h, int[][] field) {
        int count = 0;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (field[i][j] == 1) {
                    dfsIsland(i, j, field);
                    count++;
                }
            }
        }

        return count;
    }

    private void dfsIsland(int x, int y, int[][] field) {
        field[x][y] = 0;
        for (int dx : VEC) {
            for (int dy : VEC) {
                int x1 = x + dx;
                int y1 = y + dy;
                if (x1 >= 0 && y1 >= 0 && x1 < field.length && y1 < field[x].length) {
                    if (field[x1][y1] == 1) {
                        dfsIsland(x1, y1, field);
                    }
                }
            }
        }
    }


}
