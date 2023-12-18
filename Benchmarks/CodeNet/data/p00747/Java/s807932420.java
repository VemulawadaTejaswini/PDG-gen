import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    static int w;
    static int h;
    static Scanner sc = new Scanner(System.in);
    static boolean[][] map;
    static Queue<int[]> queue;
    static int step;
    static int[] goal;
    static int[] pos;
    static int[][] r_wall;
    static int[][] c_wall;

    // add new positions to queue
    private static void moveFrom(int[] xy) {
        int x = xy[0];
        int y = xy[1];
        map[y][x] = true;

        // right
        if (x+1 < w && !map[y][x+1] && r_wall[y][x] != 1) {
            queue.offer(new int[] {x+1, y});
        }
        // up
        if (y-1 >= 0 && !map[y-1][x] && c_wall[y-1][x] != 1) {
            queue.offer(new int[] {x, y-1});
        }
        // left
        if (x-1 >= 0 && !map[y][x-1] && r_wall[y][x-1] != 1) {
            queue.offer(new int[] {x-1, y});
        }
        // down
        if (y+1 < h && !map[y+1][x] && c_wall[y][x] != 1) {
            queue.offer(new int[] {x, y+1});
        }
    }

    public static void main(String[] args) {
        while(true) {
            // Initialize values
            w = sc.nextInt();
            h = sc.nextInt();
            step = 0;
            goal = new int[] {w-1, h-1};
            if (w == 0 && h == 0)
                break;
            map = new boolean[h][w];
            r_wall = new int[h][w-1];
            c_wall = new int[h-1][w];
            for (int i = 0; i < h-1; i++) {
                for (int j = 0; j < w-1; j++) {
                    r_wall[i][j] = sc.nextInt();
                }
                for (int j = 0; j < w; j++) {
                    c_wall[i][j] = sc.nextInt();
                }
            }
            for (int j = 0; j < w-1; j++) {
                r_wall[h-1][j] = sc.nextInt();
            }

            // Initialize queue
            queue = new LinkedList<>();
            queue.offer(new int[] {0,0});

            steps: while (true) {
                int size = queue.size();
                if (size == 0) {
                    step = 0;
                    break;
                }
                step++;
                for (int i = 0; i < size; i++) {
                    pos = queue.poll();
                    if (Arrays.equals(pos, goal))
                        break steps;
                    moveFrom(pos);
                }

           }

            System.out.println(step);
        }
    }
}