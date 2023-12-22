import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    private static FastScanner scanner = new FastScanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] ashiba = new int[n];
        for (int i = 0; i < n; i++) {
            ashiba[i] = scanner.nextInt();
        }

        int[] cost = new int[n];
        for (int i = 0; i < n; i++) {
            cost[i] = Integer.MAX_VALUE;
        }

        cost[0] = 0;
        cost[1] = Math.abs(ashiba[1] - ashiba[0]);
        for (int i = 2; i < n; i++) {
            for (int j = 1; j <= k; j++) {
                if (i - j < 0) break;
                cost[i] = Math.min(cost[i], Math.abs(ashiba[i] - ashiba[i-j]) + cost[i-j]);
            }
        }
        System.out.println(cost[n-1]);
    }

    // 最大公約数（大小の指定は問わない）
    private static int gcd(int s, int t) {
        int high = Math.max(s, t);
        int low = Math.min(s, t);

        int r = high % low;
        if (r == 0) return low;
        return gcd(low, r);
    }

    // 最小公倍数（大小の指定は問わない）
    private int lcm(int s, int t) {
        return s * t / gcd(s, t);
    }

    // グリッドグラフ
    private static class GridGraph {
        private int rLength;
        private int cLength;
        private String[][] gridGraph;
        private int[][] distance;

        public GridGraph(int r, int c) {
            this.rLength = r;
            this.cLength = c;
            this.gridGraph = new String[r][c];
            this.distance = new int[r][c];

            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    this.distance[i][j] = -1;
                }
            }
        }

        public void setNode(int r, int c, String s) {
            this.gridGraph[r][c] = s;
        }

        // 幅優先探索
        public void bfs(int r, int c) {
            Queue<Coordinate> queue = new ArrayDeque<>();
            int[] dc = {1, 0, -1, 0};
            int[] dr = {0, 1, 0, -1};

            // スタート座標を探索キューに入れる
            queue.add(new Coordinate(r, c));
            // スタート座標の距離は0
            this.distance[r][c] = 0;

            while(!queue.isEmpty()) {
                Coordinate coo = queue.poll();

                for (int i = 0; i < 4; i++) {
                    int nc = coo.c + dc[i];
                    int nr = coo.r + dr[i];

                    // 範囲外座標はスルー
                    if (nc < 0 || nc >= this.cLength || nr < 0 || nr >= this.rLength) continue;
                    // 壁座標はスルー
                    if (this.gridGraph[nr][nc].equals("#")) continue;
                    // 到達済み座標はスルー
                    if (this.distance[nr][nc] >=0) continue;
                    // それ以外の座標は到達可能点として距離を記録して探索キューに入れる
                    this.distance[nr][nc] = this.distance[coo.r][coo.c] + 1;
                    queue.add(new Coordinate(nr, nc));
                }
            }
        }

        // 幅優先探索実施後にスタート座標からの距離を返す
        private int getDistance(int r, int c) {
            return this.distance[r][c];
        }

        // 座標
        private class Coordinate {
            int r;
            int c;
            public Coordinate(int r, int c) {
                this.r = r;
                this.c = c;
            }
        }
    }

    // グラフ
    private static class Graph {
        private Vertex[] vertexes;
        private int size;
        private boolean[] seen;

        public Graph(int n) {
            this.size = n;
            this.vertexes = new Vertex[n];
            for (int i = 0; i < n; i++) {
                this.vertexes[i] = new Vertex();
            }
            this.seen = new boolean[n];
        }

        public Graph(int[] vertexes) {
            this.size = vertexes.length;
            this. vertexes = new Vertex[vertexes.length];
            for (int i = 0; i < vertexes.length; i++) {
                this.vertexes[i] = new Vertex(vertexes[i]);
            }
            this.seen = new boolean[vertexes.length];
        }

        public void addEdge(int from, int to) {
            this.addEdge(from, to, 0);
        }

        public void addEdge(int from, int to, int weight) {
            this.vertexes[from].addEdge(to, weight);
        }

        // 深さ優先探索を実施し、到達可能な頂点をすべて辿り閉路かどうかをチェックする
        public boolean dfs(int now, int from) {
            this.seen[now] = true;
            boolean isCycle = false;
            for (Edge e : this.vertexes[now].getEdges()) {
                if (e.getTo() == from) {
                    continue;
                }
                if (seen[e.getTo()]) {
                    isCycle = true;
                } else {
                    isCycle = isCycle || dfs(e.getTo(), now);
                }
            }
            return isCycle;
        }

        // 深さ優先探索実施後に到達済みノードかどうかを返す
        public boolean seen(int now) {
            return this.seen[now];
        }

    }

    private static class Vertex {
        private int value;
        private List<Edge> edges = new ArrayList<>();

        public Vertex() {};
        public Vertex(int value) {
            this.value = value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public void addEdge(int to, int weight) {
            edges.add(new Edge(to, weight));
        }

        public List<Edge> getEdges() {
            return this.edges;
        }
    }

    private static class Edge {
        private int to;
        private int weight;

        public Edge(int to, int weight) {
            this.to = to;
            this.weight = weight;
        }

        public int getTo() {
            return this.to;
        }

        public int getWeight() {
            return this.weight;
        }
    }

    private static class FastScanner {

        private BufferedReader reader;
        private StringTokenizer tokenizer;

        public FastScanner(InputStream in) {
            this.reader = new BufferedReader(new InputStreamReader(in));
        }

        public int[] nextLineToIntArray() {
            String[] stringArray = nextLineToStringArray();
            int[] intArray = new int[stringArray.length];
            for (int i = 0; i < stringArray.length; i++) {
                intArray[i] = Integer.parseInt(stringArray[i]);
            }
            return intArray;
        }

        public String[] nextLineToStringArray() {
            return nextLine().split("");
        }

        public String nextLine() {
            try {
                return reader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
                throw new RuntimeException(e);
            }
        }

        public String next() {
            if (this.tokenizer == null || !this.tokenizer.hasMoreElements()) {
                try {
                    this.tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                    throw new RuntimeException(e);
                }
            }
            return this.tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

        public double nextDouble() {
            return Double.parseDouble(next());
        }

        public String[] nextStringArray(int n) {
            String[] stringArray = new String[n];
            for (int i = 0; i < n; i++) {
                stringArray[i] = next();
            }
            return stringArray;
        }

        public int[] nextIntArray(int n) {
            int[] intArray = new int[n];
            for (int i = 0; i < n; i++) {
                intArray[i] = nextInt();
            }
            return intArray;
        }

        public long[] nextLongArray(int n) {
            long[] longArray = new long[n];
            for (int i = 0; i < n; i++) {
                longArray[i] = nextLong();
            }
            return longArray;
        }

        public double[] nextDoubleArray(int n) {
            double[] doubleArray = new double[n];
            for (int i = 0; i < n; i++) {
                doubleArray[i] = nextDouble();
            }
            return doubleArray;
        }
    }
}
