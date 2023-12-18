import java.io.*;
import java.util.*;
import java.util.function.Function;

public class Main {

    static int H, W;
    static long L;
    static char[][] C;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        while(true) {
            H = sc.nextInt();
            W = sc.nextInt();
            L = sc.nextLong();

            if( H == 0 ) break;

            C = new char[H][];
            for (int i = 0; i < H; i++) {
                C[i] = sc.next().toCharArray();
            }

            pw.println(solve());
        }
        pw.flush();
    }

    static int[] DH = {-1, 0, 1, 0};
    static int[] DW = {0, 1, 0, -1};
    static String NESW = "NESW";

    static String solve() {
        int sh = -1, sw = -1, sd = -1;
        findStart:
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                if( C[i][j] != '#' && C[i][j] != '.' ) {
                    sh = i;
                    sw = j;
                    sd = NESW.indexOf(C[i][j]);
                    break findStart;
                }
            }
        }

        Map<Key, Integer> cords = new HashMap<>();
        Key[] keys = new Key[H*W];
        int ch = sh, cw = sw, cd = sd;
        int cnt = 0;
        cords.put(new Key(ch, cw, cd), cnt);
        keys[cnt] = new Key(ch, cw, cd);
        cnt++;
        int loopStart;
        int loopLength;
        lo:
        while(true) {
            for (int i = 0; i < 4; i++) {
                int nd = (cd + i)%4;
                int nh = ch + DH[nd];
                int nw = cw + DW[nd];

                if( inRange(nh, nw) && C[nh][nw] != '#' ) {
                    Key key = new Key(nh, nw, nd);
                    if( cords.containsKey(key) ) {
                        // loop found
                        loopStart = cords.get(key);
                        loopLength = cnt - loopStart;
                        break lo;
                    } else {
                        cords.put(key, cnt);
                        keys[cnt] = key;
                        ch = nh;
                        cw = nw;
                        cd = nd;
                        cnt++;
                        continue lo;
                    }
                }
            }
            throw new RuntimeException("wtf");
        }

        Key key;
        if( L < cnt ) {
            key = keys[(int)L];

        } else {
            int r = (int)((L-loopStart) % loopLength);
            key = keys[loopStart + r];
        }

        return (key.h+1) + " " + (key.w+1) + " " + NESW.charAt(key.d);
    }

    static boolean inRange(int h, int w) {
        return 0 <= h && h < H && 0 <= w && w < W;
    }

    static class Key {
        int h, w, d;

        public Key(int h, int w, int d) {
            this.h = h;
            this.w = w;
            this.d = d;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Key key = (Key) o;
            return h == key.h &&
                    w == key.w &&
                    d == key.d;
        }

        @Override
        public int hashCode() {
            return Objects.hash(h, w, d);
        }
    }

    @SuppressWarnings("unused")
    static class FastScanner {
        private BufferedReader reader;
        private StringTokenizer tokenizer;

        FastScanner(InputStream in) {
            reader = new BufferedReader(new InputStreamReader(in));
            tokenizer = null;
        }

        String next() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        String nextLine() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    return reader.readLine();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken("\n");
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        int[] nextIntArray(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = nextInt();
            return a;
        }

        int[] nextIntArray(int n, int delta) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = nextInt() + delta;
            return a;
        }

        long[] nextLongArray(int n) {
            long[] a = new long[n];
            for (int i = 0; i < n; i++)
                a[i] = nextLong();
            return a;
        }
    }

    static <A> void writeLines(A[] as, Function<A, String> f) {
        PrintWriter pw = new PrintWriter(System.out);
        for (A a : as) {
            pw.println(f.apply(a));
        }
        pw.flush();
    }

    static void writeLines(int[] as) {
        PrintWriter pw = new PrintWriter(System.out);
        for (int a : as) pw.println(a);
        pw.flush();
    }

    static void writeLines(long[] as) {
        PrintWriter pw = new PrintWriter(System.out);
        for (long a : as) pw.println(a);
        pw.flush();
    }

    static int max(int... as) {
        int max = Integer.MIN_VALUE;
        for (int a : as) max = Math.max(a, max);
        return max;
    }

    static int min(int... as) {
        int min = Integer.MAX_VALUE;
        for (int a : as) min = Math.min(a, min);
        return min;
    }

    static void debug(Object... args) {
        StringJoiner j = new StringJoiner(" ");
        for (Object arg : args) {
            if (arg instanceof int[]) j.add(Arrays.toString((int[]) arg));
            else if (arg instanceof long[]) j.add(Arrays.toString((long[]) arg));
            else if (arg instanceof double[]) j.add(Arrays.toString((double[]) arg));
            else if (arg instanceof Object[]) j.add(Arrays.toString((Object[]) arg));
            else j.add(arg.toString());
        }
        System.err.println(j.toString());
    }
}

