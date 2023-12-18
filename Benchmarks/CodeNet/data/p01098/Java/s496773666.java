import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;
import java.util.Stack;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.stream.Stream;
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
        FDecipheringCharacters solver = new FDecipheringCharacters();
        solver.solve(1, in, out);
        out.close();
    }

    static class FDecipheringCharacters {
        private static final String YES = "yes";
        private static final String NO = "no";
        private static final int[] DX = {0, 1, 0, -1, 1, -1, -1, 1};
        private static final int[] DY = {1, 0, -1, 0, 1, 1, -1, -1};
        private static int h;
        private static int w;
        private static boolean[][] board = new boolean[102][102];
        private static boolean[][] visited = new boolean[102][102];

        public void solve(int testNumber, Scanner in, PrintWriter out) {
            final String[] trees = new String[2];
            while (true) {
                for (int k = 0; k < 2; k++) {
                    for (int i = 0; i < 102; i++) {
                        Arrays.fill(board[i], false);
                        Arrays.fill(visited[i], false);
                    }
                    h = in.nextInt();
                    w = in.nextInt();
                    if (h == 0 && w == 0) return;
                    for (int i = 1; i <= h; i++) {
                        String s = in.next();
                        for (int j = 1; j <= w; j++) {
                            board[i][j] = s.charAt(j - 1) == '#';
                        }
                    }
                    trees[k] = solve();
                }
                out.println(trees[0].equals(trees[1]) ? YES : NO);
            }
        }

        private static String solve() {
            FDecipheringCharacters.Node root = new FDecipheringCharacters.Node();
            Queue<FDecipheringCharacters.Vec> queue = new ArrayDeque<>();
            Stack<FDecipheringCharacters.Vec> stack = new Stack<>();
            queue.offer(new FDecipheringCharacters.Vec(0, 0, root));
            while (!queue.isEmpty()) {
                FDecipheringCharacters.Vec current = queue.poll();
                if (visited[current.y][current.x]) continue;

                FDecipheringCharacters.Node node = new FDecipheringCharacters.Node();
                current.node.nodes.add(node);

                int color = board[current.y][current.x] ? 8 : 4;
                stack.push(current);

                while (!stack.isEmpty()) {
                    FDecipheringCharacters.Vec v = stack.pop();
                    if (visited[v.y][v.x]) continue;
                    visited[v.y][v.x] = true;

                    for (int i = 0; i < color; i++) {
                        int nx = v.x + DX[i], ny = v.y + DY[i];
                        if (nx < 0 || ny < 0 || nx > w + 1 || ny > h + 1 || visited[ny][nx]) continue;
                        if (board[ny][nx] == board[v.y][v.x]) {
                            stack.push(new FDecipheringCharacters.Vec(nx, ny, null));
                        } else {
                            queue.offer(new FDecipheringCharacters.Vec(nx, ny, node));
                        }
                    }
                }
            }
            return root.toString();
        }

        private static class Vec {
            int x;
            int y;
            FDecipheringCharacters.Node node;

            Vec(int x, int y, FDecipheringCharacters.Node node) {
                this.x = x;
                this.y = y;
                this.node = node;
            }

        }

        private static class Node {
            final List<FDecipheringCharacters.Node> nodes = new ArrayList<>();

            public String toString() {
                StringBuilder sb = new StringBuilder("(");
                nodes.stream().map(FDecipheringCharacters.Node::toString).sorted().forEach(sb::append);
                return sb.append(")").toString();
            }

        }

    }
}


