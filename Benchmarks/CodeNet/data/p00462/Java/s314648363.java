
import java.io.IOException;
import java.util.Arrays;
import java.util.NavigableSet;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) throws IOException {

		new Main().run();
	}

	private void run() throws IOException {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			int d = scanner.nextInt();
			if (d == 0)
				break;
			int n = scanner.nextInt();
			int m = scanner.nextInt();
			NavigableSet<Integer> set = new TreeSet<Integer>();
			set.add(0);
			for (int i = 0; i < n - 1; i++)
				set.add(scanner.nextInt());
			set.add(d);
			Integer[] p = set.toArray(new Integer[0]);
			int ans = 0;
			for (int i = 0; i < m; i++) {
				int k = scanner.nextInt();
				int pos = Arrays.binarySearch(p, k);
				if (pos < 0) {
					pos = -pos  -2;
					int c = Math.min(k - p[pos], p[pos + 1] - k);
					ans += c;
				}
			}
			System.out.println(ans);
		}
	}
}