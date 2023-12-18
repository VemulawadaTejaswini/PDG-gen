import java.util.*;
import java.util.function.*;
import java.math.*;
public class Main {
    public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int M = s.nextInt();
		int[][] dp = new int[M][2];
		for(int i = 0; i < M; i++) {
			dp[i][0] = s.nextInt();
			dp[i][1] = s.nextInt();
		}
		
		Arrays.sort(dp, (a, b) -> Integer.compare(a[1], b[1]));
		
		int cur = -Integer.MAX_VALUE;
		int ans = 0;
		for(int i = 0; i < M; i++) {
			if(cur <= dp[i][0]) {
				ans++;
				cur = dp[i][1];
			}
		}
		System.out.println(ans);
    }
}