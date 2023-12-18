import java.io.*;
import java.util.*;

public class Main implements Runnable{
    private int[][] graph;
    public static void main(String[] args) throws Exception {
        new Thread(null, new Main(), "bridge", 16 * 1024 * 1024).start();
    }

    @Override
    public void run() {
        try {
            solve();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void solve() throws Exception{
        FileInputStream inputStream = new FileInputStream("test.in");
        System.setIn(inputStream);
        FastScanner scanner = new FastScanner(System.in);

        int V = scanner.nextInt();
        int E = scanner.nextInt();

        graph = new int[V][V];

        for(int i = 0; i < E; ++i){
            int u = scanner.nextInt();
            int v = scanner.nextInt();
            int c = scanner.nextInt();

            graph[u][v] = c;
        }

        int[] parent = new int[V];
        int totalFlow = 0;
        int s = 0;
        int t = V - 1;
        while(existPath(graph, s, t, parent)){
            int pathFlow = Integer.MAX_VALUE;
            for(int v = t; v != s; v = parent[v]){
                int u = parent[v];
                pathFlow = Math.min(pathFlow, graph[u][v]);
            }

            totalFlow += pathFlow;

            for(int v = t; v != s; v = parent[v]){
                int u = parent[v];
                graph[u][v] -= pathFlow;
                graph[v][u] += pathFlow;
            }
        }

        System.out.println(totalFlow);
    }

    private boolean existPath(int[][] graph, int s, int t, int[] parent){
        int V = graph.length;
        boolean[] visited = new boolean[V];

        LinkedList<Integer> queue = new LinkedList<>();
        queue.add(s);
        parent[s] = -1;

        while(!queue.isEmpty()){
            int u = queue.remove();
            visited[u] = true;
            if(u == t){
                break;
            }

            for(int v = 0; v < V; ++v){
                if(!visited[v] && graph[u][v] > 0){
                    queue.add(v);
                    parent[v] = u;
                }
            }
        }

        return visited[t];
    }

    static class Edge{
        int u;
        int v;
        int flow;
        int cap;

        public Edge(int u, int v, int flow, int cap){
            this.u = u;
            this.v = v;
            this.flow = flow;
            this.cap = cap;
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