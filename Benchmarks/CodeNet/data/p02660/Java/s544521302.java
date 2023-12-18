import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		HashMap<Integer, Integer> map = primeFactorize(n);
		int ans = 0;
		for (Entry<Integer, Integer> entry : map.entrySet()) {
			int value = entry.getValue();
			int index = 1;
			while (value >= index) {
				ans++;
				value -= index;
				index++;
			}
		}
		System.out.println(ans);
		sc.close();
	}

	static HashMap<Integer, Integer> primeFactorize(long n) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		if (n < 2) {
			return map;
		}

		for (int i = 2; i * i <= n; i++) {
			if (n % i != 0) {
				continue;
			}
			int times = 0;
			while (n % i == 0) {
				times++;
				n /= i;
			}
			map.put(i, times);
		}
		if (n != 1) {
			map.put((int) n, 1);
		}
		return map;
	}
}