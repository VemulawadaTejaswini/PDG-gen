import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] A = new int[100000];
        int[] B = new int[100000];
        int[] C = new int[100000];

        int[][] dp = new int[100000][3];

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
            B[i] = sc.nextInt();
            C[i] = sc.nextInt();
        }

        sc.close();

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == 0) {
                    if (j == 0) { dp[i][j] = A[i]; }
                    else if (j == 1) { dp[i][j] = B[i]; }
                    else { dp[i][j] = C[i]; }
                } else {
                    for (int k = 0; k < 3; k++) {
                        if (j == k) { continue; }
                        if (j == 0) { dp[i][j] = Math.max(dp[i][j], dp[i-1][k] + A[i]); }
                        else if (j == 1) { dp[i][j] = Math.max(dp[i][j], dp[i-1][k] + B[i]); }
                        else { dp[i][j] = Math.max(dp[i][j], dp[i-1][k] + C[i]); }
                    }
                }
            }
        }

        int ret = 0;
        ret = Math.max(ret, dp[N-1][0]);
        ret = Math.max(ret, dp[N-1][1]);
        ret = Math.max(ret, dp[N-1][2]);

        System.out.println(ret);
    }
}