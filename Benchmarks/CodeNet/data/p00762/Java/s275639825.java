import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;
 
/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        BiasedDice solver = new BiasedDice();
        solver.solve(1, in, out);
        out.close();
    }
 
    static class BiasedDice {
        private static final int[][] FACES = {
                {},
                {2, 3, 5, 4},
                {1, 4, 6, 3},
                {1, 2, 6, 5},
                {1, 5, 6, 2},
                {1, 3, 6, 4},
                {2, 4, 5, 3},
        };
        private static final int[] DX = {0, 1, 0, -1};
        private static final int[] DY = {1, 0, -1, 0};
        private static int[][] cnt = new int[400][400];
        private static int[][] topNum = new int[400][400];
 
        private static void drop(int x, int y, int top, int front) {
            int max = 3, maxi = -1;
            int offset = -1;
            for (int i = 0; i < 4; i++) {
                if (FACES[top][i] == front) {
                    offset = i;
                    break;
                }
            }
            if (offset == -1) {
                throw new RuntimeException();
            }
 
            for (int i = 0; i < 4; i++) {
                if (FACES[top][(offset + i) % 4] <= max) continue;
                if (cnt[y + DY[i]][x + DX[i]] >= cnt[y][x]) continue;
                max = FACES[top][(offset + i) % 4];
                maxi = i;
            }
 
            if (maxi == -1) {
                cnt[y][x]++;
                topNum[y][x] = top;
                return;
            }
 
            int newTop = 7 - FACES[top][(offset + maxi) % 4];
            int newFront;
            switch (maxi) {
                case 0:
                    newFront = top;
                    break;
                case 1:
                case 3:
                    newFront = front;
                    break;
                case 2:
                    newFront = 7 - top;
                    break;
                default:
                    throw new RuntimeException();
            }
            drop(x + DX[maxi], y + DY[maxi], newTop, newFront);
        }
 
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            while (n != 0) {
                for (int i = 0; i < 400; i++) Arrays.fill(cnt[i], 0);
                for (int i = 0; i < 400; i++) Arrays.fill(topNum[i], 0);
 
                for (int i = 0; i < n; i++) {
                    int top = in.nextInt(), front = in.nextInt();
                    drop(200, 200, top, front);
                }
 
                int[] ans = new int[7];
                for (int i = 0; i < 400; i++) {
                    for (int j = 0; j < 400; j++) {
                        ans[topNum[i][j]]++;
                    }
                }
 
                for (int i = 1; i <= 5; i++) {
                    out.print(ans[i] + " ");
                }
                out.println(ans[6]);
 
                n = in.nextInt();
            }
        }
 
    }
}
