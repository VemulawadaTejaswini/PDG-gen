import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = Integer.parseInt(sc.next());
        int W = Integer.parseInt(sc.next());
        int D = Integer.parseInt(sc.next());
        int[][] A = new int[H][W];
        int[][] inv_A = new int[H*W+1][2];
        for (int i=0;i<H;i++) {
            for (int j=0;j<W;j++) {
                A[i][j] = Integer.parseInt(sc.next());
                inv_A[A[i][j]][0] = i;
                inv_A[A[i][j]][1] = j;
            }
        }
        long[][] dp = new long[D][H*W/D+1];
        for (int i=0;i<D;i++) {
            for (int j=0;j<H*W/D;j++) {
                if ((D*(j+1)+i+1)<=H*W) {
                    dp[i][j+1] = dp[i][j] + Math.abs(inv_A[D*(j+1)+i+1][0]-inv_A[D*j+i+1][0]) + Math.abs(inv_A[D*(j+1)+i+1][1]-inv_A[D*j+i+1][1]);
                }
            }
        }
        // System.out.println(Arrays.deepToString(dp));

        int Q = Integer.parseInt(sc.next());
        for (int i=0;i<Q;i++) {
            int L = Integer.parseInt(sc.next());
            int R = Integer.parseInt(sc.next());
            System.out.println(dp[(R-1)%D][(R-1)/D]-dp[(L-1)%D][(L-1)/D]);
        }
    }
}