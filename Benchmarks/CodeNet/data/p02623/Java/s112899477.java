import java.io.*;

import java.util.StringTokenizer;

class Main {

    public static void main(String[] args) throws IOException {
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

        long[] sa = new long[na];
        sa[0] = A[0];
        for (int i = 1; i < na; i++) {
            sa[i] = sa[i-1] + A[i];
        }

        long[] sb = new long[nb];
        sb[0] = B[0];
        for (int i = 1; i < nb; i++) {
            sb[i] = sb[i-1] + B[i];
        }

        int ans = Math.max(find(na, nb, sa, sb, budget), find(nb, na, sb, sa, budget));
        out.println(ans);
        out.close();

    }

    static int find(int na, int nb, long[] sa, long[] sb, long budget) {
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
                ans = Math.max(ans, i+nb);
            }
            else if (hi < 0) { // false for everything
                ans = Math.max(ans, i+1);
            }
            else {
                ans = Math.max(ans, i+1+lo);
            }
        }
        return ans;
    }

}
