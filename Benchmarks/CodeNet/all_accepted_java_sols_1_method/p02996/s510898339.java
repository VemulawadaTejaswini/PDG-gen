import java.util.*;
import java.util.Map.Entry;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Map<Long, Long> map = new TreeMap<Long, Long>();
		for (int i = 0; i < N; i++) {
			long a = sc.nextLong();
			long b = sc.nextLong();
			if (map.containsKey(b)) {
				long val = map.get(b);
				map.put(b, val + a);
			} else {
				map.put(b, a);
			}
		}
		sc.close();

		long time = 0;
		for (Entry<Long, Long> entry : map.entrySet()) {
			time += entry.getValue();
			if (time > entry.getKey()) {
				System.out.println("No");
				return;
			}
		}
		System.out.println("Yes");
	}
}
