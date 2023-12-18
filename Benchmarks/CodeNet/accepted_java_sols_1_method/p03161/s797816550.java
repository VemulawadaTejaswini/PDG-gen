import java.io.*;
import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        int[] dp = new int[n];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        for(int i=0;i<n;i++){
            for(int j=1;j<=k && i+j<n;j++){
                dp[i+j] = Math.min(dp[i+j], dp[i]+Math.abs(a[i+j]-a[i]));
            }
        }
        System.out.println(dp[n-1]);
    }
}