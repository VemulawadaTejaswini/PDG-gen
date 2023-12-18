import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.StringTokenizer;

public class Main {
    //Solution by Sathvik Kuthuru
    public static void main(String[] args) {
        FastReader scan = new FastReader();
        PrintWriter out = new PrintWriter(System.out);
        Task solver = new Task();
        int t = 1;
        for(int tt = 1; tt <= t; tt++) solver.solve(tt, scan, out);
        out.close();
    }

    static class Task {
        int n, q;
        int[] BIT, recent, a, ans;
        Query[] queries;

        public void solve(int testNumber, FastReader scan, PrintWriter out) {
            n = scan.nextInt();
            q = scan.nextInt();
            a = new int[n];
            recent = new int[n + 1];
            BIT = new int[n + 10];
            queries = new Query[q];
            ans = new int[q];

            for(int i = 0; i < n; i++) a[i] = scan.nextInt();
            for(int i = 0; i < q; i++) {
                queries[i] = new Query(scan.nextInt() - 1, scan.nextInt() - 1, i);
            }
            Arrays.sort(queries);
            Arrays.fill(recent, -1);
            int queryIndex = 0;
            for(int i = 0; i < n; i++) {
                if(recent[a[i]] != -1) update(recent[a[i]], -1);
                update(recent[a[i]] = i, 1);
                while(queryIndex < q && i == queries[queryIndex].right) {
                    ans[queries[queryIndex].index] = sum(i) - sum(queries[queryIndex].left - 1);
                    queryIndex++;
                }
            }
            for(int i : ans) out.println(i);
        }

        void update(int index, int val) {
            index++;
            for(; index < BIT.length; index += index & (-index)) BIT[index] += val;
        }

        int sum(int index) {
            index++;
            int ret = 0;
            for(; index > 0; index -= index & (-index)) ret += BIT[index];
            return ret;
        }

        static class Query implements Comparable<Query> {
            int left, right, index;

            public Query(int a, int b, int c) {
                left = a;
                right = b;
                index = c;
            }

            @Override
            public int compareTo(Query query) {
                return Integer.compare(right, query.right);
            }
        }

    }

    static void shuffle(int[] a) {
        Random get = new Random();
        for (int i = 0; i < a.length; i++) {
            int r = get.nextInt(a.length);
            int temp = a[i];
            a[i] = a[r];
            a[r] = temp;
        }
    }

    static void shuffle(long[] a) {
        Random get = new Random();
        for (int i = 0; i < a.length; i++) {
            int r = get.nextInt(a.length);
            long temp = a[i];
            a[i] = a[r];
            a[r] = temp;
        }
    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        public FastReader(String s) throws FileNotFoundException {
            br = new BufferedReader(new FileReader(new File(s)));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
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
    }

}