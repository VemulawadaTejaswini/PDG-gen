import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    static long MOD = 1000000007;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        long ans = 0L;
        long[] sum = new long[n];

        String[] s = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(s[i]);
        }
        long curr = 0L;
        for (int i = n-1; i >= 0; i--) {
            ans = (ans + (a[i]*curr)%MOD)%MOD;
            sum[i]  = (curr + a[i])%MOD;
            curr = sum[i];
        }
        System.out.println(ans);
    }
}
