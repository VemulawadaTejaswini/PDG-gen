import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        new Main().solve();
    }

    private void solve() throws IOException {
        BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int n = Integer.parseInt(f.readLine());
        int[][] coords = new int[n][3];
        for (int i = 0; i < n; i++) {
            StringTokenizer tokenizer = new StringTokenizer(f.readLine());
            coords[i][0] = Integer.parseInt(tokenizer.nextToken()) - 1;
            coords[i][1] = Integer.parseInt(tokenizer.nextToken()) - 1;
            coords[i][2] = i;
        }

        Arrays.sort(coords, new ArrayComparator());


        TreeSum already = new TreeSum(n);;
        int[] minLeft = new int[n];
        minLeft[0] = 0;
        int minSoFar = coords[0][1];
        for (int i = 1; i < n; i++) {
            minLeft[i] = minLeft[i - 1];
            if (coords[i][1] < minSoFar) {
                minSoFar = coords[i][1];
                minLeft[i] = i;
            }
        }
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

        int[][] intervals = new int[n][3];
        int[] resAr = new int[n];
        ArrayList<Integer>[] intervalsLeft = new ArrayList[n];
        ArrayList<Integer>[] intervalsRight = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            intervalsLeft[i] = new ArrayList<Integer>();
            intervalsRight[i] = new ArrayList<Integer>();
        }
        for (int i = 0; i < n; i++) {
            int[] ar = {minLeft[i], maxRight[i], coords[i][2]};
            intervals[i] = ar;
            resAr[ar[2]] = ar[1] - ar[0] + 1;
            intervalsLeft[minLeft[i]].add(i);
            intervalsRight[maxRight[i]].add(i);
        }


        for (int i = 0; i < n; i++) {
            for (int intervalNum : intervalsLeft[i]) {
                int[] interval = intervals[intervalNum];
                int y = coords[interval[1]][1];
                //System.out.println(Arrays.toString(interval) + " " + resAr[interval[2]]);
                if (y != 0) {
                    resAr[interval[2]] += already.getSum(0, y - 1, 0, n - 1, 1);
                }
                //System.out.println(Arrays.toString(interval) + " " + resAr[interval[2]]);
            }

            already.insert(1, coords[i][1], 0, n - 1, 1);
            for (int intervalNum : intervalsRight[i]) {
                int[] interval = intervals[intervalNum];
                int y = coords[interval[0]][1];
                //System.out.println(Arrays.toString(interval) + " " + resAr[interval[2]]);
                if (y != n - 1) {
                    resAr[interval[2]] += n - 1 - y - already.getSum(y + 1, n - 1, 0, n - 1, 1);
                }
                //System.out.println(Arrays.toString(interval) + " " + resAr[interval[2]] + " " + already.getSum(y + 1, n - 1, 0, n - 1, 1));
            }
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