import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args) throws Exception {
        new Main().solve();
    }

    private void solve() throws Exception{
        FastScanner scanner = new FastScanner();
        int V = scanner.nextInt();
        int E = scanner.nextInt();

        int[][] rGraph = new int[V][V];

        for(int i = 0; i < E; ++i){
            int u = scanner.nextInt();
            int v = scanner.nextInt();
            int c = scanner.nextInt();

            rGraph[u][v] = c;
        }

        int[] parent = new int[V];
        int totalFlow = 0;
        while(existPath(rGraph, 0, V - 1, parent)){
            int pathFlow = Integer.MAX_VALUE;

            for(int v = V - 1; v != 0; v = parent[v]){
                int u = parent[v];
                pathFlow = Math.min(pathFlow, rGraph[u][v]);
            }

            totalFlow += pathFlow;

            for(int v = V - 1; v != 0; v = parent[v]){
                int u = parent[v];
                rGraph[u][v] -= pathFlow;
                rGraph[v][u] += pathFlow;
            }
        }

        System.out.println(totalFlow);
    }

    private boolean existPath(int[][] rGraph, int s, int t, int[] parent){
        int V = rGraph.length;
        boolean[] visited = new boolean[V];

        LinkedList<Integer> queue = new LinkedList<>();
        queue.add(s);
        parent[s] = -1;

        while(!queue.isEmpty()){
            int u = queue.remove();
            visited[u] = true;

            for(int v = 0; v < V; ++v){
                if(!visited[v] && rGraph[u][v] > 0){
                    parent[v] = u;
                    queue.add(v);
                }
            }
        }

        return visited[t];
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