
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().run();
	}

	int N = 8;
	int[] row = new int[N];
	boolean[] col = new boolean[N];
	boolean[] dpos = new boolean[2 * N - 1];
	boolean[] dneg = new boolean[2 * N - 1];

	boolean[][] map = new boolean[N][N];

	void initialize() {
		Arrays.fill(row, -1);
	}

	private void run() {
		Scanner scanner = new Scanner(System.in);
		initialize();
		int k = scanner.nextInt();
		for (int i = 0; i < k; i++) {
			int r = scanner.nextInt();
			int c = scanner.nextInt();
			row[r] = c;
			col[c] = dpos[r + c] = dneg[r - c + N - 1] = true;
		}
		recurisve(0);

	}

	private void recurisve(int i) {
		if (i == N) {
			printBoard();
			return;
		}
		if (row[i] != -1) {
			recurisve(i + 1);
		}
		for (int j = 0; j < N; j++) {
			if (col[j] || dpos[i + j] || dneg[i - j + N - 1] || row[i] != -1)
				continue;
			row[i] = j;
			col[j] = dpos[i + j] = dneg[i - j + N - 1] = true;
			recurisve(i + 1);
			row[i] = -1;
			col[j] = dpos[i + j] = dneg[i - j + N - 1] = false;
		}
	}

	private void printBoard() {
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print(row[i] == j ? "Q" : ".");
			}
			System.out.println();
		}
	}

}