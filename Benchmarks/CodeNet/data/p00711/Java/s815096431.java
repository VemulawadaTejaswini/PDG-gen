import java.util.Scanner;

public class Main {
    static int w, h, c;
    static int[][] map;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            w = sc.nextInt();
            h = sc.nextInt();
            if (w == 0 && h == 0) {
                break;
            }
            map = new int[h][w];

            int sx = 0;
            int sy = 0;

            for (int i = 0; i < h; i++) {
                String line = sc.next();
                for (int j = 0; j < w; j++) {
                    char c = line.charAt(j);
                    if (c == '#') {
                        map[i][j] = 1;
                    } else if (c == '.') {
                        map[i][j] = 0;
                    } else {
                        sx = j;
                        sy = i;
                        map[i][j] = 0;
                    }
                }
            }
            // printArray(map);
            c = 0;
            check(sy, sx);
            System.out.println(c);
        }
    }

    public static void check(int y, int x) {
        if (y < 0 || x < 0 || y >= h || x >= w) {
            return;
        }
        if (map[y][x] == 1) {
            return;
        }
        map[y][x] = 1;
        c++;
        check(y + 1, x);
        check(y - 1, x);
        check(y, x + 1);
        check(y, x - 1);
    }

    public static void printArray(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}