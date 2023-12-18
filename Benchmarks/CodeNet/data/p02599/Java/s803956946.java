//Created by Aminul on 8/2/2020.

import java.io.*;
import java.util.*;

import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int n = in.nextInt(), q = in.nextInt();
        int arr[] = new int[n + 1];
        int last[] = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            int x = in.nextInt();
            arr[i] = last[x];
            last[x] = i;
        }

        ArrayDeque<int[]> queries[] = genDQ(n + 1);
        for (int i = 0; i < q; i++) {
            int l = in.nextInt(), r = in.nextInt();

            queries[r].add(new int[]{i, l, +1});
            queries[l - 1].add(new int[]{i, l, -1});
        }

        BinaryIndexTree bit = new BinaryIndexTree(n + 10);
        int[] res = new int[q];
        for (int i = 1; i <= n; i++) {
            bit.add(arr[i], +1);
            for (int qry[] : queries[i]) {
                res[qry[0]] += qry[2] * bit.sum(qry[1] - 1);
            }
        }

        for (int ans : res) {
            pw.println(ans);
        }

        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }

    static <T> ArrayDeque<T>[] genDQ(int n) {
        ArrayDeque<T> list[] = new ArrayDeque[n];
        for (int i = 0; i < n; i++) list[i] = new ArrayDeque<T>();
        return list;
    }

    static class BinaryIndexTree {
        public int bit[], n, offset = 5;

        public BinaryIndexTree(int N) {
            n = N;
            bit = new int[n + offset + 10];
        }

        public void add(int index, int value) {
            index += offset;
            for (; index < n; index = index + (index & -index)) {
                bit[index] += value;
            }
        }

        public int sum(int index) {
            index += offset;
            int sum = 0;
            for (; index > 0; index = index - (index & -index)) {
                sum += bit[index];
            }
            return sum;
        }

        public int query(int i, int j) {
            return sum(j) - sum(i - 1);
        }
    }

    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream));
            tokenizer = null;
        }

        public String next() throws Exception {
            while (tokenizer == null || !tokenizer.hasMoreTokens())
                tokenizer = new StringTokenizer(reader.readLine());
            return tokenizer.nextToken();
        }

        public int nextInt() throws Exception {
            return Integer.parseInt(next());
        }

    }
}