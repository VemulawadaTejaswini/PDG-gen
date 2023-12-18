import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * @author yousack
 */
public class Main {
    static Scanner in = new Scanner(System.in);
    static int[][] field;
        
    public static void main(String[] args) {
        while (true) {
            int W = in.nextInt();
            int H = in.nextInt();

            if (W == 0 && H == 0) {
                break;
            } else {
                field = new int[H][W];

                for (int i = 0; i < H; i++) {
                    for (int j = 0; j < W; j++) {
                        field[i][j] = in.nextInt();
                    }
                }

                int counter = 0;
                for (int i = 0; i < H; i++) {
                    for (int j = 0; j < W; j++) {
                        if (field[i][j] == 1) {
                            bfs(field, i, j);
                            counter++;
                        }
                    }
                }

                System.out.println(counter);
            }
        }
    }
    
    public static void bfs(int[][] f, int r, int c) {
        Queue<int[]> queue = new LinkedList<int[]>();
        queue.add(new int[]{r, c});
        int[][] dirArray = new int[][]{
                {-1, 0}, {0, 1}, {1, 0}, {0, -1},
                {1, 1}, {1, -1}, {-1, -1}, {-1, 1}
        };
        
        while (!queue.isEmpty()) {
            int[] curPos = queue.poll();
            int curR = curPos[0], curC = curPos[1];
            if (f[curR][curC] == 1) {
                f[curR][curC] = 0;
                for (int[] next : dirArray) {
                    if (ok(curR + next[0], curC + next[1], f.length, f[0].length)) {
                        queue.add(new int[]{curR + next[0], curC + next[1]});
                    }
                }
            }
        }
    }
    
    public static boolean ok(int posR, int posC, int boundR, int boundC) {
        return 0 <= posR && posR < boundR && 0 <= posC && posC < boundC;         
    }
}