import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++) a[i] = sc.nextInt();
		long [] sum = new long[n + 1];
		for(int i = 0; i < n; i++) sum[i + 1] = (sum[i] + a[i]) % m;
		Map<Long, Integer> map = new HashMap<>();
		for(int i = 0; i < n + 1; i++) {
			if(map.containsKey(sum[i])) map.put(sum[i], map.get(sum[i]) + 1);
			else map.put(sum[i], 1);
		}
		long ans = 0;
		for(long key : map.keySet()) {
			if(map.get(key) >= 2) {
				long x = map.get(key);
				ans += x * (x - 1) / 2;
			}
		}
		System.out.println(ans);
	}
}
