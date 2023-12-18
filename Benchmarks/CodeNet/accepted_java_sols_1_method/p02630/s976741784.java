import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Map<Long, Long> map = new HashMap<>();
		Long sum = 0L;
		for (int i = 0; i < n; i++) {
			Long key = sc.nextLong();
			Long count = map.getOrDefault(key, 0L);
			count++;
			map.put(key, count);
			sum+=key;
		}
		int q = sc.nextInt();
		for (int i = 0; i < q; i++) {
			Long b = sc.nextLong();
			Long c = sc.nextLong();
			Long diff = c - b;
			Long bValue = map.getOrDefault(b, 0L);
			map.remove(b);
			Long cValue = map.getOrDefault(c, 0L);
			map.put(c, cValue + bValue);
			sum = sum + diff * bValue;
			System.out.println(sum);
		}
	}
}
