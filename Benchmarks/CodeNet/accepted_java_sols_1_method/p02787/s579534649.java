import java.util.*;

public class Main {

    private static final int INF = 1_000_000_000;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int N = sc.nextInt();
        int[] A = new int[N];
        int[] B = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
            B[i] = sc.nextInt();
        }

        int[][] dp = new int[N][H+1];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j <= H; j++) {
                dp[i][j] = INF;
            }
        }

        int mins[] = new int[N];
        Arrays.fill(mins, INF);
        for (int j = 0; j <= H; j++) {
            int min = INF;
            for (int i = 0; i < N; i++) {
                if (j == 0) {
                    dp[i][j] = 0;
                }
                min = Math.min(min, dp[i][j]);
            }
            for (int i = 0; i < N; i++) {
                if (j+A[i] < H) {
                    dp[i][j+A[i]] = Math.min(dp[i][j+A[i]], min+B[i]);
                } else {
                    mins[i] = Math.min(mins[i],min+B[i]);
                }
            }
        }

        /*
        for (int i = 0; i < N; i++) {
            //for (int j = 0; j <= H; j++) {
                System.out.println(Arrays.toString(dp[i]));
            //}
        }
        System.out.println(Arrays.toString(mins));
        */


        int ans = INF;
        for (int i = 0; i < N; i++) {
            ans = Math.min(ans, mins[i]);
        }
        
        System.out.println(ans);
    }
}
