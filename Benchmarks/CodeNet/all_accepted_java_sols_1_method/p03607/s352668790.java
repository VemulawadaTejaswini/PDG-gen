import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		long[] a = new long[n];
		HashMap<Long, Integer> map = new HashMap<>();
		for (int i = 0; i < n; i++) {
			a[i] = scan.nextLong();
			if (map.containsKey(a[i])) {
				map.remove(a[i]);
			} else {
				map.put(a[i], 1);
			}
		}
		System.out.println(map.size());
	}
}
