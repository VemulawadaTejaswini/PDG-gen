import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
        int n = sc.nextInt(); int q = sc.nextInt();
        FenwickTree bit = new FenwickTree(n + 1);
        int [] a = new int[n + 1];
        for (int i = 1; i <= n; i++) a[i] = sc.nextInt();
        Query [] qq = new Query[q];
        for (int i = 0; i < q; i++) qq[i] = new Query(sc.nextInt(), sc.nextInt(), i);
        Arrays.sort(qq);
        int [] next = new int[n + 1];
        int [] cur = new int[n + 1];
        Arrays.fill(next, -1);
        Arrays.fill(cur, -1);
        Set<Integer> set = new HashSet<>();
        for (int i = n; i >= 1; i--) {
            if (cur[a[i]] != -1) next[cur[a[i]]] = i;
            cur[a[i]] = i;
            if (!set.contains(a[i])) bit.update(i, 1);
            set.add(a[i]);
        }
        int [] ret = new int[q]; int prev = n;
        for (int i = 0; i < q; i++) {
            Query query = qq[i];
            int l = query.l; int r = query.r; int index = query.idx;
            while (prev > r) {
                if (next[prev] != -1) bit.update(next[prev], 1);
                bit.update(prev, -1);
                prev--;
            }
            ret[index] = bit.rangeSum(l, r);
            if (i != q - 1 && qq[i + 1].r != r) {
                if (next[r] != -1) bit.update(next[r], 1);
                bit.update(r, -1);
                prev--;
            }
        }
        for (int i = 0; i < q; i++) out.println(ret[i]);
        out.close();
    }
    static class Query implements Comparable<Query> {
        int l; int r; int idx;
        Query(int l, int r, int idx) {
            this.l = l; this.r = r; this.idx = idx;
        }

        @Override
        public int compareTo(Query o) {
            return o.r - r;
        }
    }

    static class FenwickTree
    {
        int size;
        int [] table;

        FenwickTree(int size)
        {
            table = new int [size];
            this.size = size;
        }

        void init(int [] nums)
        {
            for (int i = 1; i < nums.length; i++)
            {
                update(i, nums[i]);
            }
        }

        void update(int i, int delta)
        {
            while (i < size)
            {
                table[i] += delta;
                i += Integer.lowestOneBit(i);
            }
        }

        int sum(int i)
        {
            int sum = 0;
            while (i > 0)
            {
                sum += table[i];
                i -= Integer.lowestOneBit(i);
            }
            return sum;
        }

        int rangeSum(int i, int j)
        {
            return sum(j) - sum(i - 1);
        }
    }



    //-----------MyScanner class for faster input----------
    public static class MyScanner {
        BufferedReader br;
        StringTokenizer st;

        public MyScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
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