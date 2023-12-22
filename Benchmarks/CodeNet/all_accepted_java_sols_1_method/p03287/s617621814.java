import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		long[] a = new long[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();

		for (int i = 1; i < n; i++) {
			a[i] += a[i - 1]; 
		}

		Map<Long, Long> map = new HashMap<Long, Long>();
		map.put(0L, 1L);
		for (int i = 0; i < n; i++) {
			long b = a[i] % m;
			if (map.containsKey(b)) {
				map.put(b, map.get(b) + 1L);
			} else {
				map.put(b, 1L);
			}
		}

		long ans = 0;
		for (long b : map.keySet()) {
			long c = map.get(b);
			ans += c * (c - 1) / 2;
		}
		System.out.println(ans);
	}
}
