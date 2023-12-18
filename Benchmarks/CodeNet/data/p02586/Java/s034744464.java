import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int R = sc.nextInt();
        int C = sc.nextInt();
        int K = sc.nextInt();

        int[][] field = new int[R + 1][C + 1];
        for(int i = 0; i < K; i++){
            field[sc.nextInt()][sc.nextInt()] = sc.nextInt();
        }

        long[][][] dp = new long[R + 1][C + 1][4];
        for(int i = 1; i < R; i++){
            for(int j = 1; j < C; j++){
                Arrays.fill(dp[i][j], Long.MIN_VALUE);
            }
        }
        dp[1][1][0] = 0;

        for(int i = 1; i <= R; i++){
            for(int j = 1; j <= C; j++){
                if(field[i][j] > 0){
                    dp[i][j][0] = Math.max(dp[i - 1][j][3], dp[i][j - 1][0]);
                    dp[i][j][1] = Math.max(dp[i - 1][j][3], dp[i][j - 1][0]) + field[i][j];
                    dp[i][j][2] = Math.max(dp[i - 1][j][3], dp[i][j - 1][1]) + field[i][j];
                    dp[i][j][3] = Math.max(dp[i - 1][j][3], dp[i][j - 1][2]) + field[i][j];
                }else{
                    dp[i][j][0] = Math.max(dp[i - 1][j][3], dp[i][j - 1][0]);
                    dp[i][j][1] = Math.max(dp[i - 1][j][3], dp[i][j - 1][1]);
                    dp[i][j][2] = Math.max(dp[i - 1][j][3], dp[i][j - 1][2]);
                    dp[i][j][3] = Math.max(dp[i - 1][j][3], dp[i][j - 1][3]);
                }
            }
        }

        System.out.println(dp[R][C][3]);

}
