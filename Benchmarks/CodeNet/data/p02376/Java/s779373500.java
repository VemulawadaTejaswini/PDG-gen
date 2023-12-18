import java.io.*;
import java.util.*;

class Main{
    private ArrayList<ArrayList<Integer>> graph;
    private ArrayList<Edge> edges;
    public static void main(String[] args) throws Exception{
        new Main().solve();
    }

    private void solve() throws Exception{
        FastScanner scanner = new FastScanner();

        int V = scanner.nextInt();
        int E = scanner.nextInt();

        graph = new ArrayList<>(V);
        for(int i = 0; i < V; ++i){
            graph.add(new ArrayList<>());
        }

        edges = new ArrayList<>();

        for(int i = 0; i < E; ++i){
            int u = scanner.nextInt();
            int v = scanner.nextInt();
            int c = scanner.nextInt();

            edges.add(new Edge(u, v, 0, c));
            edges.add(new Edge(v, u, 0, 0));
            int size = edges.size();
            graph.get(u).add(size - 2);
            graph.get(u).add(size - 1);
        }

        System.out.println(maxFlow(0, V - 1));
    }

    private int maxFlow(int s, int t){
        int V = graph.size();
        int[] dist = new int[V];
        int totalFlow = 0;
        while(dinicBFS(s, t, dist)){
            int flow;
            while((flow = dinicDFS(s, t, dist, new int[V], Integer.MAX_VALUE)) != 0){
                totalFlow += flow;
            }
        }

        return totalFlow;
    }

    private boolean dinicBFS(int s, int t, int[] dist){
        Arrays.fill(dist, -1);
        dist[s] = 0;
        LinkedList<Integer> queue = new LinkedList<>();
        queue.add(s);

        while(!queue.isEmpty()){
            int u = queue.remove();
            for(Integer i : graph.get(u)){
                Edge edge = edges.get(i);
                if(dist[edge.v] == -1 && edge.flow < edge.cap){
                    dist[edge.v] = dist[u] + 1;
                    queue.add(edge.v);
                }
            }
        }

        return dist[t] != -1;
    }

    private int dinicDFS(int u, int t, int[] dist, int[] cur, int flow){
        if(u == t){
            return flow;
        }

        List<Integer> adj = graph.get(u);
        for(; cur[u] < adj.size(); ++cur[u]){
            int index = adj.get(cur[u]);
            Edge edge = edges.get(index);
            if(dist[edge.v] == dist[u] + 1 && edge.flow < edge.cap){
                int df = dinicDFS(edge.v, t, dist, cur, Math.min(flow, edge.cap - edge.flow));
                if(df > 0){
                    edge.flow -= df;
                    edges.get(index ^ 1).flow += df;
                    return df;
                }
            }
        }

        return 0;
    }

    private static class Edge{
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
        private final InputStream in = System.in;
        private final byte[] buffer = new byte[1024];
        private int ptr = 0;
        private int buflen = 0;
        private boolean hasNextByte() {
            if(ptr < buflen) {
                return true;
            } else {
                ptr = 0;
                try {
                    buflen = in.read(buffer);
                } catch(IOException e) {
                    e.printStackTrace();
                }
                if(buflen <= 0) {
                    return false;
                }
            }
            return true;
        }
        private int readByte() { if (hasNextByte()) return buffer[ptr++]; else return -1;}
        private static boolean isPrintableChar(int c) { return 33 <= c && c <= 126;}
        private void skipUnprintable() { while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;}
        public boolean hasNext() { skipUnprintable(); return hasNextByte();}
        public String next() {
            if (!hasNext()) throw new NoSuchElementException();
            StringBuilder sb = new StringBuilder();
            int b = readByte();
            while(isPrintableChar(b)) {
                sb.appendCodePoint(b);
                b = readByte();
            }
            return sb.toString();
        }
        public long nextLong() {
            return Long.parseLong(next());
        }
        public int nextInt(){
            return Integer.parseInt(next());
        }
        public double nextDouble(){
            return Double.parseDouble(next());
        }
    }
}