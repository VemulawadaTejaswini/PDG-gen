import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int max = 0;
		Map<String, Integer> mm = new HashMap<>();

		for (int i = 0; i < n; i++) {
			String t = sc.next();
			if (mm.containsKey(t)) {
				mm.put(t, (mm.get(t) + 1));
			} else {
				mm.put(t, 1);
			}

			if (mm.get(t) > max) {
				max = mm.get(t);
			}
		}

		List<String> result = new ArrayList<>();
		for (String str : mm.keySet()) {
			if (mm.get(str) == max) {
				result.add(str);
			}
		}

		Collections.sort(result);

		for (String s : result) {
			System.out.println(s);
		}

		sc.close();

	}
}
