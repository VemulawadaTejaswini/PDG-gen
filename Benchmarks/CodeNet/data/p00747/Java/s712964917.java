import java.util.*;
import java.lang.*;

/**
 * AmazingMazes
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int w = sc.nextInt();
            int h = sc.nextInt();

            if (w == 0 && h == 0)
                break;

            // 入力受け取り
            int tatebou[][] = new int[h][w - 1];
            int yokobou[][] = new int[h - 1][w];
            for (int i = 0; i < h * 2 - 1; i++) {
                if (i % 2 == 0) {
                    for (int j = 0; j < w - 1; j++) {
                        tatebou[i / 2][j] = sc.nextInt();
                    }
                } else {
                    for (int j = 0; j < w; j++) {
                        yokobou[i / 2][j] = sc.nextInt();
                    }
                }
            }

            // 幅優先探索
            int map[][] = new int[h][w];
            map[0][0] = 1;
            int ans = 0;
            Queue<Integer> queue = new ArrayDeque<Integer>(); // 探索の先端を入れておく(y, xの順番で入れる)
            queue.add(0);
            queue.add(0);

            while (!queue.isEmpty()) {
                int y = queue.poll();
                int x = queue.poll();

                if (x == w - 1 && y == h - 1)
                    break;

                // 4方向探索
                try {
                    if (tatebou[y][x] == 0) { // right
                        // ここでマップをみて探索済みか調べる
                        if (map[y][x + 1] == 0) {
                            // System.out.println("right deep:" + (ans + 1) + " (" + (x + 1) + "," + y +
                            // ")");

                            map[y][x + 1] = map[y][x] + 1;
                            queue.add(y);
                            queue.add(x + 1);
                        }
                    }
                } catch (Exception e) {
                }
                try {
                    if (tatebou[y][x - 1] == 0) { // left
                        if (map[y][x - 1] == 0) {
                            // System.out.println("left deep:" + (ans + 1) + " (" + (x - 1) + "," + y +
                            // ")");
                            map[y][x - 1] = map[y][x] + 1;
                            queue.add(y);
                            queue.add(x - 1);
                        }
                    }
                } catch (Exception e) {
                }
                try {
                    if (yokobou[y][x] == 0) { // down
                        if (map[y + 1][x] == 0) {
                            // System.out.println("down deep:" + (ans + 1) + " (" + x + "," + (y + 1) +
                            // ")");
                            map[y + 1][x] = map[y][x] + 1;
                            queue.add(y + 1);
                            queue.add(x);
                        }
                    }
                } catch (Exception e) {
                }
                try {
                    if (yokobou[y - 1][x] == 0) { // up
                        if (map[y - 1][x] == 0) {
                            // System.out.println("up deep:" + (ans + 1) + " (" + x + "," + (y - 1) + ")");
                            map[y - 1][x] = map[y][x] + 1;
                            queue.add(y - 1);
                            queue.add(x);
                        }
                    }
                } catch (Exception e) {
                }
            }

            System.out.println(map[h - 1][w - 1]);
        }
    }
}
