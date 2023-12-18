import java.util.*;
public class Main {
	
	public static void main(String... args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		long K = sc.nextLong();
		
		Map<Integer, Long> map = new HashMap<>(N);
		for (int i = 0; i < N; i++) {
			int a = sc.nextInt();
			long b = sc.nextLong();
			
			if (!map.containsKey(a)) {
				map.put(a, b);
			} else {
				long val = map.get(a);
				val += b;
				map.put(a, val);
			}
		}
		
		for (int i = 0; i <= 100_000; i++) {
			if (map.containsKey(i)) {
				K -= map.get(i);
			}
			
			if (K <= 0) {
				System.out.println(i);
				return;
			}
		}
	}
}
