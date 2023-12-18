import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();

		Eratosthenes e = new Eratosthenes(n);
		long ans = 0;
		for (int c = 1; c < n; c++) {
			Map<Integer, Integer> soinsu = e.bunkai(n - c);
			long val = 1;
			for (Integer key : soinsu.keySet()) {
				val *= soinsu.get(key) + 1;
			}
			ans += val;
		}
		System.out.println(ans);
	}

	static class Eratosthenes {
		int[] div;

		public Eratosthenes(int n) {
			if (n < 2) return;
			div = new int[n + 1];
			div[0] = -1;
			div[1] = -1;
			int end = (int) Math.sqrt(n) + 1;
			for (int i = 2; i <= end; i++) {
				if (div[i] == 0) {
					div[i] = i;
					for (int j = i * i; j <= n; j+=i) {
						if (div[j] == 0) div[j] = i;
					}
				}
			}
			for (int i = end + 1; i <= n; i++) {
				if (div[i] == 0) div[i] = i;
			}
		}

		public Map<Integer, Integer> bunkai(int x) {
			Map<Integer, Integer> soinsu = new HashMap<>();
			while (x > 1) {
				Integer d = div[x];
				soinsu.put(d, soinsu.getOrDefault(d, 0) + 1);
				x /= d;
			}
			return soinsu;
		}

		public boolean isSosuu(int x) {
			return div[x] == x;
		}
	}
}
