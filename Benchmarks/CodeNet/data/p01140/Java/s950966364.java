import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n, m;
		while ((n = in.nextInt()) != 0 & (m = in.nextInt()) != 0) {
			List<Integer> list = new ArrayList<Integer>();
			HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();
			a(in, n, list, hmap);
			HashMap<Integer, Integer> wmap = new HashMap<Integer, Integer>();
			a(in, m, list, wmap);
			int counter = 0;
			Set<Integer> sqws = new HashSet<Integer>();
			sqws.addAll(hmap.keySet());
			sqws.retainAll(wmap.keySet());
			for (Integer size : sqws) {
				counter += hmap.get(size) * wmap.get(size);
			}
			System.out.println(counter);
		}

	}

	private static void a(Scanner in, int n, List<Integer> list,
			HashMap<Integer, Integer> map) {
		list.clear();
		for (int i = 0; i < n; i++) {
			int val = in.nextInt();
			int size = list.size();
			int j = 0;
			int v = val;
			do {
				list.add(v);
				final int value = (map.containsKey(v)) ? map.get(v) : 0;
				map.put(v, value + 1);
				v = val + list.get(size - i + j);
			} while (j++ < i);
		}
	}
}