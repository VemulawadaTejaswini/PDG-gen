import java.util.Collections;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

class Main {

	public static void main(String[] args) {

		Scanner sc = null;
		Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
		try {
			sc = new Scanner(System.in);
			while (sc.hasNextInt()) {
				int num = sc.nextInt();
				map.put(num, map.containsKey(num) ? map.get(num) + 1 : 1);
			}

			int maxValue = Collections.max(map.values());
			for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
				if (maxValue == entry.getValue()) {
					System.out.println(entry.getKey());
				}
			}

		} finally {
			sc.close();
		}
	}
}