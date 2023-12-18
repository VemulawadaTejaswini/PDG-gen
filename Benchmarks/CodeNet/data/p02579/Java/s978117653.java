import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static StringTokenizer st;

    private static int readInt() throws IOException {
        while (st == null || !st.hasMoreTokens()) st = new StringTokenizer(br.readLine());
        return Integer.parseInt(st.nextToken());
    }

    static char[][] g;
    static boolean[][] visited;
    static int H, W, Ch, Cw, Dh, Dw;
    static ArrayList<Integer> fronts;
    static Stack<Integer> todo;

    public static void main(String[] args) throws IOException {
        H = readInt();
        W = readInt();
        Ch = readInt() - 1;
        Cw = readInt() - 1;
        Dh = readInt() - 1;
        Dw = readInt() - 1;

        g = new char[H][W];
        for (int i = 0; i < H; i++) {
            g[i] = br.readLine().toCharArray();
        }

        int magicCount = 0;
        visited = new boolean[H][W];
        todo = new Stack<>();
        todo.add(Ch);
        todo.add(Cw);
        visited[Ch][Cw] = true;
        while (true) {
            fronts = new ArrayList<>();
            while (!todo.isEmpty()) {
                int y = todo.pop();
                int x = todo.pop();
                fronts.add(x);
                fronts.add(y);
                if (x > 0 && !visited[x - 1][y] && g[x - 1][y] == '.') visit(x - 1, y);
                if (x < H - 1 && !visited[x + 1][y] && g[x + 1][y] == '.') visit(x + 1, y);
                if (y > 0 && !visited[x][y - 1] && g[x][y - 1] == '.') visit(x, y - 1);
                if (y < W - 1 && !visited[x][y + 1] && g[x][y + 1] == '.') visit(x, y + 1);
            }
            if (visited[Dh][Dw]) {
                System.out.println(magicCount);
                return;
            } else {
                magicCount += 1;
                for (int k = 0; k < fronts.size(); k += 2) {
                    int i = fronts.get(k);
                    int j = fronts.get(k + 1);
                    for (int m = Math.max(0, i - 2); m < Math.min(H, i + 3); m++) {
                        for (int n = Math.max(0, j - 2); n < Math.min(W, i + 3); n++) {
                            if (g[m][n] == '.' && !visited[m][n]) {
                                if (m == Dh && n == Dw) {
                                    System.out.println(magicCount);
                                    return;
                                }
                                visited[m][n] = true;
                                todo.push(m);
                                todo.push(n);
                            }
                        }
                    }
                }
                if (todo.isEmpty()) {
                    System.out.println(-1);
                    return;
                }
            }
        }
    }

    private static void visit(int x, int y) {
        todo.push(x);
        todo.push(y);
        fronts.add(x);
        fronts.add(y);
        visited[x][y] = true;
    }
}
