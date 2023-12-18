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
            for(int i = 0; i < n ;i++) {
                arr[i] = scanner.nextInt();
            }
        }
        
        // dp[i] = i number of stone
        // will be true if for any arr[x] we have a way when 
        // we chose there is no way i - arr[x] stones can be pick; ie dp[i-arr[x]] == false;
        boolean[] dp = new boolean[k + 1];
        
        for(int stones = 0; stones <= k; stones++) {
            for(int ar : arr) {
                if(stones - ar >= 0 && !dp[stones - ar])
                    dp[stones] = true;
            }
        }

        System.out.println(dp[k]?"First":"Second");
    }
    
}