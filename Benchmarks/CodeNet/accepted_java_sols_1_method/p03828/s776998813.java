import java.util.*;

public class Main {
    static final int MOD = 1000000007;
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 2; i <= n; i++) {
            int x = i;
            for (int j = 2; j * j <= x; j++) {
               while (x % j == 0) {
                    if (map.containsKey(j)) {
                        map.put(j, map.get(j) + 1);
                    } else {
                        map.put(j, 1);
                    }
                    x /= j;
                }
            }
            if (x != 1) {
                if (map.containsKey(x)) {
                    map.put(x, map.get(x) + 1);
                } else {
                    map.put(x, 1);
                }
            }
        }
        long ans = 1;
        for (int x : map.values()) {
            ans *= x + 1;
            ans %= MOD;
        }
		System.out.println(ans);
	}
}
