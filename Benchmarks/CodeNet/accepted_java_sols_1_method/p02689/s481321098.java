
import java.util.HashMap;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		long[] h = new long[n];
		for (int i = 0; i < n; i++) {
			h[i] = Long.parseLong(sc.next());
		}
		int a = 0;
		int b = 0;
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < m; i++) {
			a = Integer.parseInt(sc.next()) - 1;
			b = Integer.parseInt(sc.next()) - 1;
			if (h[a] > h[b]) {
				if (!map.containsKey(b))
					map.put(b, b);
			} else if (h[a] < h[b]) {
				if (!map.containsKey(a))
					map.put(a, a);
			} else {
				if (!map.containsKey(a))
					map.put(a, a);
				if (!map.containsKey(b))
					map.put(b, b);
			}
		}

		System.out.println(n - map.size());

	}

}
