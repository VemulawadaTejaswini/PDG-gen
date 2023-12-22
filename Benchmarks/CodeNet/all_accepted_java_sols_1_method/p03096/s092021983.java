import java.util.*;

public class Main {
    static final int MOD = 1000000007;
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] dp = new int[n + 1];
		dp[0] = 1;
		HashMap<Integer, TreeSet<Integer>> map = new HashMap<>();
		for (int i = 1; i <= n; i++) {
		    int x = sc.nextInt();
		    int add = 0;
		    if (map.containsKey(x)) {
		        TreeSet<Integer> set = map.get(x);
		        int y = set.last();
		        if (i - y > 1) {
		            add = dp[y];
		        }
		        set.add(i);
		        map.put(x, set);
		    } else {
		        TreeSet<Integer> set = new TreeSet<>();
		        set.add(i);
		        map.put(x, set);
		    }
		    
		    dp[i] = (dp[i - 1] + add) % MOD;
		}
		System.out.println(dp[n]);
	}
}
