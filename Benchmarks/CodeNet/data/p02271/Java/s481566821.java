import java.io.*;

public class Main {


    void solve() {
        int n = io.nextInt();
        int[] A = new int[n];
        for(int i = 0; i < n; i++) {
            A[i] = io.nextInt();
        }
        int q = io.nextInt();
        int[] m = new int[q];
        for(int i = 0; i < q; i++) {
            m[i] = io.nextInt();
        }

        for(int x : m) {
            System.out.println(f(x, A, 0, 0) ? "yes" : "no");
        }

    }

    boolean f(int n, int[] A, int idx, int sum) {
        if(idx == A.length) return n == sum;
        return f(n, A, idx+1, sum+A[idx]) || f(n, A, idx+1, sum);
    }

    public static void main(String[] args) {
        new Main().solve();
    }
    IO io = new IO();

    class IO {
        private final int SIZE = 1 << 12;
        private final InputStream stream = System.in;
        private final byte[] buffer = new byte[SIZE];
        private int ptr = 0, buffLen = 0;
        private boolean hasNextByte() {
            if(ptr < buffLen) return true;
            ptr = 0;
            try {
                buffLen = stream.read(buffer);
            } catch (IOException e) {
                e.printStackTrace();
            }
            return buffLen > 0;
        }
        private byte readByte() {
            if(hasNextByte()) return buffer[ptr++];
            return -1;
        }
        private boolean isAscii(byte i) {
            return '!' <= i && i <= '~';
        }
        public char nextChar() {
            byte b = readByte();
            while(!isAscii(b)) b = readByte();
            return (char)b;
        }
        public String next() {
            StringBuilder sb = new StringBuilder();
            byte b = readByte();
            while(isAscii(b)) {
                sb.append((char)b);
                b = readByte();
            }
            return sb.toString();
        }
        public int nextInt() {
            return Integer.valueOf(next());
        }
        public long nextLong() {
            return Long.valueOf(next());
        }
        public double nextDouble() {
            return Double.valueOf(next());
        }
    }
}

