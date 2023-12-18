import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    private static FastScanner scanner = new FastScanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        Graph g = new Graph(n);
        for (int i = 0; i < m; i++) {
            int a = scanner.nextInt() - 1;
            int b = scanner.nextInt() - 1;
            g.addEdge(a, b);
            g.addEdge(b, a);
        }
        g.bfs();
    }

    // グラフ
    private static class Graph {
        private Vertex[] vertexes;
        private int size;
        private boolean[] seen;
        private Queue<Vertex> queue = new ArrayDeque<>();

        public Graph(int n) {
            this.size = n;
            this.vertexes = new Vertex[n];
            for (int i = 0; i < n; i++) {
                this.vertexes[i] = new Vertex(i);
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

        public void bfs() {
            Vertex start = vertexes[0];
            seen[0] = true;
            queue.add(start);

            while(!queue.isEmpty()) {
                Vertex v = queue.poll();
                for (Edge e : v.edges) {
                    int next = e.getTo();
                    if (!seen[next]) {
                        seen[next] = true;
                        Vertex nextV = vertexes[next];
                        nextV.value = v.position;
                        queue.add(nextV);
                    }
                }
            }

            boolean isTassei = true;
            for (int i = 1; i < size; i++) {
                if (vertexes[i].value == -1) {
                    isTassei = false;
                }
            }
            if (!isTassei) {
                System.out.println("No");
                return;
            }

            System.out.println("Yes");
            for (int i = 1; i < size; i++) {
                System.out.println(vertexes[i].value + 1);
            }
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
        public int position;
        public int value;
        public List<Edge> edges = new ArrayList<>();

        public Vertex() {};
        public Vertex(int position) {
            this.position = position;
            this.value = -1;
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
