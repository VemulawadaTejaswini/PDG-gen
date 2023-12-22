import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		long k = scanner.nextLong();

		int[] list = new int[n];
		HashMap<Integer, Long> bs = new HashMap<Integer, Long>();

		for (int i = 0; i < n; i++) {
			scanner.nextLine();
			int a = scanner.nextInt();
			long b = scanner.nextLong();
			list[i] = a;
			if (bs.containsKey(a)) {
				bs.put(a, (bs.get(a) + b));
			} else {
				bs.put(a, b);
			}
		}
		Arrays.sort(list);
		int ans = 0;
		long sum = 0;
		for (int i = 0; i < n; i++) {
			if (sum >= k) {
				break;
			}
			if (ans == list[i]) {
				continue;
			} else {
				ans = list[i];
				sum += bs.get(list[i]);
			}
		}
		System.out.println(ans);
		scanner.close();
	}
}
