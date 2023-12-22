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
        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n+1];
        int[] b = new int[n+1];
        int[] c = new int[n+1];
        
        for (int i = 1; i <= n; i++) {
            String[] s = br.readLine().split(" ");
            a[i] = Integer.parseInt(s[0]);
            b[i] = Integer.parseInt(s[1]);
            c[i] = Integer.parseInt(s[2]);
        }
        
        int[][] dp = new int[n+1][3];
        
        for (int i = 0; i < 3; i++) {
            dp[0][i] = 0;
        }
        
        dp[1][0] = a[1];
        dp[1][1] = b[1];
        dp[1][2] = c[1];
        
        for (int i = 2; i <= n; i++) {
            dp[i][0] = Math.max(dp[i-1][1] + a[i], dp[i-1][2] + a[i]);
            dp[i][1] = Math.max(dp[i-1][0] + b[i], dp[i-1][2] + b[i]);
            dp[i][2] = Math.max(dp[i-1][0] + c[i], dp[i-1][1] + c[i]);
        }
        
        int ans = Math.max(Math.max(dp[n][0], dp[n][1]), dp[n][2]);
        System.out.println(ans);
    }
}

