
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		new Main().run();
	}

	private void run() throws IOException {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			P = scanner.nextInt();
			Q = scanner.nextInt();
			A = scanner.nextInt();
			N = scanner.nextInt();
			if ((P | Q | A | N) == 0)
				break;
			System.out.println(dfs(P, Q, 0, 1, 1));

		}
	}

	private int dfs(int p, int q, int depth, int r, int prd) {
		if (p == 0)
			return 1;
		int ans = 0;
		for (int i = r; i * prd <= A; i++) {
			if ((N - depth) * q < i * p)
				break;
			if (i * p < q)
				continue;
			ans += dfs(i * p - q, i * q, depth + 1, i, prd * i);
		}
		return ans;
	}

	int P, Q, A, N;
}