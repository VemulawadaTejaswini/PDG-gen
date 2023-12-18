
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		new Main().run();
	}

	private void run() throws IOException {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			int n = scanner.nextInt();
			if (n == 0)
				break;
			Pair[] pairs = new Pair[n];
			for (int i = 0; i < n; i++) {
				int a = scanner.nextInt();
				int b = scanner.nextInt();
				pairs[i] = new Pair(a, b);
			}
			Arrays.sort(pairs);
			String ans = "Yes";
			int sum = 0;
			for (int i = 0; i < n; i++) {
				sum += pairs[i].a;
				if (sum > pairs[i].b) {
					ans = "No";
					break;
				}
			}
			System.out.println(ans);
		}
	}

	class Pair implements Comparable<Pair> {
		int a, b;

		public Pair(int a, int b) {
			super();
			this.a = a;
			this.b = b;
		}

		@Override
		public int compareTo(Pair o) {
			return b - o.b;
		}

	}
}