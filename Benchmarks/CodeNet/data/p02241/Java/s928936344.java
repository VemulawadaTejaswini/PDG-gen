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
    static int[][] mm;
    static int[] minarray;
    static boolean[] pl;

   public static void main(String[] args) {
        FS fs = new FS();
        int n = fs.nextInt();
        mm = new int[n][n];
        minarray = new int[n];
        pl = new boolean[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int k = fs.nextInt();
                mm[i][j] = k == -1 ? Integer.MAX_VALUE : k;
            }
        }
        pl[0] = true;
        int count = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            minarray[i] = mm[0][i];
        }
        for (int i = 0; i < n; i++) {
            int v = 0;
            for (int j = 0; j < n; j++) {
                if (!pl[j] &&minarray[j] < minarray[v]) {
                    v = j;
                }
            }
            if (v==0){
                break;
            }
            pl[v] = true;
            count += minarray[v];
            for (int j = 0; j < n; j++) {
                if (pl[j]){
                    continue;
                }
                minarray[j] = Math.min(mm[v][j], minarray[j]);
            }
        }
        System.out.println(count);
    }
}
