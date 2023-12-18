

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

public final class Main {

    public static void main(String[] args) {
        final FastScanner fs = new FastScanner();
        final int n = fs.nextInt();
        final int m = fs.nextInt();
        final int mines = fs.nextInt();
        final int[] rows = new int[n + 1];
        final int[] cols = new int[m + 1];
        final Set<String> seen = new HashSet<>();
        int maxR = 0;
        int maxC = 0;
        for (int i = 0; i < mines; i++) {
            final int x = fs.nextInt();
            final int y = fs.nextInt();
            maxR = Math.max(maxR, ++rows[x]);
            maxC = Math.max(maxC, ++cols[y]);
            seen.add(x + "," + y);
        }
        final List<Integer> maxRows = new ArrayList<>();
        final List<Integer> maxCols = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (rows[i] == maxR) {
                maxRows.add(i);
            }
        }
        for (int i = 1; i <= m; i++) {
            if (cols[i] == maxC) {
                maxCols.add(i);
            }
        }
        int res = 0;
        for (int r : maxRows) {
            for (int c : maxCols) {
                final int curr = maxR + maxC - (seen.contains(r + "," + c) ? 1 : 0);
                res = Math.max(res, curr);
            }
        }
        System.out.println(res);
    }

    static class FastScanner {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer("");

        String next() {
            while (!st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    //noinspection CallToPrintStackTrace
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        int[] readArray(int n) {
            final int[] a = new int[n];
            for (int i = 0; i < n; i++) { a[i] = nextInt(); }
            return a;
        }

        long nextLong() {
            return Long.parseLong(next());
        }
    }
}
