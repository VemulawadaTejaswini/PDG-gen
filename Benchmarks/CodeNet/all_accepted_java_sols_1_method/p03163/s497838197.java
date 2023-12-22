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
        
        long[][] dp = new long[N+1][W+1];
        dp[0][0] = 0;
        int[] ws = new int[N+1];
        int[] vs = new int[N+1];
        
        for (int i = 0; i < N; i++) {
            String[] line = br.readLine().split(" ");
            ws[i+1] = Integer.parseInt(line[0]);
            vs[i+1] = Integer.parseInt(line[1]);
        }
        
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= W; j++) {
                if (j-ws[i] >= 0) dp[i][j] = Math.max(dp[i-1][j-ws[i]] + vs[i], dp[i-1][j]);
                else dp[i][j] = dp[i-1][j];
            }
        }
        
        System.out.println(dp[N][W]);
    }
}

