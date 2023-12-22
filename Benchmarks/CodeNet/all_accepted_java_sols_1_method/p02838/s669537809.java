import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int mod = 1_000_000_007;
        long[] A = new long[N];
        ArrayList<int[]> a_bin = new ArrayList<int[]>();
        for (int i=0;i<N;i++) {
            A[i] = Long.parseLong(sc.next());
            int[] a = new int[62];
            long tmp = A[i];
            for (int j=0;j<62;j++) {
                if ((tmp&1)==1) {
                    a[j] = 1;
                }
                tmp=tmp>>1;
            }
            // int[] b = new int[62];
            // for (int j=0;j<62;j++) {
            //     b[j] = a[61-j];
            // }
            a_bin.add(a);
            // System.out.println(Arrays.toString(a));
        }
        int[][] dp = new int[N+1][62];
        for (int i=0;i<N;i++) {
            for (int j=0;j<62;j++) {
                dp[i+1][j] = dp[i][j]+a_bin.get(i)[j];
            }
        }
        long ans = 0L;
        for (int i=0;i<N;i++) {
            for (int j=0;j<62;j++) {
                if (a_bin.get(i)[j]==0) {
                    ans = (ans + ((long)(1L<<j)%mod*((long)dp[N][j]-dp[i+1][j])%mod))%mod;
                } else {
                    ans = (ans + ((long)(1L<<j)%mod*((long)(N-1-i)-(dp[N][j]-dp[i+1][j]))%mod))%mod;
                }
                // if (0<=j && j<3) {
                //     System.out.print(dp[N-1][j]-dp[i][j]+" ");
                //     System.out.println((N-1-i)-(dp[N-1][j]-dp[i][j]));
                // }
            }
        }
        System.out.println(ans);
        // System.out.println(Arrays.deepToString(dp));
    }
}