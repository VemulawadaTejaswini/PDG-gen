import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Vector;
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
@SuppressWarnings("unchecked")
public class Main {
    static Vector<Integer> vector[];
    static ArrayDeque<Integer> deque = new ArrayDeque<Integer>();
    static int[] d;

    public static void main(String[] args) {
        FS fs = new FS();
        int n = fs.nextInt();
        int m = fs.nextInt();
        vector = new Vector[n];
        d = new int[n];
        for (int i = 0; i < n; i++) {
            Vector<Integer> vec = new Vector<Integer>();
            vector[i] = vec;
        }
        for (int i = 0; i < m; i++) {
            int a = fs.nextInt();
            int b = fs.nextInt();

            vector[a].add(b);
            vector[b].add(a);
        }

        int p = 1;
        for (int i = 0; i < n; i++) {
            if (d[i] == 0) {
                dfs(i, p);
                p++;
            }
        }
        int i = fs.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int j = 0; j < i; j++) {
            boolean b = false;
            int a = fs.nextInt();
            int bb = fs.nextInt();
            if (d[a] == d[bb]) {
                b = true;
            }
            sb.append(b ? "yes\n" : "no\n");
        }
        System.out.print(sb);
    }

    private static void dfs(int n, int p) {
        deque.push(n);
        d[n] = p;
        while (!deque.isEmpty()) {
            Integer peek = deque.peek();
            int next = findNext(peek);
            if (next == -1) {
                deque.poll();
            } else {
                deque.push(next);
                d[next] = p;
            }

        }
    }

    private static int findNext(Integer peek) {
        for (int i = 0; i < vector[peek].size(); i++) {
            if (d[vector[peek].get(i)] == 0) {
                return vector[peek].get(i);
            }
        }
        return -1;
    }
}

