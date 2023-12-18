import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {

      
 public static void main(String[] args) {
    
    Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    int N = in.nextInt(); // Scanner has functions to read ints, longs, strings, chars, etc.
    int K = in.nextInt();
    int[] arr = new int[N];
    int[] dp = new int[N];
    
    for (int m = 1; m <= N; ++m) {
       int n = in.nextInt();
       arr[m-1] = n;
    }
    
    for(int i = 0; i < N; i++) {
        int start = Math.max(i-K, 0);
        dp[i] = Integer.MAX_VALUE;
        for(int j = start; j < i; j++) {
            if(j == 0) {
                dp[i] = Math.abs(arr[i]-arr[j]);
            }
            else {
                dp[i] = Math.min(Math.abs(arr[i]-arr[j])+dp[j], dp[i]); 
            }
        }
    }

    System.out.println(dp[N-1]);
  }
  
}