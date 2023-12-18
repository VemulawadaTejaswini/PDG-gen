import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    TreeMin down;
    TreeMin right;


    public static void main(String[] args) throws IOException {
        new Main().solve();
    }

    private void solve() throws IOException {
        BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        StringTokenizer tokenizer = new StringTokenizer(f.readLine());
        int n = Integer.parseInt(tokenizer.nextToken());
        int q = Integer.parseInt(tokenizer.nextToken());

        down = new TreeMin(n - 2);
        right = new TreeMin(n - 2);


        long res = 0;
        for (int q1 = 0; q1 < q; q1++) {
            tokenizer = new StringTokenizer(f.readLine());
            if (tokenizer.nextToken().charAt(0) == '1') {
                int x = Integer.parseInt(tokenizer.nextToken()) - 2;
                int upTo = down.getMin(x, 0, n - 3, 1);
                res += upTo;
                if (upTo != 0) right.makeMin(x, 0, upTo - 1, 0, n - 3, 1);
            }else {
                int x = Integer.parseInt(tokenizer.nextToken()) - 2;
                int upTo = right.getMin(x, 0, n - 3, 1);
                res += upTo;
                if (upTo != 0) down.makeMin(x, 0, upTo - 1, 0, n - 3, 1);
            }
        }

        out.println((long) (n - 2) * (n - 2) -  res);
        out.close();
    }

    private static class TreeMin {
        int[] tree;
        int n;


        public TreeMin(int n) {
            this.n = n;
            this.tree = new int[4 * n];
            Arrays.fill(tree, n);
        }

        private void makeMin(int min, int from, int to, int a, int b, int node) {
            if (from <= a && b <= to) {
                tree[node] = Math.min(tree[node], min);
                return;
            }


            int mid = (a + b)  / 2;
            if (from <= mid) makeMin(min, from, to, a, mid, node * 2);
            if (to > mid) makeMin(min, from, to, mid + 1, b, node * 2 + 1);
        }

        private int getMin(int index, int a, int b, int node) {
            int min = tree[node];
            if (a == b) return min;

            int mid = (a + b) / 2;
            if (index <= mid) min = Math.min(min, getMin(index, a, mid, node * 2));
            if (index > mid) min = Math.min(min, getMin(index, mid + 1, b, node * 2 + 1));

            return min;
        }
    }
}