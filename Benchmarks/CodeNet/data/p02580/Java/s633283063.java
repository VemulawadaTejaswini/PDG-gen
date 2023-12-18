import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		var h = sc.nextInt();
		var w = sc.nextInt();
		var m = sc.nextInt();
		var map1 = new HashMap<Integer, Integer>();
		var map2 = new HashMap<Integer, Integer>();
		var set = new HashSet<Long>();
		for (var i = 0; i < m; i++) {
			var h1 = sc.nextInt();
			var w1 = sc.nextInt();
			if (!map1.containsKey(h1)) {
				map1.put(h1, 0);
			}
			map1.put(h1, map1.get(h1) + 1);
			if (!map2.containsKey(w1)) {
				map2.put(w1, 0);
			}
			map2.put(w1, map2.get(w1) + 1);
			set.add((long) h1 * w + w1);
		}
		sc.close();

		var result1 = 0;
		for (var key1 : map1.keySet()) {
			result1 = Math.max(result1, map1.get(key1));
		}
		var result2 = 0;
		for (var key2 : map2.keySet()) {
			result2 = Math.max(result2, map2.get(key2));
		}

		boolean check = false;
		for (var key1 : map1.keySet()) {
			if (map1.get(key1) == result1) {
				for (var key2 : map2.keySet()) {
					if (map2.get(key2) == result2) {
						if (!set.contains((long) key1 * w + key2)) {
							check = true;
						}
					}
				}
			}
		}
		var result = result1 + result2 - (check ? 0 : 1);
		System.out.println(result);
	}
}
