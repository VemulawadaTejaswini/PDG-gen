import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			if (map.containsKey(a)) {
				map.put(a, map.get(a) + 1);
			} else {
				map.put(a, 1);
			}
		}
		int total = 0;
		for (int x : map.keySet()) {
			int y = map.get(x);
			if (y >= x) {
				total += y - x;
			} else {
				total += y;
			}
		}
		System.out.println(total);
	}
}
