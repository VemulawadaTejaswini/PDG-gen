import java.io.*;
import java.util.*;

public class Main {

    private static FastReader in = new FastReader(System.in);
    private static PrintWriter out = new PrintWriter(System.out);

    private static final long MOD = (long) 1e9 + 7;

    public static void main(String[] args) {
        solve();
        out.flush();
    }

    private static int ans = 0;

    private static void solve() {
        int h = in.nextInt();
        int w = in.nextInt();
        int k = in.nextInt();

        // true if black
        boolean[][] grid = new boolean[h][w];
        for (int i = 0; i < h; i++) {
            String row = in.next();
            char[] charArray = row.toCharArray();
            for (int j = 0; j < charArray.length; j++) {
                char c = charArray[j];
                grid[i][j] = c == '#';
            }
        }

        chooseRows(grid, new boolean[h], 0, k);

        out.println(ans);
    }

    private static void chooseRows(boolean[][] grid, boolean[] rows, int row, int k) {
        if (row == rows.length) {
            chooseCols(grid, rows, new boolean[grid[0].length], 0, k);
            return;
        }

        rows[row] = false;
        chooseRows(grid, rows, row + 1, k);

        rows[row] = true;
        chooseRows(grid, rows, row + 1, k);
    }

    private static void chooseCols(boolean[][] grid, boolean[] rows, boolean[] cols, int col, int k) {
        if (col == cols.length) {
            if (check(grid, rows, cols, k)) {
                ans++;
            }
            return;
        }

        cols[col] = false;
        chooseCols(grid, rows, cols, col + 1, k);

        cols[col] = true;
        chooseCols(grid, rows, cols, col + 1, k);
    }

    private static boolean check(boolean[][] grid, boolean[] rows, boolean[] cols, int k) {
        int blacks = 0;
        for (int i = 0; i < grid.length; i++) {
            if (rows[i]) continue;
            for (int j = 0; j < grid[i].length; j++) {
                if (cols[j]) continue;
                if (grid[i][j]) blacks++;
            }
        }
        return blacks == k;
    }

    // https://www.geeksforgeeks.org/fast-io-in-java-in-competitive-programming/
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        FastReader(InputStream inputStream) {
            br = new BufferedReader(new
                    InputStreamReader(inputStream));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException  e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }

        // https://qiita.com/masakinpo/items/5f77f2a879578a85a0bb
        public int[] nextIntArray(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = nextInt();
            return a;
        }

        public long[] nextLongArray(int n) {
            long[] a = new long[n];
            for (int i = 0; i < n; i++)
                a[i] = nextLong();
            return a;
        }
    }
}
