import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] sa = br.readLine().split(" ");
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(sa[i]);
		}
		br.close();

		Set<Integer> set = new HashSet<>();
		int gcd = a[0];
		boolean p = true;
		for (int i = 0; i < n; i++) {
			Map<Integer, Integer> map = bunkai(a[i]);
			for (Integer o : map.keySet()) {
				if (!set.add(o)) {
					p = false;
				}
			}
			gcd = gcd(gcd, a[i]);
		}
		if (p) {
			System.out.println("pairwise coprime");
		} else if (gcd == 1) {
			System.out.println("setwise coprime");
		} else {
			System.out.println("not coprime");
		}
	}

	static Map<Integer, Integer> bunkai(int n) {
		Map<Integer, Integer> soinsu = new HashMap<>();
		int end = (int) Math.sqrt(n);
		int d = 2;
		while (n > 1) {
			if (n % d == 0) {
				n /= d;
				if (soinsu.containsKey(d)) {
					soinsu.put(d, soinsu.get(d) + 1);
				} else {
					soinsu.put(d, 1);
				}
				end = (int) Math.sqrt(n);
			} else {
				if (d > end) {
					d = n - 1;
				}
				d++;
			}
		}
		return soinsu;
	}

	static int gcd(int a, int b) {
		return b == 0 ? a : gcd(b, a % b);
	}
}
