import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	static int[] ans;
	static Map<Integer, Integer> map;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = Integer.parseInt(sc.next());
		int Q = Integer.parseInt(sc.next());
		ans = new int[N];

		map = new HashMap<>();
		for (int i = 0; i < N - 1; i++) {
			int a = Integer.parseInt(sc.next());
			int b = Integer.parseInt(sc.next());
			if (map.get(b) == null) {
				map.put(b, a);
			}
		}

		for (int i = 0; i < Q; i++) {
			int a = Integer.parseInt(sc.next());
			int b = Integer.parseInt(sc.next());
			ans[a - 1] += b;
		}

		for (int i = 2; i <= N; i++) {
			int p = map.get(i);
			ans[i - 1] += ans[p - 1];
		}
		for (int i = 0; i < N; i++) {
			if (i < N - 1) {
				System.out.print(ans[i]);
				System.out.print(" ");
			} else {
				System.out.println(ans[i]);
			}
		}
		sc.close();
	}
}