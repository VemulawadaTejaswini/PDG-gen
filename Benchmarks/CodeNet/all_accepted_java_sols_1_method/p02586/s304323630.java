import java.util.*;
import java.util.function.*;
import java.lang.*;
import java.math.*;
import java.io.*;


public class Main {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();
        int K = sc.nextInt();

        long[][] itemValue = new long[R][C];
        for(int k=0; k<K; k++){
            int r = sc.nextInt()-1;
            int c = sc.nextInt()-1;
            itemValue[r][c] = sc.nextLong();
        }

        long[][][] dp = new long[4][R][C];
        dp[1][0][0] = itemValue[0][0];

        for(int r=0; r<R; r++) for(int c=0; c<C; c++) for(int i=0; i<=3; i++){
            if(c>0) dp[i][r][c] = Math.max(dp[i][r][c], dp[i][r][c-1]);
            if(r>0) dp[0][r][c] = Math.max(dp[0][r][c], dp[i][r-1][c]);
            if(c>0 && i>0) dp[i][r][c] = Math.max(dp[i][r][c], dp[i-1][r][c-1]+itemValue[r][c]);
            if(r>0)dp[1][r][c] = Math.max(dp[1][r][c], dp[i][r-1][c]+itemValue[r][c]);
        }

        long ans = 0;
        for(int i=0; i<=3; i++) ans = Math.max(ans, dp[i][R-1][C-1]);

        System.out.println(ans);
        //System.err.println(Arrays.deepToString(dp));

    }
}
