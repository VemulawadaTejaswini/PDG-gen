import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n, m;
		while ((n = in.nextInt()) != 0 & (m = in.nextInt()) != 0) {
			int counter = 0;
			HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();
			a(in, n, hmap);
			int[] array = new int[m];
			for (int i = 0; i < m; i++) {
				int val = in.nextInt();
				int j = 0;
				int v = val;
				do {
					v = val + array[j];
					array[j] = v;
					if (hmap.containsKey(v)) {
						counter += hmap.get(v);
					}
				} while (j++ < i);
			}
			System.out.println(counter);
		}

	}

	private static void a(Scanner in, int n, HashMap<Integer, Integer> map) {
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			int val = in.nextInt();
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
}