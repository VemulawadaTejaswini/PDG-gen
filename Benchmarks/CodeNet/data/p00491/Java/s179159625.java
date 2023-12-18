import java.util.*;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Collections;
import java.awt.Point;
import java.util.Map;
import java.util.HashMap;


public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nk = br.readLine().split(" ");
        int n = Integer.parseInt(nk[0]);
        int ka = Integer.parseInt(nk[1]);
        
        int[] fixed = new int[n+1];
        for (int i = 0; i < ka; i++) {
            String[] line = br.readLine().split(" ");
            fixed[Integer.parseInt(line[0])] = Integer.parseInt(line[1]);
        }
        
        //i日目まで、今日、昨日
        long[][][] dp = new long[n+1][4][4];
        dp[0][0][0] = 1;
        for (int i = 1; i < n+1; i++) {
            for (int j = 1; j < 4; j++) {
                for (int k = 0; k < 4; k++) {
                    for (int l = 0; l < 4; l++) {
                        if (j==k && k==l) continue;
                        if (fixed[i] > 0 && fixed[i] != j) continue;
                        
                        dp[i][j][k] += dp[i-1][k][l];
                        if (dp[i][j][k] >= 10000) dp[i][j][k] -= 10000;
                        //System.out.println(dp[i][j][k]);
                    }
                }
            }
        }
        
        long ans = 0;
        for (int k = 1; k < 4; k++) {
            for (int l = 1; l < 4; l++) {
                ans += dp[n][k][l];
                if (ans >= 10000) ans -= 10000;
            }
        }
        
        //System.out.println(dp[1][1][1]);
        System.out.println(ans);
    }
}




