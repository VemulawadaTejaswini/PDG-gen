import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;
import java.util.Queue;
import java.util.ArrayDeque;

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
        MirrorCave solver = new MirrorCave();
        try {
            int testNumber = 1;
            while (true)
                solver.solve(testNumber++, in, out);
        } catch (UnknownError e) {
            out.close();
        }
    }

    static class MirrorCave {
        final int[] dh = new int[]{0, -1, 0, 1};
        final int[] dw = new int[]{-1, 0, 1, 0};
        final int[] dh2 = new int[]{0, -1, 0, 1};
        final int[] dw2 = new int[]{1, 0, -1, 0};

        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int W = in.nextInt();
            int H = in.nextInt();
            if (W == 0) {
                throw new UnknownError();
            }
            String[] L = new String[H];
            String[] R = new String[H];
            int lh = -1, lw = -1, rh = -1, rw = -1;
            int glh = -1, glw = -1, grh = -1, grw = -1;
            for (int i = 0; i < H; ++i) {
                L[i] = in.next();
                R[i] = in.next();
                for (int j = 0; j < W; ++j) {
                    if (L[i].charAt(j) == 'L') {
                        lh = i;
                        lw = j;
                    }
                    if (R[i].charAt(j) == 'R') {
                        rh = i;
                        rw = j;
                    }
                    if (L[i].charAt(j) == '%') {
                        glh = i;
                        glw = j;
                    }
                    if (R[i].charAt(j) == '%') {
                        grh = i;
                        grw = j;
                    }
                }
            }
            boolean[][][][] vis = new boolean[H][W][H][W];
            for (int i = 0; i < H; ++i) {
                for (int j = 0; j < W; ++j) {
                    for (int k = 0; k < H; ++k) {
                        Arrays.fill(vis[i][j][k], false);
                    }
                }
            }
            Queue<State> q = new ArrayDeque<>();
            q.add(new State(lh, lw, rh, rw));
            while (!q.isEmpty()) {
                State now = q.poll();
                if (vis[now.lh][now.lw][now.rh][now.rw]) {
                    continue;
                }
                vis[now.lh][now.lw][now.rh][now.rw] = true;
                if (now.lh == glh && now.rh == grh && now.lw == glw && now.rw == grw) {
                    out.println("Yes");
                    return;
                }
                for (int i = 0; i < 4; ++i) {
                    State next = new State(now.lh + dh[i], now.lw + dw[i], now.rh + dh2[i], now.rw + dw2[i]);
                    if (0 <= next.lh && next.lh < H && 0 <= next.lw && next.lw < W && 0 <= next.rh && next.rh < H && 0 <= next.rw && next.rw < W) {
                        if (L[next.lh].charAt(next.lw) == '#') {
                            if (next.lh != now.lh) {
                                next.lh = now.lh;
                            }
                            if (next.lw != now.lw) {
                                next.lw = now.lw;
                            }
                        }
                        if (R[next.rh].charAt(next.rw) == '#') {
                            if (next.rh != now.rh) {
                                next.rh = now.rh;
                            }
                            if (next.rw != now.rw) {
                                next.rw = now.rw;
                            }
                        }
                        if (vis[next.lh][next.lw][next.rh][next.rw]) {
                            continue;
                        }
                        q.add(next);
                    }
                }
            }
            out.println("No");
            return;
        }

        public class State {
            int lh;
            int lw;
            int rh;
            int rw;

            State(int lh, int lw, int rh, int rw) {
                this.lh = lh;
                this.lw = lw;
                this.rh = rh;
                this.rw = rw;
            }

        }

    }
}