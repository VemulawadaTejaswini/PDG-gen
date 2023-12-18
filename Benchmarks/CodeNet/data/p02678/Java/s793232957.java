import java.text.DecimalFormat;
import java.util.stream.LongStream;
import java.util.stream.IntStream;
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);

        AtCoder problem = new AtCoder(sc);
        problem.solve(out);

        out.flush();
    }

}

class AtCoder {

    /* 変数宣言 */
    final int N, M;
    List<List<Integer>> root;

    AtCoder(FastScanner sc) {
        N = sc.nextInt();
        M = sc.nextInt();

        root = new ArrayList<>();
        for (int i = 0; i <= N; i++) {
            root.add(new ArrayList<>());
        }
        root.get(0).add(0);
        for (int i = 0; i < M; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            root.get(a).add(b);
            root.get(b).add(a);
        }
    }

    void solve(PrintWriter out) {
        List<Integer> visited = new ArrayList<>();
        ArrayDeque<Integer> roomList = new ArrayDeque<>();
        int[] sign = new int[N];

        // System.out.println("root = " + root);

        roomList.add(1);
        visited.add(1);
        // System.out.println("visted=" + visited+", roomList="+roomList);

        for (int i = 1; i <= N && visited.size() < N; i++) {
            int curr_room = roomList.pollFirst();
            for (Integer r : root.get(curr_room)) {
                if (!visited.contains(r)) {
                    sign[r - 1] = curr_room;
                    roomList.add(r);
                    visited.add(r);
                    // System.out.println("visted=" + visited+", roomList="+roomList);
                }

            }
        }
        // System.out.println(roomList);
        // System.out.println(roomList.size());
        if (visited.size() == N) {
            System.out.println("Yes");
            for (int i = 1; i < sign.length; i++) {
                System.out.println(sign[i]);
            }
        } else {
            System.out.println("No");
        }
    }
}

// https://qiita.com/p_shiki37/items/a0f6aac33bf60f5f65e4
class FastScanner {

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
        if (hasNextByte()) {
            return buffer[ptr++];
        } else {
            return -1;
        }
    }

    private static boolean isPrintableChar(int c) {
        return 33 <= c && c <= 126;
    }

    public boolean hasNext() {
        while (hasNextByte() && !isPrintableChar(buffer[ptr])) {
            ptr++;
        }
        return hasNextByte();
    }

    public String next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        StringBuilder sb = new StringBuilder();
        int b = readByte();
        while (isPrintableChar(b)) {
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }

    public long nextLong() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
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

    public int nextInt() {
        long nl = nextLong();
        if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) {
            throw new NumberFormatException();
        }
        return (int) nl;
    }

    public double nextDouble() {
        return Double.parseDouble(next());
    }
}