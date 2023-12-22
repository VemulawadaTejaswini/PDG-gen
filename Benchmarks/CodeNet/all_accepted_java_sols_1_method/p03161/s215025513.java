import java.math.*;
import java.io.*;
import java.util.*;
 
class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
      	String[] l2 = br.readLine().split(" ");
      
      	int N = Integer.parseInt(l2[0]);
      	int K = Integer.parseInt(l2[1]);
        
        String[] l1 = br.readLine().split(" ");
 
        int[] arr = new int[N];
 
        for(int i = 0; i < arr.length; i++){
            arr[i] = Integer.parseInt(l1[i]);
        }
 
        int[] dp = new int[N];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
 
        for(int i = 0; i < N; i++){
            for(int j = i + 1; j <= i + K && j < N; j++){
                dp[j] = Math.min(dp[j], dp[i] + Math.abs(arr[j] - arr[i]));
            }
        }
        
        System.out.println(dp[N - 1]);
 
    }
}