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
    static Disjoint[] set;
    static int[] h;

    public static void main(String[] args) {
        FS fs = new FS();
        int m = fs.nextInt();
        int n = fs.nextInt();
        set = new Disjoint[m];
        h = new int[m];
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m; i++) {
            set[i] = new Disjoint(i);
        }
        for (int i = 0; i < n; i++) {
            int a = fs.nextInt();
            if (a == 0) {
                int b = fs.nextInt();
                int c = fs.nextInt();
                if (findSet(b) != findSet(c)) {
                    unite(b, c);
                }
            } else {
                int b = fs.nextInt();
                int c = fs.nextInt();
                if (findSet(b) == findSet(c)) {
                    sb.append("1\n");
                } else {
                    sb.append("0\n");
                }
            }
        }
        System.out.print(sb);
    }

    private static void unite(int b, int c) {
        if (set[b].parent == null) {
            set[b].parent = set[c].parent == null ? set[c] : set[c].parent;
        } else {
            int p = findSet(b);
            set[p].parent = set[c];
        }
    }

    private static int findSet(int b) {
        boolean j = false;
        int h = set[b].value;
        while (set[h].parent != null) {
            j = true;
            h = set[h].parent.value;
        }
        if (j) {
            set[b].parent = set[h];
        }
        return h;
    }
}

class Disjoint {
    Integer value;
    Disjoint parent;

    public Disjoint(Integer value) {
        this.value = value;
    }
}
