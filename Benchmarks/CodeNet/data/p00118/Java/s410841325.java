// AOJ 0118

import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {

    private static char[][] orchard;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int H = sc.nextInt(), W = sc.nextInt();
            if (H == 0 && W == 0) return;

            orchard = new char[H][];
            for (int i = 0; i < H; i++) {
                orchard[i] = sc.next().toCharArray();
            }

            int count = 0;
            ArrayDeque<int[]> queue = new ArrayDeque<int[]>();
            int[][] direction = {
                {0, 1}, {0, -1}, {1, 0}, {-1, 0}
            };
            for (int i = 0; i < H; i++) {
                for (int j = 0; j < W; j++) {
                    if (orchard[i][j] != '.') {
                        count++;
                        queue.add(new int[] {i, j});
                        char fruit = orchard[i][j];
                        orchard[i][j] = '.';
                        while (!queue.isEmpty()) {
                            int[] loc = queue.poll();
                            int x = loc[0], y = loc[1];
                            for (int[] d: direction) {
                                int dx = d[0], dy = d[1];
                                if (0 <= x + dx && x + dx < H &&
                                    0 <= y + dy && y + dy < W &&
                                    orchard[x+dx][y+dy] == fruit) {
                                    queue.add(new int[] {x+dx, y+dy});
                                    orchard[x+dx][y+dy] = '.';
                                }
                            }
                        }
                    }
                }
            }
            System.out.println(count);
        }
    }
}

