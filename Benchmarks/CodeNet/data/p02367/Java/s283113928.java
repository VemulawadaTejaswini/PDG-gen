import java.io.*;
import java.util.*;

public class Main implements Runnable{
    private ArrayList<ArrayList<Integer>> graph;
    private int clock;
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
        FastScanner scanner = new FastScanner(System.in);

        int V = scanner.nextInt();
        int E = scanner.nextInt();

        graph = new ArrayList<>(V);

        for(int i = 0; i < V; ++i){
            graph.add(new ArrayList<Integer>());
        }

        for(int i = 0; i < E; ++i){
            int u = scanner.nextInt();
            int v = scanner.nextInt();

            graph.get(u).add(v);
            graph.get(v).add(u);
        }
        clock = 0;

        boolean[] visited = new boolean[V];
        int[] parent = new int[V];
        int[] disc = new int[V];
        int[] low = new int[V];
        Set<int[]> result = new TreeSet<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[0] != o2[0]){
                    return o1[0] - o2[0];
                }
                else{
                    return o1[1] - o2[1];
                }
            }
        });

        if(V > 0){
            parent[0] = -1;
            dfs(0, visited, parent, disc, low, result);
        }

        PrintWriter printWriter = new PrintWriter(System.out);
        Iterator<int[]> iter = result.iterator();
        while(iter.hasNext()){
            int[] pair = iter.next();
            printWriter.println(pair[0] + " " + pair[1]);
        }
        printWriter.flush();
    }

    private void dfs(int u, boolean[] visited, int[] parent, int[] disc, int[] low, Set<int[]> result){
        visited[u] = true;
        disc[u] = low[u] = ++clock;

        for(int v : graph.get(u)){
            if(!visited[v]){
                parent[v] = u;
                dfs(v, visited, parent, disc, low, result);

                low[u] = Math.min(low[u], low[v]);

                if(low[v] > disc[u]){
                    int[] temp = new int[2];
                    temp[0] = Math.min(u, v);
                    temp[1] = Math.max(u, v);
                    result.add(temp);
                }
            }
            else if(v != parent[u]){
                low[u] = Math.min(low[u], disc[v]);
            }
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