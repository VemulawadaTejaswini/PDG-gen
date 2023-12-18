import java.util.*;

public class Main {

	public static void main (String[] args)  {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long p = sc.nextLong();
		HashMap<Long, Integer> map = new HashMap<>();
		for (long i = 2; i * i <= p; i++) {
			int count = 0;
			while (p % i == 0) {
				count++;
				p /= i;
			}
			if (count != 0) {
				map.put(i, count);
			}
		}
		if (p != 1) {
			map.put(p, 1);
		}
		long ans = 1;
		for (Map.Entry<Long, Integer> entry : map.entrySet()) {
			long x = entry.getValue();
			for (int i = 0; i < x / n; i++) {
				ans *= entry.getKey();
			}
		}
		System.out.println(ans);
	}
}
