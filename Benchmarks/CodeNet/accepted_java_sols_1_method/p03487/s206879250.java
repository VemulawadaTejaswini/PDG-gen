import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		long[] map = new long[N];
		for (int i = 0; i < N; i++) {
			map[i] = sc.nextLong();
		}
		
		Arrays.sort(map);
		
		Map<Long, Integer> table = new HashMap<>();
		for (int i = 0; i < N; i++) {
			if (table.containsKey(map[i])) {
				int val = table.get(map[i]);
				val++;
				table.put(map[i], val);
			} else {
				table.put(map[i], 1);
			}
		}
		
		int ans = 0;
		for (Map.Entry<Long, Integer> entry: table.entrySet()) {
			if (entry.getKey() > 100_000) {
				ans += entry.getValue();
			} else if (entry.getKey() != (long)entry.getValue()) {
				if (entry.getKey() < entry.getValue()) {
					ans += entry.getValue() - entry.getKey();
				} else {
					ans += entry.getValue();
				}
			}
		}
		
		System.out.println(ans);
	}

}