import java.io.*;
import java.util.*;
public class Main {
    
    static double ret = 0.0;
    public static void main(String args[]) {
        int c = 0;
        double[] p = null;
        try (Scanner scanner = new Scanner(System.in)) {
            c = scanner.nextInt();
            
            p = new double[c];
            for(int i = 0; i < c; i++) {
                p[i] = scanner.nextDouble();
            }
            
        }
        
       double[][] dp = new double[c + 1][c + 1];
       dp[0][0] = 1;
       for(int i = 1; i <= c ; i++) {
           for(int j = 0; j <= i; j++) {
               if(j > 0)
                dp[i][j] += dp[i-1][j-1]*p[i - 1];
            dp[i][j] += dp[i-1][j]*(1 -p[i - 1]);
           }
       }
       
       double ret = 0.0;
       for(int j = (c/2)+1; j <= c; j++) {
           ret += dp[c][j];
       }
       
       System.out.println(ret);
    }
}