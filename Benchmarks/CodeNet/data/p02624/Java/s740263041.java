import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;

public class Main {
    static int n;

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner();
        PrintWriter out = new PrintWriter(System.out);
        n = sc.nextInt();
        int[] cnt = new int[n + 1];
        Arrays.fill(cnt, 1);
        long ans = 0;
        for (int i = 2; i <= n; i++) {
            if (cnt[i] == 1) {
                for (int j = i; j <= n; j += i) {
                    int e = 0, tmp = j;
                    while (tmp % i == 0) {
                        tmp/=i;
                        e++;
                    }
                    cnt[j] *= (e + 1);
                }
            }
            ans += 1l*i * cnt[i];
        }
        out.println(ans+1);
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
