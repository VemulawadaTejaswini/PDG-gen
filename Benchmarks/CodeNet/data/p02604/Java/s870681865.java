import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
        int n = sc.nextInt();
        int [] x = new int[n];
        int [] y = new int[n];
        long [] c = new long[n];
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt(); y[i] = sc.nextInt(); c[i] = sc.nextInt();
        }
        long [] ans = new long[n + 1];
        Arrays.fill(ans, Long.MAX_VALUE / 2);
        for (int hor = 0; hor < (1 << n); hor++) {
            int bit = Integer.bitCount(hor);
            long [] sh = new long[bit];
            long [] cost = new long[bit];
            int cur = 0;
            for (int i = 0; i < n; i++) {
                if (((hor >> i) & 1) == 1) {
                    sh[cur] = x[i];
                    cost[cur] = c[i];
                    cur++;
                }
            }
            long [] h = new long[n + 1];
            Arrays.fill(h, Long.MAX_VALUE / 2);
            for (int mask = 0; mask < (1 << bit); mask++) {
                int put = Integer.bitCount(mask);
                TreeSet<Long> set = new TreeSet<>();
                set.add(0L);
                for (int j = 0; j < bit; j++) {
                    if (((mask >> j) & 1) == 1) {
                        set.add(sh[j]);
                    }
                }
                long ret = 0;
                for (int j = 0; j < bit; j++) {
                    if (set.contains(sh[j])) continue;
                    Long lower = set.lower(sh[j]);
                    Long upper = set.higher(sh[j]);
                    long min = Long.MAX_VALUE / 2;
                    if (lower != null) min = Math.min(cost[j] * (sh[j] - lower), min);
                    if (upper != null) min = Math.min(min, (upper - sh[j]) * cost[j]);
                    ret += min;
                }
                h[put] = Math.min(h[put], ret);
            }
            int vert = ((1 << n) - 1) ^ hor;
            bit = Integer.bitCount(vert);
            sh = new long[bit]; cost = new long[bit];
            cur = 0;
            for (int i = 0; i < n; i++) {
                if (((vert >> i) & 1) == 1) {
                    sh[cur] = y[i];
                    cost[cur] = c[i];
                    cur++;
                }
            }
            long [] v = new long[n + 1];
            Arrays.fill(v, Long.MAX_VALUE / 2);
            for (int mask = 0; mask < (1 <<bit); mask++) {
                int put = Integer.bitCount(mask);
                TreeSet<Long> set = new TreeSet<>();
                set.add(0L);
                for (int j = 0; j < bit; j++) {
                    if (((mask >> j) & 1) == 1) {
                        set.add(sh[j]);
                    }
                }
                long temp = 0;
                for (int j = 0; j < bit; j++) {
                    if (set.contains(sh[j])) continue;
                    Long lower = set.lower(sh[j]);
                    Long upper = set.higher(sh[j]);
                    long min = Long.MAX_VALUE / 2;
                    if (lower != null) min = Math.min(cost[j] * (sh[j] - lower), min);
                    if (upper != null) min = Math.min(min, (upper - sh[j]) * cost[j]);
                    temp += min;
                }
                v[put] = Math.min(v[put], temp);
            }
            for (int i = 0; i <= n; i++) {
                for (int j = 0; j <= n; j++) {
                    if (i + j > n) continue;
                    ans[i + j] = Math.min(ans[i + j], h[i] + v[j]);
                }
            }
        }
        for (int i = 0; i <= n; i++) out.println(ans[i]);
        out.close();
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