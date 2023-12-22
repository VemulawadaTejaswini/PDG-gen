import java.io.*;
import java.util.*;

class Main {

	public static void main(String[] args) throws Exception {
		final Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		NavigableMap<Integer, Integer> h = new TreeMap<>();
		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			if (h.isEmpty()) {
				h.put(a, 1);
				continue;
			}
			if (h.firstEntry().getKey() >= a) {
				h.put(a, h.getOrDefault(a, 0) + 1);
				continue;
			}

			int v = h.lowerEntry(a).getValue();
			if (v > 1) {
				h.put(h.lowerEntry(a).getKey(), v - 1);
			} else {
				h.remove(h.lowerEntry(a).getKey());
			}

			if (h.containsKey(a)) {
				h.put(a, h.get(a) + 1);
			} else {
				h.put(a, 1);
			}
		}

		int count = 0;
		for (Map.Entry<Integer, Integer> i : h.entrySet()) {
			count += i.getValue();
		}

		System.out.println(count);
	}
}
