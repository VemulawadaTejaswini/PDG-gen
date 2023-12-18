import java.util.*;

public class Main {
    static final int MOD = 998244353;
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int s = sc.nextInt();
		ArrayList<TreeMap<Integer, Integer>> dp = new ArrayList<>();
		for (int i = 0; i <= n; i++) {
		    dp.add(new TreeMap<>());
		}
		dp.get(0).put(0, 1);
		for (int i = 0; i < n; i++) {
		    int x = sc.nextInt();
		    for (int j = i; j >= 0; j--) {
		        TreeMap<Integer, Integer> current = dp.get(j);
		        TreeMap<Integer, Integer> next = dp.get(j + 1);
		        for (int y : current.keySet()) {
		            if (x + y > s) {
		                break;
		            }
		            if (next.containsKey(x + y)) {
		                next.put(x + y, (next.get(x + y) + current.get(y)) % MOD);
		            } else {
		                next.put(x + y, current.get(y));
		            }
		        }
		    }
		}
		long[] pows = new long[n];
		pows[0] = 1;
		for (int i = 1; i < n; i++) {
		    pows[i] = pows[i - 1] * 2 % MOD;
		}
		long ans = 0;
		for (int i = 1; i <= n; i++) {
		    if (dp.get(i).containsKey(s)) {
		        ans += dp.get(i).get(s) * pows[n - i] % MOD;
		    }
		}
	    System.out.println(ans);
	}
}
