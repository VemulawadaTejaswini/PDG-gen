import java.io.*;

import java.util.StringTokenizer;

class Main {

    static void solve() throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
        StringTokenizer st = new StringTokenizer(in.readLine());

        int na, nb, budget;

        na = Integer.parseInt(st.nextToken());
        nb = Integer.parseInt(st.nextToken());
        budget = Integer.parseInt(st.nextToken());

        long[] A = new long[na];
        long[] B = new long[nb];

        st = new StringTokenizer(in.readLine());
        for (int i = 0; i < na; i++) {
            A[i] = Long.parseLong(st.nextToken());
        }

        st = new StringTokenizer(in.readLine());
        for (int i = 0; i < nb; i++) {
            B[i] = Long.parseLong(st.nextToken());
        }

        long[] sa = sum(A);
        long[] sb = sum(B);
        int ans = find(sa, sb, budget);

        out.println(ans);
        out.close();

    }

    static long[] sum(long[] a) {
        int n = a.length;
        long[] s = new long[n+1];
        for (int i = 1; i <= n; i++) {
            s[i] = s[i-1] + a[i-1];
        }
        return s;
    }

    static int find(long[] sa, long[] sb, long budget) {
        int na = sa.length;
        int nb = sb.length;
        int ans = 0;
        for (int i = na-1; i >= 0; i--) {
            long S = sa[i];
            if (S > budget) continue;
            int lo = 0;
            int hi = nb-1;
            while (lo <= hi) {
                int m = lo + (hi - lo)/2;
                long D = sb[m];
                if (D + S > budget) {
                    hi = m-1;
                } else {
                    lo = m+1;
                }
            }
            if (lo >= na) { // true for everything
                ans = Math.max(ans, i+nb-1);
            } else {
                ans = Math.max(ans, i+lo-1);
            }
        }
        return ans;
    }


    public static void main(String[] args) throws IOException {
        solve();
    }
}