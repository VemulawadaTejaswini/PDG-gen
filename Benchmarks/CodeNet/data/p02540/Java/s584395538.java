import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        new Main().solve();
    }

    private void solve() throws IOException {
        BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int n = Integer.parseInt(f.readLine());
        int[][] coords = new int[n][2];
        int[] xCoordToIndex = new int[n];
        for (int i = 0; i < n; i++) {
            StringTokenizer tokenizer = new StringTokenizer(f.readLine());
            coords[i][0] = Integer.parseInt(tokenizer.nextToken()) - 1;
            coords[i][1] = Integer.parseInt(tokenizer.nextToken()) - 1;
            xCoordToIndex[coords[i][0]] = i;
        }

        Arrays.sort(coords, new ArrayComparator());


        TreeSum already = new TreeSum(n);;
        int[] resAr = new int[n];

        int[] maxRight = new int[n];
        maxRight[n - 1] = n - 1;
        int maxSoFar = coords[n - 1][1];
        for (int i = n - 2; i >= 0; i--) {
            maxRight[i] = maxRight[i + 1];
            if (coords[i][1] > maxSoFar) {
                maxSoFar = coords[i][1];
                maxRight[i] = i;
            }
        }


        int[] lessThan = new int[n];
        for (int i = 0; i < n; i++) {
            int y = coords[i][1];
            int res = 0;
            if (y != 0) {
                lessThan[i] = already.getSum(0, y - 1, 0, n - 1, 1);
            }

            already.insert(1, coords[i][1], 0, n - 1, 1);
        }


        for (int i = 0; i < n; i++) {
            int res = lessThan[maxRight[i]] + 1;
            resAr[xCoordToIndex[coords[i][0]]] = res;
        }

        for (int i  = 0; i < n; i++) {
            out.println(resAr[i]);
        }
        out.close();
    }

    private static class TreeSum {
        int[] tree;

        public TreeSum(int n) {
            this.tree = new int[4 * n];
        }

        private void insert(int num, int index, int a, int b, int node) {
            if (a == b) {
                tree[node] = num;
                return;
            }


            int mid = (a + b) / 2;
            if (index <= mid) insert(num, index, a, mid, node * 2);
            else insert(num, index, mid + 1 , b, node * 2  +1);

            tree[node] = tree[node * 2] + tree[node * 2 + 1];
        }

        private int getSum(int from, int to, int a , int b, int node) {
            if (from <= a && b <= to) {
                return tree[node];
            }

            int mid = (a + b) / 2;
            int sum = 0;
            if (from <= mid) sum += getSum(from, to, a, mid, node * 2);
            if (to > mid) sum += getSum(from, to, mid + 1, b, node * 2 + 1);

            return sum;
        }
    }

    private static class ArrayComparator implements Comparator<int[]> {

        @Override
        public int compare(int[] o1, int[] o2) {
            return Integer.compare(o1[0], o2[0]);
        }
    }
}