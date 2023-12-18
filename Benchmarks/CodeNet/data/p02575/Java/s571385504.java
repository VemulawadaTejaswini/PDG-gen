import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {
    int[] tree;
    int[] lazyStart;
    int[] lazySeq;

    private void push(int node, int a, int b, int mid) {
        //System.out.println(a + " " +mid + " " + b + " " + lazyStart[node] + " "  + lazySeq[node]);
        tree[node * 2] += lazyStart[node] + (mid - a) * lazySeq[node];
        tree[node * 2 + 1] += lazyStart[node] + (b - a) * lazySeq[node];
        //System.out.println(tree[node * 2 + 1] + " " + lazyStart[node] + " a " + lazySeq[node] + " " + a + " " + b);
        lazyStart[node * 2] += lazyStart[node];
        lazyStart[node  *2 + 1] += lazyStart[node] + (mid + 1 - a) * lazySeq[node];
        lazyStart[node] = 0;
        lazySeq[node * 2] += lazySeq[node];
        lazySeq[node * 2 + 1] += lazySeq[node];
        lazySeq[node] = 0;
    }

    private void add(int startNum, int from, int to, int a, int b, int node) {
        if (from <= a && b <= to) {
            //System.out.println("oj " + a + " " + b + " " + startNum + " " + lazyStart[node]);
            tree[node] += b - a + startNum;
            //System.out.println(a + " " + b + " " + tree[node]);
            lazyStart[node] += startNum;
            //.out.println(lazyStart[node]);
            lazySeq[node]++;
            return;
        }


        int mid = (a + b) / 2;

        push(node, a, b, mid);

        if (from <= mid) {
            add(startNum, from, to, a, mid, node * 2);
        }
        if (to > mid) {
            add(startNum + mid + 1 - Math.max(a, from), from, to, mid + 1, b, node * 2 + 1);
        }

        tree[node] = Math.min(tree[node * 2], tree[node * 2 + 1]);
    }

    private int getMin(int from, int to, int a, int b, int node) {
        //System.out.println(a + " " + b + " " + tree[node]);
        if (from <= a && b <= to) {
            return tree[node];
        }

        int mid = (a + b) / 2;
        push(node, a, b, mid);

        int min = Integer.MAX_VALUE;
        if (from <= mid) min = Math.min(min, getMin(from, to, a, mid, node * 2));
        if (to > mid) min = Math.min(min, getMin(from, to, mid + 1, b, node * 2 + 1));

        return min;
    }

    public static void main(String[] args) throws IOException {
        new Main().solve();
    }

    private void solve() throws IOException {
        BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        StringTokenizer tokenizer = new StringTokenizer(f.readLine());
        int h = Integer.parseInt(tokenizer.nextToken());
        int w = Integer.parseInt(tokenizer.nextToken());

        int[][] intervals = new int[h][2];
        for (int i = 0; i < h; i++) {
            tokenizer = new StringTokenizer(f.readLine());
            intervals[i][0] = Integer.parseInt(tokenizer.nextToken()) - 1;
            intervals[i][1] = Integer.parseInt(tokenizer.nextToken()) - 1;
        }

        tree = new int[4 * w];
        lazyStart = new int[4 * w];
        lazySeq = new int[4 * w];

        int leftPoint = 0;
        int[] res = new int[h];
        for (int i = 0; i < h; i++) {
            int a = intervals[i][0];
            int b = intervals[i][1];
            if (a <= leftPoint) {
                leftPoint = Math.max(leftPoint, b + 1);
            }

            add(1, a, b, 0, w - 1, 1);
            //System.out.println(leftPoint);

            if (leftPoint >= w) res[i] = -1;
            else res[i] = getMin(leftPoint, w - 1, 0, w - 1, 1) + i + 1;
        }

        for (int i = 0; i < h; i++) out.println(res[i]);


        out.close();
    }


}