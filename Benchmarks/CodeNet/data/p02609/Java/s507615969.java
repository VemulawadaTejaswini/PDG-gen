import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static final FS sc = new FS();  // 封装输入类
    static final PrintWriter pw = new PrintWriter(System.out);

    public static void main(String[] args) {
        int n = sc.nextInt();
        char[] a = sc.next().toCharArray();
        int x = 0;
        for(int i = 0;i < n;i++) {
            x += a[i] == '0' ? 0 : 1 << (n - i - 1);
        }
        for(int i = 0;i < n;i++) {
            int y = x;
            if (a[i] == '0') {
                y += 1 << (n - i - 1);
            } else {
                y -= 1 << (n - i - 1);
            }
            int ans = 0;
            while (y != 0) {
                y %= popcount(y);
                ans++;
            }
            pw.println(ans);
        }
        pw.flush();
    }

    private static int popcount(int x){
        int ans = 0;
        while (x != 0) {
            x = x & (x - 1);
            ans++;
        }
        return ans;
    }

    static class FS {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer("");
        String next() {
            while(!st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch(Exception ignored) {}
            }
            return st.nextToken();
        }
        int[] nextArray(int n) {
            int[] a = new int[n];
            for(int i = 0;i < n;i++) {
                a[i] = nextInt();
            }
            return a;
        }
        int nextInt() {
            return Integer.parseInt(next());
        }
        long nextLong() {
            return Long.parseLong(next());
        }
    }
}