import java.util.Scanner;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();
		int M = scan.nextInt();

		TreeMap<Long, Long> tm = new TreeMap<>();
		long cost = 0;

		for (int i = 0; i < N; i++) {
			long key = scan.nextLong();
			long value = scan.nextLong();
			if (tm.containsKey(key)) {
				tm.put(key, tm.get(key) + value);
			} else {
				tm.put(key, value);
			}
		}

		for (long i : tm.keySet()) {
			if (M <= tm.get(i)) {
				cost += i * M;
				break;
			} else {
				M -= tm.get(i);
				cost += i * tm.get(i);
			}
		}
		System.out.println(cost);
		
	}
}