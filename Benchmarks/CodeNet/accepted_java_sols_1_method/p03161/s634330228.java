import java.util.*;
import java.lang.*;
import java.io.*;
 
public final class Main
{
    public static void main (String[] args) throws java.lang.Exception {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
      int k = in.nextInt();
        int[] arr = new int[n];
      for(int i =0; i< n; i++)
        arr[i]= in.nextInt();
        
        int[] dp = new int[n];
        dp[0] = 0;
        for(int i=1 ; i<n ; i++)
        {
            int min = Integer.MAX_VALUE;
            for(int j=1 ; j<=k && (i-j)>= 0; j++)
            {   
               
                min = Math.min(dp[i-j] + Math.abs(arr[i] - arr[i-j]), min);
            }
 
            dp[i] = min;
        }
      System.out.println(dp[n-1]);
    }
}
