import java.util.Arrays;
import java.util.function.IntBinaryOperator;

public class Main {
    static long INF = 1l << 60;
    public static void main(String[] args) {
        var sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        char[][] s = new char[n][];
        long[] c = new long[n];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next().toCharArray();
            c[i] = sc.nextLong();
        }
        int m = 21;
        long[][] g = new long[2 * m * n + 2][2 * m * n + 2];
        IntBinaryOperator sliceBack = (i, k) -> m * i + k;
        IntBinaryOperator sliceFront = (i, k) -> m * (n + i) + k;
        int beg = 2 * m * n, end = 2 * m * n + 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int li = s[i].length;
                int lj = s[j].length;
                for (int ki = 0; ki < li; ki++) {
                    if (lj >= li - ki) {
                        int kj = lj - (li - ki);
                        String fi = cut(s[i], ki, li);
                        String bj = cutAndReverse(s[j], kj, lj);
                        if (fi.equals(bj)) {
                            g[sliceBack.applyAsInt(i, ki)][sliceFront.applyAsInt(j, kj)] = c[j];
                        }
                    } else {
                        String fi = cut(s[i], ki, ki + lj);
                        String bj = cutAndReverse(s[j], 0, lj);
                        if (fi.equals(bj)) {
                            g[sliceBack.applyAsInt(i, ki)][sliceBack.applyAsInt(i, ki + lj)] = c[j];
                        }
                    }
                }
                for (int ki = 1; ki <= li; ki++) {
                    if (lj >= ki) {
                        int kj = ki;
                        String bi = cutAndReverse(s[i], 0, ki);
                        String fj = cut(s[j], 0, kj);
                        if (bi.equals(fj)) {
                            g[sliceFront.applyAsInt(i, ki)][sliceBack.applyAsInt(j, kj)] = c[j];
                        }
                    } else {
                        String bi = cutAndReverse(s[i], ki - lj, ki);
                        String fj = cut(s[j], 0, lj);
                        if (bi.equals(fj)) {
                            g[sliceFront.applyAsInt(i, ki)][sliceFront.applyAsInt(i, ki - lj)] = c[j];
                        }
                    }
                }
            }
        }
        for (int i = 0; i < n; i++) {
            int li = s[i].length;
            g[beg][sliceFront.applyAsInt(i, li)] = c[i];
            g[beg][sliceBack.applyAsInt(i, 0)] = c[i];
            for (int k = 0; k <= li; k++) {
                String fi = cut(s[i], 0, k);
                String rfi = cutAndReverse(s[i], 0, k);
                if (fi.equals(rfi)) {
                    g[sliceFront.applyAsInt(i, k)][end] = 0;
                }
                String bi = cut(s[i], k, li);
                String rbi = cutAndReverse(s[i], k, li);
                if (bi.equals(rbi)) {
                    g[sliceBack.applyAsInt(i, k)][end] = 0;
                }
            }
        }
        long res = solve(g, beg, end);
        System.out.println(res < INF ? res : -1);
    }

    static String cutAndReverse(char[] s, int from, int to) {
        int l = to - from;
        char[] cut = new char[l];
        for (int i = 0; i < l; i++) cut[i] = s[to - i - 1];
        int i = 0, j = l;
        while (j > i) {char tmp = cut[i]; cut[i--] = cut[--j]; cut[j] = tmp;}
        return String.valueOf(cut);
    }

    static String cut(char[] s, int from, int to) {
        int l = to - from;
        char[] cut = new char[l];
        for (int i = 0; i < l; i++) {
            cut[i] = s[to - i - 1];
        }
        return String.valueOf(cut);
    }

    static long solve(long[][] edge, int s, int t) {
        int n = edge.length;
        long[] dist = new long[n];
        Arrays.fill(dist, INF);
        boolean[] settled = new boolean[n];
        while (true) {
            int u = -1;
            long min = INF;
            for (int i = 0; i < n; i++) if (dist[i] < min && !settled[i]) {u = i; min = dist[i];}
            if (u < 0) break;
            settled[u] = true;
            for (int v = 0; v < n; v++) if (edge[u][v] >= 0 && dist[u] + edge[u][v] < dist[v]) dist[v] = dist[u] + edge[u][v];
        }
        return dist[t];
    }
}