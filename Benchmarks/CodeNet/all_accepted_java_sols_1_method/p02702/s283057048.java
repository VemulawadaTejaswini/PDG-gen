import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
        int N = S.length();

        int h = 2019;
        int[] dp = new int[h];
        long ans = 0;

        for (int i = 1; i <= N; i++) {
            int[] nextDp = new int[h];
            int now = S.charAt(i-1);
            now -= 48;

            nextDp[now] += 1;
            for (int k = 0; k < h; k++) {
                int n = (k * 10 + now) % h;
                nextDp[n] += dp[k];
            }
            ans += nextDp[0];
            dp = nextDp;
        }
        
		// 出力
        System.out.println(ans);
	}
}
