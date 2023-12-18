import java.io.*;
import java.util.*;

public class Main implements Runnable{
    private ArrayList<ArrayList<Integer>> graph;
    private ArrayList<Edge> edges;
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

        graph = new ArrayList<>(V);
        edges = new ArrayList<>(E * 2);

        for(int i = 0; i < V; ++i){
            graph.add(new ArrayList<Integer>());
        }

        for(int i = 0; i < E; ++i){
            int u = scanner.nextInt();
            int v = scanner.nextInt();
            int c = scanner.nextInt();

            edges.add(new Edge(u, v, 0, c));
            edges.add(new Edge(v, u, 0, 0));

            graph.get(u).add(edges.size() - 2);
            graph.get(v).add(edges.size() - 1);
        }

        System.out.println(maxFlow(0, V - 1));
    }

    private int maxFlow(int s, int t){
        int V = graph.size();
        int[] dist = new int[V];
        int totalFlow = 0;
        while(dinicBFS(s, t, dist)){
            int flow;
            int[] index = new int[V];
            while((flow = dinicDFS(s, t, dist, index, Integer.MAX_VALUE)) > 0){
                totalFlow += flow;
            }
        }

        return totalFlow;
    }

    private boolean dinicBFS(int s, int t, int[] dist){
        Arrays.fill(dist, -1);
        dist[s] = 0;

        LinkedList<Integer> queue = new LinkedList<>();
        queue.offer(s);

        while(!queue.isEmpty()){
            int u = queue.poll();

            for(int edgeIndex : graph.get(u)){
                Edge edge = edges.get(edgeIndex);
                if(dist[edge.v] == -1 && edge.flow < edge.cap){
                    queue.offer(edge.v);
                    dist[edge.v] = dist[edge.u] + 1;
                }
            }
        }

        return dist[t] != -1;
    }

    private int dinicDFS(int u, int t, int[] dist, int[] index, int flow){
        if(u == t){
            return flow;
        }

        for(; index[u] < graph.get(u).size(); ++index[u]){
            int edgeIndex = graph.get(u).get(index[u]);
            Edge edge = edges.get(edgeIndex);
            if(dist[edge.v] == dist[edge.u] + 1 && edge.flow < edge.cap){
                int pathFlow = dinicDFS(edge.v, t, dist, index, Math.min(flow, edge.cap - edge.flow));
                if(pathFlow > 0){
                    edge.flow += pathFlow;
                    edges.get(edgeIndex ^ 1).flow -= pathFlow;
                    return pathFlow;
                }
            }
        }

        return 0;
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