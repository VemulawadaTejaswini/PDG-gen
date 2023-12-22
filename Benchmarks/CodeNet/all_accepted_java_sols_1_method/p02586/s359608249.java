import java.util.*;

public class Main {


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int k = sc.nextInt();
        int[][] g = new int[r][c];
        for(int i=0; i<k ;i++) {
            int x = sc.nextInt() -1;
            int y = sc.nextInt() -1;
            int v = sc.nextInt();
            g[x][y] = v;
        }
        long[][][] dp = new long[r][c][4];
        if(g[0][0]>0) {
            dp[0][0][1] = g[0][0];
        }
        for(int i=0; i<r; i++) {
            for(int j=0; j<c; j++) {
                for(int q=0; q<=3; q++) {
                    if(j+1<c) {
                        dp[i][j+1][q] = Math.max(dp[i][j+1][q],dp[i][j][q]);
                        if(g[i][j+1]>0 && q<3) {
                            dp[i][j+1][q+1] = Math.max(dp[i][j+1][q+1], dp[i][j][q]+g[i][j+1]);
                        }
                    }
                    if(i+1<r) {
                        dp[i+1][j][0] = Math.max(dp[i+1][j][0],dp[i][j][q]);
                        if(g[i+1][j]>0) {
                            dp[i+1][j][1] = Math.max(dp[i+1][j][1], dp[i][j][q]+g[i+1][j]);
                        }
                    }
                }
            }
        }
        long res = 0;
        for(int i=0; i<4; i++) {
            res = Math.max(res, dp[r-1][c-1][i]);
        }
        System.out.println(res);


    }
}