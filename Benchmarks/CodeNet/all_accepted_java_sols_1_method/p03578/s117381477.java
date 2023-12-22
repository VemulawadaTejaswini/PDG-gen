

import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int d = 0;
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < n; i++) {
			d = Integer.parseInt(sc.next());
			if (map.containsKey(d)) {
				map.put(d, map.get(d) + 1);
			} else {
				map.put(d, 1);
			}
		}

		int m = sc.nextInt();
		int[] t = new int[m];
		for (int i = 0; i < m; i++) {
			t[i] = Integer.parseInt(sc.next());
		}

		String ans = "YES";
		for (int te : t) {
			if (map.containsKey(te)) {
				if (map.get(te) == 1)
					map.remove(te);
				else
					map.put(te, map.get(te) - 1);
			} else {
				ans = "NO";
				break;
			}
		}

		System.out.println(ans);
	}

}
