import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			if (n == 0)
				break;
			Map<String, Integer> items = new HashMap<String, Integer>();
			for (int i = 0; i < n; i++) {
				String s = sc.next();
				int cost = sc.nextInt();
				items.put(s, cost);
			}
			int m = sc.nextInt();
			for (int i = 0; i < m; i++) {
				String recipeName = sc.next();
				int k = sc.nextInt();
				int sum = 0;
				for (int j = 0; j < k; j++) {
					String name = sc.next();
					if (items.containsKey(name))
						sum += items.get(name);
				}
				items.put(recipeName, Math.min(sum, items.get(recipeName)));
			}
			String query = sc.next();
			System.out.println(items.get(query));
		}
	}
}