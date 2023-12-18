import java.io.*;
import java.util.*;
public class Main {
   public static void main(String args[]) {
       int n = 0;
       int k = 0;
       int[] arr = null;
       try (Scanner scanner = new Scanner(System.in)) {
           n = scanner.nextInt();
           k = scanner.nextInt();
           arr = new int[n];
           for (int i=0; i < n; i++) {
               arr[i] = scanner.nextInt();
           }
       }
       int[] dp = new int[n];
       dp[0] = 0;
       dp[1] = Math.abs(arr[1] - arr[0]);
       for(int i = 2; i < n ;i++) {
           dp[i] = Integer.MAX_VALUE;
           for(int b = 1; b <= k; b++) {
               if(i-b >= 0) {
                   dp[i] = Math.min(dp[i], dp[i -b] + Math.abs(arr[i]- arr[i-b]));
               }
           }
       }

    //   System.out.println(Arrays.toString(dp));
       System.out.println(dp[n-1]);
   }
}
