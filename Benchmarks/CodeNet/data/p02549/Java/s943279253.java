import java.util.*;
import java.io.*;

public class Main {
    static long mod = 998244353;
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
        int n = sc.nextInt(); int k = sc.nextInt();
        long [] dp = new long[n + 1];
        RangeTree seg = new RangeTree(n + 1);
        dp[1] = 1; seg.update(1, 1, 1);
        Segment [] s = new Segment[k];
        for (int i = 0; i < k; i++) {
            s[i] = new Segment(sc.nextInt(), sc.nextInt());
        }
        Arrays.sort(s);
        for (int i = 2; i <= n; i++) {
            boolean in = false; int above = -1;
            for (int j = 0; j < s.length; j++) {
                if (i - 1 >= s[j].l && i - 1 <= s[j].r) {
                    in = true;
                    above = j - 1;
                    break;
                } else if (i - 1 < s[j].l) {
                    above = j - 1;
                    in = false;
                    break;
                }
            }
            if (i - 1 > s[k - 1].r) above = k - 1;
            for (int j = 0; j <= above; j++) {
                dp[i] = (dp[i] + seg.sumQuery(i - s[j].r, i - s[j].l)) % mod;
            }
            if (in) {
                dp[i] = (dp[i] + seg.sumQuery(1, i - s[above + 1].l)) % mod;
            }
            seg.update(i, i, dp[i]);
        }
        out.println(dp[n]);
        out.close();
    }

    static class Segment implements Comparable<Segment> {
        int l; int r;
        Segment(int l, int r) {
            this.l = l; this.r = r;
        }

        @Override
        public int compareTo(Segment o) {
            return Integer.compare(l, o.l);
        }
    }

    static class RangeTree {
        //private long[] max;
        //private long[] min;
        private long[] lazy;
        private long[] sum;
        private int size;
        public RangeTree(int size) {
            this.size = size;
            //max = new long[4*size];
            //min = new long[4*size];
            sum = new long[4*size];
            lazy = new long[4*size];
        }
        public void update(int l, int r, long inc) {
            update(1, 0, size-1, l, r, inc);
        }
        private void pushDown(int index, int l, int r) {
            //min[index] += lazy[index];
            //max[index] += lazy[index];
            sum[index] += lazy[index] * (r-l+1);
            if(l != r) {
                lazy[2*index] += lazy[index];
                lazy[2*index+1] += lazy[index];
            }
            lazy[index] = 0;
        }
        private void pullUp(int index, int l, int r) {
            int m = (l+r)/2;
            //min[index] = Math.min(evaluateMin(2*index, l, m), evaluateMin(2*index+1, m+1, r));
            //max[index] = Math.max(evaluateMax(2*index, l, m), evaluateMax(2*index+1, m+1, r));
            sum[index] = evaluateSum(2*index, l, m) + evaluateSum(2*index+1, m+1, r);
        }
        private long evaluateSum(int index, int l, int r) {
            return sum[index] + (r-l+1)*lazy[index];
        }
        private void update(int index, int l, int r, int left, int right, long inc) {
            if(r < left || l > right) return;
            if(l >= left && r <= right) {
                lazy[index] += inc;
                return;
            }
            pushDown(index, l, r);
            int m = (l+r)/2;
            update(2*index, l, m, left, right, inc);
            update(2*index+1, m+1, r, left, right, inc);
            pullUp(index, l, r);
        }

        public long sumQuery(int l, int r) {
            return sumQuery(1, 0, size-1, l, r);
        }
        private long sumQuery(int index, int l, int r, int left, int right) {
            if(r < left || l > right) return 0;
            if(l >= left && r <= right) {
                return evaluateSum(index, l, r);
            }
            pushDown(index, l, r);
            int m = (l+r)/2;
            long ret = 0;
            ret += sumQuery(2*index, l, m, left, right);
            ret += sumQuery(2*index+1, m+1, r, left, right);
            pullUp(index, l, r);
            return ret;
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