import java.util.*;
import java.lang.*;

/*
 * https://atcoder.jp/contests/dp/
 */
public class Main{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt();
        int[] dp = new int[n];
        dp[0] = 0;
        List asiba = new ArrayList();
        for (int i=0; i<n; i++) asiba.add(sc.nextInt());

        for (int i=1; i<n; i++) {
        	dp[i] = dp[i-1] + Math.abs((Integer)asiba.get(i) - (Integer)asiba.get(i-1));
        	if (i > 1) {
        		dp[i] = Math.min(dp[i], dp[i-2] + Math.abs((Integer)asiba.get(i) - (Integer)asiba.get(i-2)));
        	}
        }
        System.out.println(dp[n-1]);
        sc.close();
	}
}