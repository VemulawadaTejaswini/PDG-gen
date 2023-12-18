import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n, m;
		while ((n = in.nextInt()) != 0 & (m = in.nextInt()) != 0) {
			HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();
			a(in, n, hmap);
			HashMap<Integer, Integer> wmap = new HashMap<Integer, Integer>();
			a(in, m, wmap);
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

	private static void a(Scanner in, int n, HashMap<Integer, Integer> map) {
		int size = 0;
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			int val = in.nextInt();
			size += i + 1;
			int j = 0;
			int v = val;
			do {
				final int value = (map.containsKey(v)) ? map.get(v) : 0;
				map.put(v, value + 1);
				v = val + array[j];
				array[j] = v;
			} while (j++ < i);
		}
	}