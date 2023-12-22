/*
    Those who cannot remember the past are condemned to repeat it.
                                            - Dynamic Programming
    
    I never lose, I either win or I learn.
                - Competitive Programming

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        PrintWriter pw = new PrintWriter(System.out);

        char[] c1 = br.readLine().toCharArray();
        char[] c2 = br.readLine().toCharArray();
        int n1 = c1.length;
        int n2 = c2.length;

        int[][] dp = new int[n1+1][n2+1];

        for(int i=1 ; i<=n1 ; i++) {
            for(int j=1 ; j<=n2 ; j++) {
                if(c1[i-1] == c2[j-1]) {
                    dp[i][j] = dp[i-1][j-1] + 1;
                }
                else {
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }

        char[] lcs = new char[dp[n1][n2]];

        int x = n1;
        int y = n2;
        int ind = lcs.length-1;
        while(x > 0 && y > 0) {
            if(c1[x-1] == c2[y-1]) {
                lcs[ind--] = c1[x-1];
                x--;
                y--;
            }
            else {
                if(dp[x][y] == dp[x-1][y]) {
                    x--;
                }
                else {
                    y--;
                }
            }
        }

        pw.println(lcs);

        
        
        
        
        
        
        
        pw.flush();
        pw.close();
    }
}
