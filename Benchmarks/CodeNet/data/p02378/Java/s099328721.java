import java.io.*;
import java.util.*;

public class Main implements Runnable{
    private int[][] weight;
    private int X;
    private int Y;
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

        X = scanner.nextInt();
        Y = scanner.nextInt();
        int E = scanner.nextInt();

        if(X == 0 || Y == 0 || E == 0){
            System.out.println("0");
            return;
        }

        weight = new int[X][Y];

        for(int i = 0; i < E; ++i){
            int u = scanner.nextInt();
            int v = scanner.nextInt();
            int w = 1;

            weight[u][v] = w;
        }

        int km = KM();
        if(km != -1){
            System.out.println(km);
        }
        else{
            System.out.println(maxKMP());
        }
    }

    private int maxKMP(){
        int[] match = new int[Y];
        Arrays.fill(match, -1);
        int result = 0;
        for(int u = 0; u < X; ++u){
            if(existPath(u, new boolean[Y], match)){
                ++result;
            }
        }
        
        return result;
    }
    
    private int KM(){
        int[] lx = new int[X];
        int[] ly = new int[Y];

        initLx(lx);
        int[] match = new int[Y];
        Arrays.fill(match, -1);

        for(int u = 0; u < X; ++u){
            while(true){
                boolean[] visitedX = new boolean[X];
                boolean[] visitedY = new boolean[Y];
                if(existPath(u, lx, ly, visitedX, visitedY, match)){
                    break;
                }

                int d = Integer.MAX_VALUE;
                for(int i = 0; i < X; ++i){
                    if(!visitedX[i]){
                        continue;
                    }
                    for(int j = 0; j < Y; ++j){
                        if(visitedY[j]){
                            continue;
                        }

                        d = Math.min(lx[i] + ly[j] - weight[i][j], d);
                    }
                }

                if(d == Integer.MAX_VALUE){
                    return -1;
                }

                for(int i = 0; i < X; ++i){
                    if(visitedX[i]){
                        lx[i] -= d;
                    }
                }

                for(int j = 0; j < Y; ++j){
                    if(visitedY[j]){
                        ly[j] += d;
                    }
                }
            }
        }

        int maxWeight = 0;
        for(int j = 0; j < Y; ++j){
            if(match[j] != -1){
                maxWeight += weight[match[j]][j];
            }
        }

        return maxWeight;
    }
    
    private boolean existPath(int u, boolean[] visited, int[] match){
        for(int v = 0; v < Y; ++v){
            if(!visited[v] && weight[u][v] > 0){
                visited[v] = true;
                
                if(match[v] < 0 || existPath(match[v], visited, match)){
                    match[v] = u;
                    return true;
                }
            }
        }
        
        return false;
    }

    private boolean existPath(int u, int[] lx, int[] ly, boolean[] visitedX, boolean[] visitedY, int[] match){
        visitedX[u] = true;
        for(int v = 0; v < Y; ++v){
            if(!visitedY[v] && lx[u] + ly[v] == weight[u][v]){
                visitedY[v] = true;

                if(match[v] < 0 || existPath(match[v], lx, ly, visitedX, visitedY, match)){
                    match[v] = u;
                    return true;
                }
            }
        }

        return false;
    }

    private void initLx(int[] lx){
        for(int i = 0; i < X; ++i){
            lx[i] = weight[i][0];

            for(int j = 1; j < Y; ++j){
                lx[i] = Math.max(lx[i], weight[i][j]);
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