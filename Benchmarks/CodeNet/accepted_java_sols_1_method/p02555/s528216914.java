import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int mod = 1000000007;
        int s = sc.nextInt();
        int[] dp = new int[s+1];
        dp[0] = 1;
        int x = 0;
        for (int i = 3; i <= s; i++) {
            x = (x + dp[i - 3]) % mod ;
            dp[i] = x;
        }
        System.out.println(dp[s]);
	}
}