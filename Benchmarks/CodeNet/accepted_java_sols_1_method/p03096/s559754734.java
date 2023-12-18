import java.util.*;
import java.io.*;

public class Main {
    static final int MOD = 1000000007;
	public static void main (String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] dp = new int[n + 1];
		dp[0] = 1;
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 1; i <= n; i++) {
		    dp[i] = dp[i - 1];
		    int x = Integer.parseInt(br.readLine());
		    if (map.containsKey(x)) {
		        int y = map.get(x);
		        if (y + 1 < i) {
		            dp[i] += dp[y];
		            dp[i] %= MOD;
		        }
		    }
		    map.put(x, i);
		}
		System.out.println(dp[n]);
    }
}

