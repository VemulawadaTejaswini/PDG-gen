import java.util.*;
import java.io.*;
import java.lang.*;

public class Main{
    public static long []dp = new long[110000];
    public static void main(String []args){
        Scanner in = new Scanner(System.in);

        int n, k; n = in.nextInt(); k = in.nextInt();
        long []heights = new long[n];

        for(int i = 0; i < n; i ++)
            heights[i] = in.nextLong();

        for (int i = 0; i < 110000; i ++)
            dp[i] = (long)Math.pow(10,18)+5;

        dp[0] = 0;
        for (int i = 1; i < n; i ++){
            if (i - k >= 0){
                for (int j = 1; j <= k; j ++)
                    dp[i] = Math.min(dp[i], dp[i-j]+Math.abs(heights[i]-heights[i-j]));
            }

            else{
                for(int j = 1; j <= i; j ++){
                    dp[i] = Math.min(dp[i], dp[i-j]+Math.abs(heights[i]-heights[i-j]));
                    if (j == i+1)
                        break;
                }
            }
        }

        System.out.print(dp[n-1]);
    }
}