import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;

 class FS {
    private final InputStream in = System.in;
    private final byte[] buffer = new byte[1024];
    private int ptr = 0;
    private int buflen = 0;

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
        return hasNextByte() ? buffer[ptr++] : -1;
    }

    private boolean isPrintableChar(int c) {
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

    public int nextInt() {
        return (int) nextLong();
    }

    public long nextLong() {
        if (!hasNext()) throw new NoSuchElementException();
        long n = 0;
        boolean minus = false;
        int b = readByte();
        if (b == '-') {
            minus = true;
            b = readByte();
        }
        if (b < '0' || '9' < b) {
            throw new NumberFormatException();
        }
        while (true) {
            if ('0' <= b && b <= '9') {
                n *= 10;
                n += b - '0';
            } else if (b == -1 || !isPrintableChar(b)) {
                return minus ? -n : n;
            } else {
                throw new NumberFormatException();
            }
            b = readByte();
        }
    }
}
public class Main {
    static int[][] graph;
    static int n;
    static int[] minPath;

    public static void main(String[] args) {
        FS fs = new FS();
        n = fs.nextInt();
        minPath = new int[n];
        boolean[] pl = new boolean[n];
        int[] minarray = new int[n];
        graph = new int[n][n];
        for (int i = 0; i < n; i++) {
            int id = fs.nextInt();
            int degree = fs.nextInt();
            for (int j = 0; j < degree; j++) {
                graph[id][fs.nextInt()] = fs.nextInt();
            }
        }
        pl[0] = true;
        for (int i = 0; i < n; i++) {
            minarray[i] = graph[0][i] == 0 ? Integer.MAX_VALUE : graph[0][i];
        }
        //int k =1;
        for (int i = 0; i < n; i++) {
            int v = 0;
            for (int j = 0; j < n; j++) {
                if (!pl[j] && minarray[j] != 0 && minarray[j] < minarray[v]) {
                    v = j;
                }
            }
            if (v==0){
                break;
            }
            pl[v] = true;
            minPath[v] = minarray[v];
            for (int j = 0; j < n; j++) {
                if (pl[j] || graph[v][j] == 0) {
                    continue;
                }
                minarray[j] = Math.min(minarray[j], graph[v][j] + minPath[v]);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(i).append(" ").append(minPath[i]).append("\n");
        }
        System.out.print(sb);
    }
}
