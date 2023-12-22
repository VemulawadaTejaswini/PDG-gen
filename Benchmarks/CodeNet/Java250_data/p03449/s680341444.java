import java.util.Scanner;

class Main {

    static int n = 5;
    static int max;
    static int g[][];

    public static void go(int x, int y, int cur) {
        cur += g[x][y];
        if (x == 0) {
            go(x + 1, y, cur);
        }
        if (y < n - 1)
            go(x, y + 1, cur);
        max = Math.max(max, cur);
    }

    public static void main(String... args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        g = new int[2][n];
        for (int i = 0, col = 0; i < n; i++) {
            g[col][i] = in.nextInt();
        }
        for (int i = 0, col = 1; i < n; i++) {
            g[col][i] = in.nextInt();
        }
        go(0, 0, 0);
        System.out.println(max);

    }

}

