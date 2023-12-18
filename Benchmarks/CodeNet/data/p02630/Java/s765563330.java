
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			Map<Long, Long> a = new HashMap<>();
			for (int i = 0; i < n; i++) {
				Long tmp = sc.nextLong();
				if (a.containsKey(tmp)) {
					a.put(tmp, a.get(tmp) + tmp);
				} else {
					a.put(tmp, tmp);
				}
			}

			int q = sc.nextInt();
			for (int i = 0; i < q; i++) {
				long b = sc.nextLong();
				long c = sc.nextLong();

				if (a.containsKey(b)) {
					if (a.containsKey(c)) {
						a.put(c, a.get(c) + (a.get(b) / b * c));
					} else {
						a.put(c, a.get(b) / b * c);
					}
					a.remove(b);
				}

				long result = 0;
				for (long l : a.keySet()) {
					result += a.get(l);
				}
				System.out.println(result);
			}

		}
	}
}
