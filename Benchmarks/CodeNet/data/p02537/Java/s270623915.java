import java.io.*;
import java.util.*;

public class Main {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static StringTokenizer st;

    private static int readInt() throws IOException {
        while (st == null || !st.hasMoreTokens()) st = new StringTokenizer(br.readLine());
        return Integer.parseInt(st.nextToken());
    }

    private static int[] readIntArray(final int n) throws IOException {
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = readInt();
        return a;
    }

    static class SegmentTree {
        int size;
        int[] max;

        SegmentTree(int n) {
            size = 1;
            while (size < n) size *= 2;
            max = new int[size * 2];
            Arrays.fill(max, Integer.MIN_VALUE);
        }

        void set(int i, int v, int x, int lx, int rx) {
            if (rx - lx == 1) {
                max[x] = v;
                return;
            }
            int m = (lx + rx) / 2;
            if (i < m) {
                set(i, v, 2 * x + 1, lx, m);
            } else {
                set(i, v, 2 * x + 2, m, rx);
            }
            max[x] = Math.max(max[2 * x + 1], max[2 * x + 2]);
        }

        void set(int i, int v) {
            set(i, v, 0, 0, size);
        }

        int max(int l, int r) {
            return max(l, r, 0, 0, size);
        }

        int max(int l, int r, int x, int lx, int rx) {
            if (lx >= r || rx <= l) return Integer.MIN_VALUE;
            if (lx >= l && rx <= r) return max[x];
            int m = (lx + rx) / 2;
            int maxL = max(l, r, 2 * x + 1, lx, m);
            int maxR = max(l, r, 2 * x + 2, m, rx);
            return Math.max(maxL, maxR);
        }
    }

    static final int MAX_INDEX = 3000000;
    static final int MIN_INDEX = 1;

    public static void main(String[] args) throws IOException {
        int n = readInt();
        int k = readInt();

        SegmentTree st = new SegmentTree(MAX_INDEX + 1);
        for (int i = 0; i < n; i++) {
            int a = readInt();
            int maxForA = st.max(Math.max(1, a - k), Math.min(MAX_INDEX, a + k) + 1);
            st.set(a, Math.max(1, maxForA + 1));
        }

        System.out.println(st.max(1, MAX_INDEX + 1));
    }
}