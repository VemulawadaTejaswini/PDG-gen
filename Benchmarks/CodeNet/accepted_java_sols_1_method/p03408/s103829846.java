import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Map<String, Integer> blue = new HashMap<>();
		for (int i = 0; i < n; i++) {
			String s = sc.next();
			if (blue.containsKey(s)) {
				blue.replace(s, blue.get(s) + 1);
			} else {
				blue.put(s, 1);
			}
		}

		int m = sc.nextInt();
		Map<String, Integer> red = new HashMap<>();
		for (int i = 0; i < m; i++) {
			String s = sc.next();
			if (red.containsKey(s)) {
				red.replace(s, red.get(s) + 1);
			} else {
				red.put(s, 1);
			}
		}

		int max = 0;
		for (Map.Entry<String, Integer> entry : blue.entrySet()) {
			int i = 0;
			if (red.containsKey(entry.getKey()))  {
				i = red.get(entry.getKey());
			}
			if (entry.getValue() > i) {
				max = Math.max(max, entry.getValue() - i);
			}
		}

		System.out.println(max);


		sc.close();

	}

}
