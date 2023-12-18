import java.io.*;
import java.util.*;

public class Main {
    private HashMap<Integer, List<Edge>> graph;

    public static void main(String[] args) throws Exception {
        new Main().solve();
    }

    private void solve() throws Exception{
        FastScanner scanner = new FastScanner(System.in);

        int V = scanner.nextInt();
        int E = scanner.nextInt();
        int src = scanner.nextInt();

        graph = new HashMap<>(V);
        for(int i = 0; i < V; ++i){
            graph.put(i, new ArrayList<Edge>());
        }

        for(int i = 0; i < E; ++i){
            int u = scanner.nextInt();
            int v = scanner.nextInt();
            int w = scanner.nextInt();

            graph.get(u).add(new Edge(v, w));
        }

        int[] dist = new int[V];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0;
        PriorityQueue<Edge> queue = new PriorityQueue<Edge>(11, new Comparator<Edge>() {
            @Override
            public int compare(Edge o1, Edge o2) {
                return o1.weight - o2.weight;
            }
        });

        queue.offer(new Edge(src, 0));
        boolean[] visited = new boolean[V];

        while(!queue.isEmpty()){
            Edge edge = queue.poll();
            int u = edge.v;
            if(visited[u]){
                continue;
            }
            visited[u] = true;

            for(Edge adj : graph.get(u)){
                int v = adj.v;
                if(dist[v] > dist[u] + adj.weight){
                    dist[v] = dist[u] + adj.weight;
                    adj.weight = dist[v];
                    queue.offer(adj);
                }
            }
        }

        PrintWriter printWriter = new PrintWriter(System.out);
        for(int i = 0; i < V; ++i){
            printWriter.println(dist[i]);
        }
        printWriter.flush();
    }

    static class Edge{
        int v;
        int weight;

        public Edge(int v, int weight){
            this.v = v;
            this.weight = weight;
        }
    }

    static class FastScanner {
        private InputStream in;
        private final byte[] buffer = new byte[1024 * 8];
        private int ptr = 0;
        private int buflen = 0;

        public FastScanner(InputStream in){
            this.in = in;
        }

        private boolean hasNextByte() {
            if (ptr < buflen) {
                return true;
            } else {
                ptr = 0;
                try {
                    buflen = in.read(buffer);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (buflen <= 0) {
                    return false;
                }
            }
            return true;
        }

        private int readByte() {
            if (hasNextByte()) return buffer[ptr++];
            else return -1;
        }

        private static boolean isPrintableChar(int c) {
            return 33 <= c && c <= 126;
        }

        private void skipUnprintable() {
            while (hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;
        }

        public boolean hasNext() {
            skipUnprintable();
            return hasNextByte();
        }

        public String next() {
            if (!hasNext()) throw new NoSuchElementException();
            StringBuilder sb = new StringBuilder();
            int b = readByte();
            while (isPrintableChar(b)) {
                sb.appendCodePoint(b);
                b = readByte();
            }
            return sb.toString();
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public double nextDouble() {
            return Double.parseDouble(next());
        }
    }
}