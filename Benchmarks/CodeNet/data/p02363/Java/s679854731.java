import java.io.*;
import java.util.*;

public class Main {
    private static final int MAX = (int)2e7 + 1;
    public static void main(String[] args) throws Exception {
        new Main().solve();
    }

    //Floyd-Warshall's Algorithm
    private void solve() throws Exception{
        FastScanner scanner = new FastScanner(System.in);

        int V = scanner.nextInt();
        int E = scanner.nextInt();

        long[][] dist = new long[V][V];
        for(int i = 0; i < V; ++i){
            Arrays.fill(dist[i], MAX);
            dist[i][i] = 0;
        }

        for(int i = 0; i < E; ++i){
            int u = scanner.nextInt();
            int v = scanner.nextInt();
            int w = scanner.nextInt();

            dist[u][v] = w;
        }

        for(int k = 0; k < V; ++k){
            for(int i = 0; i < V; ++i){
                for(int j = 0; j < V; ++j){
                    if(dist[i][k] != MAX && dist[k][j] != MAX && dist[i][j] > dist[i][k] + dist[k][j]){
                        dist[i][j] = dist[i][k] + dist[k][j];
                    }
                }

                if(dist[i][i] < 0){
                    System.out.println("NEGATIVE CYCLE");
                    return;
                }
            }
        }

        PrintWriter printWriter = new PrintWriter(System.out);
        for(int i = 0; i < V; ++i){
            for(int j = 0; j < V; ++j){
                printWriter.print(dist[i][j] == MAX ? "INF" : dist[i][j]);

                if(j != V - 1){
                    printWriter.print(" ");
                }
                else{
                    printWriter.println();
                }
            }
        }

        printWriter.flush();
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