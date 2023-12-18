import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;
import java.util.function.IntUnaryOperator;
import java.util.function.LongUnaryOperator;

public class Main {
    static In in = new In();
    static Out out = new Out();
    static final long mod = 1000000007;
    static final long inf = 0x1fffffffffffffffL;
    static final int iinf = 0x3fffffff;
    static final int[] da = {-1, 0, 1, 0, -1, 1, 1, -1, -1};

    int d;
    int[] c;
    int[][] s;
    int[] ans;
    int cs;
    Random rand = new Random();
    int count = 3;
    void solve() {
        long start = System.nanoTime();
        d = in.nextInt();
        c = in.nextIntArray(26);
        s = new int[d][26];
        for (int i = 0; i < 26; i++) {
            cs += c[i];
        }
        for (int i = 0; i < d; i++) {
            for (int j = 0; j < 26; j++) {
                s[i][j] = in.nextInt();
            }
        }
        ans = new int[d];
        int[] last = new int[26];
        for (int i = 0; i < d; i++) {
            long minus = 0;
            for (int j = 0; j < 26; j++) {
                minus += calcMinus(j, i, last);
            }
            int mi = 0;
            int mv = -iinf;
            for (int j = 0; j < 26; j++) {
                int add = s[i][j];
                add += calcMinus(j, i, last) * 1.33;
                if (mv < add) {
                    mv = add;
                    mi = j;
                }
            }
            score += s[i][mi] + calcMinus(mi, i, last) - minus;
            ans[i] = mi;
            last[mi] = i + 1;
        }
        score = calcScore(ans);
        while (System.nanoTime() - start < 1900000000) {
            count++;
            ans = change(ans, score);
        }
        for (int i : ans) {
            out.println(i + 1);
        }
    }

    long score;
    int[] change(int[] old, long oldScore) {
        int[] newAns = Arrays.copyOf(old, d);
        int[] last = new int[26];
        int maxi = -1;
        int maxj = -1;
        int maxlast = -1;
        int maxv = -1;
        int newScore = 0;
        for (int i = 1; i <= d; i++) {
            int v = old[i - 1];
            last[v] = i;
            newScore += s[i - 1][v];
            for (int j = 0; j < 26; j++) {
                newScore -= c[j] * (i - last[j]);
                if (i - last[j] > maxv) {
                    maxlast = last[j];
                    maxi = i - 1;
                    maxj = j;
                }
            }
        }
        int change = maxlast + 1 + (int)(Math.sqrt(Math.max(0, maxi - maxlast)));
        change = Math.min(Math.max(change, maxlast), maxi);
        newAns[change] = maxj;
        newScore = calcScore(newAns);
        if (newScore > oldScore) {
            score = newScore;
            return newAns;
        } else {
            newAns = random(old, oldScore);
            return newAns;
        }
    }

    int[] random(int[] old, long oldScore) {
        int[] newAns = Arrays.copyOf(old, d);
        int ci = rand.nextInt(d);
        int cv = rand.nextInt(26);
        newAns[ci] = cv;
        int newScore = calcScore(newAns);
        if (newScore >= oldScore) {
            score = newScore;
            return newAns;
        }
        return old;
    }

    int calcScore(int[] ans) {
        int[] last = new int[26];
        int score = 0;
        int minus = 0;
        for (int i = 1; i <= d; i++) {
            int v = ans[i - 1];
            minus += cs - c[v] * (i - last[v]);
            score += s[i - 1][v] - minus;
            last[v] = i;
        }
        return Math.max(1000000 + score, 0);
    }

    int calcMinus(int i, int day, int[] last) {
        return c[i] * (day - last[i] + 1);
    }

    public static void main(String[]$) {
        new Main().solve();
        out.flush();
    }
}

class In {
    private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in), 0x10000);
    private StringTokenizer tokenizer;

    String next() {
        try {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                tokenizer = new StringTokenizer(reader.readLine());
            }
        } catch (IOException ignored) {
        }
        return tokenizer.nextToken();
    }

    int nextInt() {
        return Integer.parseInt(next());
    }

    long nextLong() {
        return Long.parseLong(next());
    }

    char[] nextCharArray() {
        return next().toCharArray();
    }

    char[][] nextCharGrid(int n, int m) {
        char[][] a = new char[n][m];
        for (int i = 0; i < n; i++) {
            a[i] = next().toCharArray();
        }
        return a;
    }

    int[] nextIntArray(int n) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = nextInt();
        }
        return a;
    }

    int[] nextIntArray(int n, IntUnaryOperator op) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = op.applyAsInt(nextInt());
        }
        return a;
    }

    long[] nextLongArray(int n) {
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = nextLong();
        }
        return a;
    }

    long[] nextLongArray(int n, LongUnaryOperator op) {
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = op.applyAsLong(nextLong());
        }
        return a;
    }

    List<List<Integer>> nextEdges(int n, int m) {
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            res.add(new ArrayList<>());
        }
        for (int i = 0; i < m; i++) {
            int u = nextInt() - 1;
            int v = nextInt() - 1;
            res.get(u).add(v);
            res.get(v).add(u);
        }
        return res;
    }
}

class Out {
    private PrintWriter out = new PrintWriter(System.out);
    boolean autoFlush = false;

    void println(Object... a) {
        StringJoiner joiner = new StringJoiner(" ");
        for (Object obj : a) {
            joiner.add(String.valueOf(obj));
        }
        out.println(joiner);
        if (autoFlush) {
            out.flush();
        }
    }

    void println(char[] s) {
        out.println(String.valueOf(s));
        if (autoFlush) {
            out.flush();
        }
    }

    void println(int[] a) {
        StringJoiner joiner = new StringJoiner(" ");
        for (int i : a) {
            joiner.add(Integer.toString(i));
        }
        out.println(joiner);
        if (autoFlush) {
            out.flush();
        }
    }

    void println(long[] a) {
        StringJoiner joiner = new StringJoiner(" ");
        for (long i : a) {
            joiner.add(Long.toString(i));
        }
        out.println(joiner);
        if (autoFlush) {
            out.flush();
        }
    }

    void flush() {
        out.flush();
    }
}
