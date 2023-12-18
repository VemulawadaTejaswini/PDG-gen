
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		new Main().run();
	}

	private void run() throws IOException {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			m = scanner.nextInt();
			n = scanner.nextInt();
			if ((m | n) == 0)
				break;
			M = new HashMap<Integer, Integer>();
			h = 1;
			a = new int[n][m];
			Y = new int[24];
			X = new int[24];
			for (int i = 0; i < n; i++)
				for (int j = 0; j < m; j++) {
					int t = scanner.nextInt();
					if (t == 0) {
						a[i][j] = -1;
					} else if (t == 1) {
						Y[h] = i;
						X[h] = j;
						a[i][j] = h++;
					} else {
						Y[0] = i;
						X[0] = j;
						a[i][j] = 0;
					}
				}
			System.out.println(slove(0, 1));
		}
	}

	private int slove(int cur, int bit) {
		int k = cur << 24 | bit;
		if (M.containsKey(k))
			return M.get(k);
		int res = 0;
		for (int[] mo : move) {
			int y = Y[cur];
			int x = X[cur];
			while (true) {
				y += mo[0];
				x += mo[1];
				if (!isOK(y, x))
					break;
				if (a[y][x] == 0)
					if (Integer.bitCount(bit)==h){
						res++;
						break;
					}
				if (a[y][x] >= 1) {
					if ((bit >> a[y][x] & 1) == 1)
						continue;
					res += slove(a[y][x], bit | 1 << a[y][x]);
					break;
				}
			}
		}
		M.put(cur << 24 | bit, res);
		return res;
	}

	private boolean isOK(int y, int x) {
		if (0 <= y && y < n && 0 <= x && x < m)
			return true;
		return false;
	}

	int m, n, h;
	int[] Y, X;
	int[][] a;
	int[][] move = { { -1, 0 }, { 0, -1 }, { 0, 1 }, { 1, 0 } };
	Map<Integer, Integer> M;
}