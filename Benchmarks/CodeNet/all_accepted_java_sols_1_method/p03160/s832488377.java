import java.io.*;
import java.util.*;
public class Main {
    
    public static void main(String args[]) {
        int n = 0;
        int[] arr = null;
        try (Scanner scanner = new Scanner(System.in)) {
            n = scanner.nextInt();
            arr = new int[n];
            for (int i=0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
        }
        int[] dp = new int[n];
        dp[1] = Math.abs(arr[1] - arr[0]);
        for(int i = 2; i < n; i++) {
            dp[i] = Math.min(dp[i - 1] + Math.abs(arr[i] - arr[i -1])
                            , dp[i - 2] + Math.abs(arr[i] - arr[i - 2]));
         
        }
        
        System.out.println(dp[n - 1]);
    }
}