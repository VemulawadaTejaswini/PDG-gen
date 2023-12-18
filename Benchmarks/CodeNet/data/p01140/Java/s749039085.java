import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			if (n == 0 && m == 0)
				break;
			int[] h = new int[n];
			Map<Integer, Integer> height = new HashMap<Integer, Integer>(0);
			int[] w = new int[m];
			Map<Integer, Integer> width = new HashMap<Integer, Integer>(0);
			int hmax = 0, wmax = 0;
			for (int i = 0; i < n; i++) {
				h[i] = sc.nextInt();
				int hh = h[i];
				add(height, hh);
				for (int j = i - 1; j >= 0; j--) {
					hh += h[j];
					add(height, hh);
				}
				if (i == n - 1)
					hmax = hh;
			}
			for (int i = 0; i < m; i++) {
				w[i] = sc.nextInt();
				int ww = w[i];
				add(width, ww);
				for (int j = i - 1; j >= 0; j--) {
					ww += w[j];
					add(width, ww);
				}
				if (i == m - 1)
					wmax = ww;
			}
			int result = 0;
			for (int i = 0; i <= Math.min(hmax, wmax); i++)
				if (height.containsKey(i) && width.containsKey(i))
					result += height.get(i) * width.get(i);
			System.out.println(result);
		}
		sc.close();
	}

	static void add(Map<Integer, Integer> map, int key) {
		if (map.containsKey(key))
			map.put(key, map.get(key) + 1);
		else
			map.put(key, 1);
	}
}