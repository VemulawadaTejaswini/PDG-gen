import java.util.Scanner;

class Main {
    static int count = 100;
    static int max = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] grid = new int[10][10];
        while (sc.hasNext()) {
            String[] lines = sc.nextLine().split(",");
            drop(grid, Integer.parseInt(lines[0]), Integer.parseInt(lines[1]), Integer.parseInt(lines[2]));
        }
        System.out.println(count + "\n" + max);
    }

    static void drop(int[][] grid, int x, int y, int n) {
        int[][] px = { { 0, 0, 1, -1, 0 }, { 0, 0, 2, -2 } };
        int[][] py = { { 1, -1, 0, 0, 0 }, { 2, -2, 0, 0 } };
        switch (n) {
        case 1:
        case 3:
            int m = n == 1 ? 0 : 1;
            for (int i = 0; i < px[m].length; i++) {
                draw(grid, x + px[m][i], y + py[m][i]);
            }
            if (n == 1) {
                break;
            }
        case 2:
            for (int i = -1; i < 2; i++) {
                for (int j = -1; j < 2; j++) {
                    draw(grid, x + i, y + j);
                }
            }
            break;
        }
    }

    private static void draw(int[][] grid, int dx, int dy) {
        if (dx < 10 && dx >= 0 && dy < 10 && dy >= 0) {
            grid[dy][dx]++;
            if (grid[dy][dx] == 1)
                count--;
            max = Math.max(max, grid[dy][dx]);
        }
    }
}
