package atcoder;

import java.util.Arrays;
import java.util.Scanner;
import java.io.PrintWriter;

public class abc177_c {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int N = in.nextInt();
        long[] A = new long[N];
        long mod = 1000000007;
        for (int i = 0; i < N; i++) {
            A[i]= in.nextLong();
        }
        long sum = 0;
        long ans = 0;
        for (int i = 0; i < N; i++) {
            ans=(ans+(A[i]*sum)) % mod;
            sum=(sum+A[i]) % mod;
        }
        out.println(ans);
    }
}
