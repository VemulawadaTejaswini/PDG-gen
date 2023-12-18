import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = 9;

        int[][] path = new int[size][size];
        for (int i = 0; i < size; i++) {
            String S = sc.next();

            if (i % 2 == 0) {
                Arrays.fill(path[i], 1);

                for (int j = 0; j < 4; j++) {
                    int c = Integer.parseInt(S.split("")[j]);

                    path[i][j * 2 + 1] = c;
                }
            } else {
                for (int j = 0; j < 5; j++) {
                    int c = Integer.parseInt(S.split("")[j]);
                    path[i][j * 2] = c;
                }
            }
        }

        int[] vx = {-1, 0, 1, 0};
        int[] vy = {0, -1, 0, 1};
        List<String> to = new ArrayList<>(Arrays.asList("L", "U", "R", "D"));

        int nx = 0;
        int ny = 0;

        int dir = 2;
        StringBuilder move = new StringBuilder();

        while (true) {
            for (int i = 3; i < 7; i++) {
                int x = nx + vx[(i + dir) % 4];
                int y = ny + vy[(i + dir) % 4];
                int xx = x + vx[(i + dir) % 4];
                int yy = y + vy[(i + dir) % 4];

                if (!judge(x, y, size)) continue;
                if (!judge(xx, yy, size)) continue;
                if (path[y][x] == 0) continue;
                if (path[yy][xx] == 0) continue;

                nx = xx;
                ny = yy;

                dir = (i + dir) % 4;

                move.append(to.get(dir));
                break;
            }
            if (nx == 0 && ny == 0) {
                break;
            }
        }
        System.out.println(move.toString());
    }

    private static boolean judge(int x, int y, int size) {
        return 0 <= x && x < size && 0 <= y && y < size;
    }
}