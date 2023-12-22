import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	final static PrintStream so = System.out;
	final static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int n = sc.nextInt();
		Map<Integer, Integer> counter = new HashMap<>();
		for (int i = 0; i<n; i++) {
			int in = sc.nextInt();
			if (counter.containsKey(in)) {
				counter.put(in, counter.get(in) + 1);
			} else {
				counter.put(in, 0);
			}
		}
		int sum = counter.values().stream().mapToInt(i -> i).sum();
		so.println(sum % 2 == 0 ? n - sum : n - sum - 1);
	}
}
