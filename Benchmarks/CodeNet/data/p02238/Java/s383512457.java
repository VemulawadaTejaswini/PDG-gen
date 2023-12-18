import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

class Graph {
    static int NIL = -1;
    static int WHITE = 0;
    static int GRAY = 1;
    static int BLACK = 2;

    int n;
    int[][] G;
    int[] d;
    int[] f;

    Graph(int[][] g) {
        n = g.length;
        G = g;
        d = new int[n];
        f = new int[n];
    }

    private int depthFirstVisit(int u, int[] state, int time) {
        Deque<Integer> stack = new ArrayDeque<>();

        stack.addFirst(u);
        state[u] = GRAY;
        d[u] = ++time;

        while (!stack.isEmpty()) {
            u = stack.peekFirst();
            int v = next(u, state);
            if (v != NIL) {
                state[v] = GRAY;
                d[v] = ++time;
                stack.addFirst(v);
            } else {
                stack.removeFirst();
                state[u] = BLACK;
                f[u] = ++time;
            }
        }

        return time;
    }

    void depthFirstSearch() {
        int[] state = new int[n];
        int time = 0;
        for (int i = 0; i < n; i++) {
            if (state[i] == WHITE)
                time = depthFirstVisit(i, state, time);
        }
    }

    private int recurciveDepthFirstVisit(int u, int[] state, int time) {
        state[u] = GRAY;
        d[u] = ++time;
        for (int i = 0; i < n; i++) {
            if (G[u][i] == 1 && state[i] == WHITE)
                time = recurciveDepthFirstVisit(i, state, time);
        }
        state[u] = BLACK;
        f[u] = ++time;
        return time;
    }

    void recursiveDepthFirstSearch() {
        int[] state = new int[n];
        int time = 0;
        for (int i = 0; i < n; i++) {
            if (state[i] == WHITE)
                time = recurciveDepthFirstVisit(i, state, time);
        }
    }

    private int next(int u, int[] state) {
        for (int i = 0; i < n; i++) {
            if (G[u][i] == 1 && state[i] == WHITE)
                return i;
        }
        return NIL;
    }

    void print() {
        StringBuilder out = new StringBuilder();
        for (int i = 0; i < n; i++) {
            out.append(i + 1).append(" ").append(d[i]).append(" ").append(f[i]).append("\n");
        }
        System.out.print(out);
    }
}

public class Main {
    public static void main(String[] args) {
        try (BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) {
            int n = Integer.parseInt(in.readLine());

            int[][] G = new int[n][n];

            for (int i = 0; i < n; i++) {
                String[] line = in.readLine().split(" ");
                int u = Integer.parseInt(line[0]) - 1;
                int k = Integer.parseInt(line[1]);
                for (int j = 0; j < k; j++) {
                    int v = Integer.parseInt(line[2 + j]) - 1;
                    // In adjacency matrices, Be one where the edge exists
                    G[u][v] = 1;
                }
            }

            Graph graph = new Graph(G);
            //graph.depthFirstSearch();
            graph.recursiveDepthFirstSearch();
            graph.print();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

