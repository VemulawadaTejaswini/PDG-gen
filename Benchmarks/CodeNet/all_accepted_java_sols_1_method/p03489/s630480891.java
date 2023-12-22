
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Map<Long, Long> list = new HashMap<>();
		for(int i = 0; i < n; i++) {
			long a = sc.nextLong();
			if(list.containsKey(a)) {
				list.put(a, list.get(a) + 1);
			} else {
				list.put(a, (long) 1);
			}
		}
		long ans = 0;
		for(Map.Entry<Long, Long> e : list.entrySet()) {
			long key = e.getKey();
			long value = e.getValue();
			if(value < key) {
				ans += value;
			} else if(value > key) {
				ans += (value - key);
			}
		}
		System.out.println(ans);
	}

}
