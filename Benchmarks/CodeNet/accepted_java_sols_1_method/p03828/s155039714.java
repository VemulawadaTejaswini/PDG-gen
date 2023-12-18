import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		long mod = 1000000007;
		long count = 1;
		boolean[] num = new boolean[n+1];
		Arrays.fill(num, true);
		num[0] = false;
		num[1] = false;
		double m = Math.sqrt(n);
		for (int i = 2; i <= m; i++) {
			for (int j = i*2; j <= n; j+=i) {
				num[j] = false;
			}
		}
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i <= n; i++) {
			if (num[i]) {
				map.put(i, 0);
			}
		}
		
		for (int i = 2; i <= n; i++) {
			int N = i;
			for (Integer p : map.keySet()) {
				while (N%p == 0) {
					map.put(p, map.get(p)+1);
					N/=p;
				}
			}
		}
		for (Integer p : map.keySet()) {
			count = (count*(map.get(p)+1))%mod;
		}
		System.out.println(count);
	}
}
