import java.util.*;
import java.math.*;
import java.io.BufferedInputStream;
public class Main{
public static void main(String[] args){
        Scanner sc = new Scanner (new BufferedInputStream(System.in));
        int h = sc.nextInt();
        int n = sc.nextInt();
        int[][] num = new int[n][2];
        for(int i = 0; i < n; ++i) {
            num[i][0] = sc.nextInt();
            num[i][1] = sc.nextInt();
        }
        int[] dp = new int[h + 1];
  		
        Arrays.fill(dp, Integer.MAX_VALUE);
  		dp[0] = 0;
        for(int i = 0; i < n; ++i) {
            for(int j = 0; j <= h; ++j) {
              	if(dp[j] == Integer.MAX_VALUE) continue;
                int index = j + num[i][0];
                if(index >= h) index = h;
                dp[index] = Math.min(dp[index], dp[j] + num[i][1]);
            } 
        }
        System.out.println(dp[h]);                       
      }
}