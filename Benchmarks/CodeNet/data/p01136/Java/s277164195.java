
import java.io.IOException;
import java.util.BitSet;
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
			boolean[][] map = new boolean[n][31];
			for (int i = 0; i < n; i++) {
				int f = scanner.nextInt();
				while (f-- > 0)
					map[i][scanner.nextInt()] = true;
			}
			int ans = -1;
			BitSet[] bit = new BitSet[n];
			for (int i = 0; i < n; i++) {
				bit[i] = new BitSet();
				bit[i].set(i);
			}
			for (int t = 1; t <= 30; t++) {
				BitSet tmp = new BitSet();
				for (int i = 0; i < n; i++)
					if (map[i][t])
						tmp.or(bit[i]);
				for (int i = 0; i < n; i++)
					if (map[i][t])
						bit[i].or(tmp);

				if (tmp.cardinality() == n) {
					ans = t;
					break;
				}
			}
			System.out.println(ans);
		}
	}
}