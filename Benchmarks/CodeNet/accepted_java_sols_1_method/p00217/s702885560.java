import java.util.*;
class Main {
	static int n;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			n = sc.nextInt();
			if (n == 0) break;
			int maxDistance = 0;
			Map<Integer, Integer> map = new HashMap<Integer, Integer>();
			for (int i = 0; i < n; i++) {
				int p = sc.nextInt();
				int d = sc.nextInt() + sc.nextInt();
				map.put(d, p);
				maxDistance = Math.max(d, maxDistance);
			}
			System.out.printf("%d %d\n", map.get(maxDistance), maxDistance);
		}
	}
}