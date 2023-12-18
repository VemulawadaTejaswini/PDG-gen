
import java.io.IOException;
import java.util.NavigableSet;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) throws IOException {
		new Main().run();
	}

	private void run() throws IOException {
		Scanner scanner = new Scanner(System.in);
		int MAX = 10000000;
		boolean[] prim = new boolean[MAX + 1];
		for (int i = 2; i <= Math.sqrt(MAX); i++) {
			if (!prim[i]) {
				for (int j = i * 2; j <= MAX; j += i) {
					prim[j] = true;
				}
			}
		}
		NavigableSet<Integer> set = new TreeSet<>();
		for (int i = 13; i <= MAX; i += 2) {
			if (!prim[i] && !prim[i - 2] && !prim[i - 6] && !prim[i - 8])
				set.add(i);
		}
		while (true) {
			int n = scanner.nextInt();
			if (n == 0)
				break;
			int ans = set.floor(n);
			System.out.println(ans);
		}
	}
}