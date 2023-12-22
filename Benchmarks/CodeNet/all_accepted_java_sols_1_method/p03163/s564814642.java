import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {

      
 public static void main(String[] args) {
    
    Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    int N = in.nextInt(); // Scanner has functions to read ints, longs, strings, chars, etc.
    int W = in.nextInt();
    long[][] dp = new long[N+1][W+1];
    
    for (int i = 1 ; i <= N; ++i) {
        int wi = in.nextInt();
        int vi = in.nextInt();
        for(int w = 0; w <= W; w++) {
            if(w >= wi) {
                dp[i][w] = Math.max(dp[i-1][w], vi+dp[i-1][w-wi]);
            }
            else {
                dp[i][w] = dp[i-1][w];
            }
        }
    }
    
    System.out.println(dp[N][W]);
  }
  
}