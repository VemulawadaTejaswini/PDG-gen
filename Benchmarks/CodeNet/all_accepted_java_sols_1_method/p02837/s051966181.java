import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Map<Integer, Integer>> list = new ArrayList<>();
		for (int i = 1; i <= n; i++) {
			int a = sc.nextInt();
			Map<Integer, Integer> map = new HashMap<>();
			for (int j = 0; j < a; j++) {
				int x = sc.nextInt() - 1;
				int y = sc.nextInt();
				map.put(x, y);
			}
			list.add(map);
		}
		sc.close();

		int ans = 0;
		int end = 1 << n;
		label:
		for (int i = 0; i < end; i++) {
			int[] b = new int[n];
			for (int j = 0; j < n; j++) {
				if ((i >> j & 1) == 1) {
					b[j] = 1;
				}
			}
			for (int j = 0; j < n; j++) {
				if ((i >> j & 1) == 1) {
					Map<Integer, Integer> map = list.get(j);
					for (int k : map.keySet()) {
						int v = map.get(k);
						if (b[k] != v) {
							continue label;
						}
					}
				}
			}
			ans = Math.max(ans, Integer.bitCount(i));
		}
		System.out.println(ans);
	}
}
