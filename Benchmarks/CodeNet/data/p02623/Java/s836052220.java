import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner();
        PrintWriter out = new PrintWriter(System.out);
        int n = sc.nextInt(), m = sc.nextInt();
        int k = sc.nextInt();
        long[] a = new long[n], b = new long[m];
        int ans = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            if (i != 0) a[i] += a[i - 1];
            if (a[i] <= k) ans = i + 1;
        }
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
            if (i != 0) b[i] += b[i - 1];
            if (b[i] <= k) ans = Math.max(ans, i + 1);
            int lo = 0, hi = n - 1;
            while (lo <= hi) {
                int mid = lo + hi >> 1;
                if (a[mid] <= k - b[i]) {
                    ans = Math.max(ans, i + mid + 2);
                    lo = mid + 1;
                } else hi = mid - 1;
            }
        }
        out.println(ans);
        out.flush();
        out.close();
    }

    static class Scanner {
        BufferedReader br;
        StringTokenizer st;

        Scanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() throws IOException {
            while (st == null || !st.hasMoreTokens()) st = new StringTokenizer(br.readLine());
            return st.nextToken();
        }

        int nextInt() throws IOException {
            return Integer.parseInt(next());
        }

        public int[] nextIntArray(int n) throws IOException {
            int[] ans = new int[n];
            for (int i = 0; i < n; i++)
                ans[i] = nextInt();
            return ans;
        }
    }
}
