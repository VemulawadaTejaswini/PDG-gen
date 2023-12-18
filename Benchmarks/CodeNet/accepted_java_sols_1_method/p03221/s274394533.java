import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int[] p = new int[m];
		int[] y = new int[m];
		String[] s = new String[m];
		HashMap<Integer, TreeMap<Integer, Integer>> map = new HashMap<>();
		for (int i = 0; i < m; i++) {
			p[i] = scan.nextInt();
			y[i] = scan.nextInt();
			map.computeIfAbsent(p[i], x -> new TreeMap<>()).put(y[i], i);
		}

		for (Entry<Integer, TreeMap<Integer, Integer>> e : map.entrySet()) {
			int cnt = 1;
			for (Entry<Integer, Integer> f : e.getValue().entrySet()) {
				s[f.getValue()] = String.format("%06d%06d", e.getKey(), cnt);
				cnt++;
			}
		}
		Arrays.stream(s).forEach(System.out::println);
	}
}
