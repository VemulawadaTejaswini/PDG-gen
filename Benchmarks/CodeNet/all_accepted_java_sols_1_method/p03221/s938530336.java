import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		int p[] = new int[m];
		int y[] = new int[m];

		String s[] = new String[m];

		HashMap<Integer, TreeMap<Integer, Integer>> map = new HashMap<>();

		for (int i = 0; i < m; i++) {
			p[i] = sc.nextInt();
			y[i] = sc.nextInt();

			map.computeIfAbsent(p[i], e -> new TreeMap<>()).put(y[i], i);

		}

		for (Entry<Integer, TreeMap<Integer, Integer>> a : map.entrySet()) {
			int i = 0;
			for (Entry<Integer, Integer> b : a.getValue().entrySet()) {

				String s1 = String.format("%06d", a.getKey());
				String s2 = String.format("%06d", ++i);
				s[b.getValue()] = s1 + s2;

			}

		}

		Arrays.stream(s).forEach(System.out::println);

		sc.close();

	}

}