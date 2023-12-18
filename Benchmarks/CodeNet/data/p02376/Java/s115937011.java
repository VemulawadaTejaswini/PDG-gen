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

        int[][] cap = new int[V][V];

        for(int i = 0; i < E; ++i){
            int u = scanner.nextInt();
            int v = scanner.nextInt();
            int c = scanner.nextInt();
            cap[u][v] = c;
        }

        System.out.println(maxFlow(cap, 0, V - 1));
    }

    private int maxFlow(int[][] cap, int s, int t){
        int total = 0;
        int flow;
        while ((flow = findPath(cap, new boolean[cap.length], s, t, Integer.MAX_VALUE)) != 0){
            total += flow;
        }

        return total;
    }

    private int findPath(int[][] cap , boolean[] visited, int u, int t, int flow){
        if(u == t){
            return flow;
        }

        visited[u] = true;
        int V = cap.length;

        for(int v = 0; v < V; ++v){
            if(!visited[v] && cap[u][v] > 0){
                int df = findPath(cap, visited, v, t, Math.min(cap[u][v], flow));
                if(df > 0){
                    cap[u][v] -= df;
                    cap[v][u] += df;
                    return df;
                }
            }
        }

        return 0;
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