import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();
		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			if (map.containsKey(a)) {
				map.put(a, map.get(a) + 1);
			} else {
				map.put(a, 1);
			}
		}
		sc.close();

		int max1 = 0;
		int max2 = 0;
		while (map.size() > 0) {
			int key = map.lastKey();
			int val = map.get(key);
			map.remove(key);
			if (val < 2) {
				continue;
			}
			if (max1 == 0) {
				max1 = key;
				if (val < 4) {
					continue;
				}
			}
			if (max2 == 0) {
				max2 = key;
				break;
			}
		}
		System.out.println((long) max1 * max2);
	}
}
