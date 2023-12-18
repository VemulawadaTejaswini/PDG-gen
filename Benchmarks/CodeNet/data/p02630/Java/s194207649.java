import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		long sum = 0;
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < n; i++) {
			int num = sc.nextInt();
			if (map.containsKey(num)) {
				int tmp = map.get(num) + 1;
				map.put(num, tmp);
			} else {
				map.put(num, 1);
			}
			sum += (long) num;
		}
		int q = sc.nextInt();
		int[] b = new int[q];
		int[] c = new int[q];
		for (int i = 0; i < q; i++) {
			b[i] = sc.nextInt();
			c[i] = sc.nextInt();
		}
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < q; i++) {
			if (map.containsKey(b[i])) {
				int num = map.get(b[i]);
				map.put(b[i], 0);
				sum -= (long) (num * b[i]);
				sum += (long) (num * c[i]);
				if (map.containsKey(c[i])) {
					int value = map.get(c[i]);
					map.put(c[i], value + num);
				} else {
					map.put(c[i], num);
				}
			}
			sb.append(sum);
			sb.append("\n");
		}
		System.out.println(sb.toString());
		sc.close();
	}
}