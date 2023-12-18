import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;
import java.math.*;
import java.util.*;
class Main{

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        String t = br.readLine();

        int m = s.length();
        int n = t.length();

        int[][] dp = new int[m + 1][n + 1];
        int max = Integer.MIN_VALUE;
        for(int i = 1; i <= m; i++){
            for(int j = 1; j <= n; j++){

                if(s.charAt(i - 1) == t.charAt(j - 1)){
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                    max = Math.max(max, dp[i][j]);
                }

            }
        }
        
        System.out.println(m - max);

    }
}