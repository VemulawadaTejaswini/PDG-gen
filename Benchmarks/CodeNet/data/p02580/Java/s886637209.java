import java.io.*;
import java.util.*;

public class Main {
    private static void solve() throws Exception {
        int n = fs.nextInt();
        int m = fs.nextInt();
        int numBombs = fs.nextInt();

        int[] rows = new int[n];
        int[] cols = new int[m];
        Arrays.fill(rows, 0);
        Arrays.fill(cols, 0);
        HashSet<Item> items = new HashSet();
        for (int i = 0; i < numBombs; i++) {
            int x = fs.nextInt()-1;
            int y = fs.nextInt()-1;
            rows[x]++;
            cols[y]++;
            items.add(new Item(x,y));
        }
        int ans = 0;

        // row-wise.
        int rowMax=0, row=0;
        for (int i = 0; i < n; i ++ ) {
            if (rowMax < rows[i]) {
                rowMax = rows[i]; row = i;
            }
        }

        // col-wise.
        int colMax=0, col=0;
        for (int j = 0 ; j < m; j ++ ) {
            if (colMax < cols[j]) {
                colMax = cols[j]; col = j;
            }
        }

        for (int j = 0; j < m; j ++ ) {
            ans = Math.max(rowMax + cols[j] - (items.contains(new Item(row, j))?1:0), ans);
        }
        for (int i = 0 ; i < n; i ++ ) {
            ans = Math.max(ans, colMax + rows[i] -(items.contains(new Item(i, col))?1:0));
        }

        out.println(ans);

    }

    static class Item {
        int x, y;
        Item(int a, int b) {
            x = a; y = b;
        }

        @Override
        public int hashCode() {
            return Arrays.hashCode(new int[]{x,y});
        }

        @Override
        public boolean equals(Object o) {
            Item i = (Item)o;
            return this.x == i.x && this.y == i.y;
        }
    }

    private static boolean isUnvisitedRoad(char[][] G, int n, int m, int x, int y, int[][] D) {
        if (0 <= x && x < n) {
            if (0 <= y && y < m) {
                return G[x][y] == '.' && D[x][y] == -1;
            }
        }
        return false;
    }

    static class Node implements  Comparable<Node> {
        int x, y, d;
        Node(int a, int b, int c) {
            x = a; y = b; d = c;
        }

        @Override
        public int compareTo(Node other) {
            if (this.d == other.d) {
                if (this.x == other.x) {
                    return Integer.compare(this.y, other.y);
                }
                return Integer.compare(this.x, other.x);
            }
            return Integer.compare(this.d, other.d);
        }

        @Override
        public String toString() {
            return "<" + x  + ", " + y + "> : " + d;
        }
    }

    private static FastScanner fs = new FastScanner();
    private static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws Exception {
        int T = 1;
        for (int t = 0; t < T; t++) {
            solve();
        }
        out.close();
    }

    static void debug(Object... O) {
        System.err.print("DEBUG ");
        System.err.println(Arrays.deepToString(O));
    }

    static class FastScanner {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer("");

        String next() {
            while (!st.hasMoreTokens())
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        int[] readArray(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = nextInt();
            return a;
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextString() {
            return next();
        }
    }
}
