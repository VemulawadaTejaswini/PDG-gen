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


public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] NW = br.readLine().split(" ");
        int N = Integer.parseInt(NW[0]);
        int W = Integer.parseInt(NW[1]);
        int[] w = new int[N+1];
        int[] v = new int[N+1];
        
        for (int i = 0; i < N; i++) {
            String[] s = br.readLine().split(" ");
            w[i+1] = Integer.parseInt(s[0]);
            v[i+1] = Integer.parseInt(s[1]);
        }
        
        long[][] dp = new long[N+1][W+1];
        
        for (int i = 0; i <= W; i++) {
            dp[0][i] = 0;
        }
        
        for (int i = 0; i <= N; i++) {
            dp[i][0] = 0;
        }
        
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= W; j++) {
                if (j-w[i] >= 0) {
                    dp[i][j] = Math.max(dp[i-1][j-w[i]] + v[i], dp[i-1][j]);
                }
                else dp[i][j] = dp[i-1][j];
            }
        }
        
        
        System.out.println(dp[N][W]);
    }
}

