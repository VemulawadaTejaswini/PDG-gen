import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Main main = new Main();
        main.solve();
    }

    public void solve() throws Exception {
        //Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        FastScan scan = new FastScan(System.in);
        int N = scan.nextInt();
        int[] A = new int[N];
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < N; i++) {
            A[i] = scan.nextInt();
        }
        Arrays.sort(A);
        boolean[] ans = new boolean[N];
        Arrays.fill(ans, true);
        for (int i = 0; i < N; i++) {
            if (ans[i] == false) {
                continue;
            }
            for (int j = i + 1; j < N; j++) {
                if (A[j] % A[i] == 0) {
                    ans[j] = false;
                }
            }
        }
        for (int i = 1; i < N; i++) {
            if (!ans[i-1]) {
                continue;
            }
            if (ans[i]) {
                continue;
            }
            if (A[i-1] == A[i]) {
                ans[i-1] = false;
            }
        }
        int a = 0;
        for (int i = 0; i < N; i++) {
            if (ans[i]) {
                a += 1;
            }
        }
        System.out.println(a);
    }
    class FastScan {
        BufferedReader br;
        StringTokenizer st;
        FastScan(InputStream is) {
            InputStreamReader isr = new InputStreamReader(is);
            this.br = new BufferedReader(isr);
        }
        String next() throws IOException {
            while (this.st == null || !this.st.hasMoreTokens()) {
                this.st = new StringTokenizer(br.readLine().trim());
            }
            return st.nextToken();
        }
        int nextInt() throws IOException {
            return Integer.parseInt(this.next());
        }
        String nextLine() throws IOException {
            return br.readLine().trim();
        }
    }
}
