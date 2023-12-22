/**
 *
 * @author Daipayan Mukherjee
 * @Jadavpur University,Information Technology
 *
 */
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] s = br.readLine().split(" ");
        int[] heights = new int[n];
        for(int i=0;i<n;i++){
            heights[i] = Integer.parseInt(s[i]);
        }
        int[] dp = new int[n];
        Arrays.fill(dp,Integer.MAX_VALUE);
        
        dp[0] = 0;
        
        for(int i=1;i<n;i++){
            dp[i] = Math.min(dp[i],dp[i-1]+Math.abs(heights[i-1]-heights[i]));
            if(i>=2)
                dp[i] = Math.min(dp[i], dp[i-2]+Math.abs(heights[i-2]-heights[i]));
        }
        System.out.println(dp[n-1]);
    }
}
