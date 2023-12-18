import java.util.*;

public class Main {

	static Scanner sc = new Scanner(System.in);

	static int S, T;

	static void dfs(int sum, int[] a, int[] b) {
		if (a.length == 0) {
			if (sum >= 0)
				S++;
			T++;
			return;
		}
		int[] na = new int[a.length - 1];
		for (int i = 0; i < a.length - 1; i++)
			na[i] = a[i + 1];
		for (int i = 0; i < b.length; i++) {
			int[] nb = new int[b.length - 1];
			int p = 0;
			for (int k = 0; k < b.length; k++) {
				if (i == k)
					continue;
				nb[p] = b[k];
				p++;
			}
			int win = a[0] > b[i] ? a[0] + b[i] : -(a[0] + b[i]);
			dfs(sum + win, na, nb);
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	public void run() {
		int dataSet = sc.nextInt();
		for (int n = 0; n < dataSet; n++) {
			int[] g = new int[9];
			int[] j = new int[9];
			for (int i = 0; i < 9; i++)
				g[i] = sc.nextInt();
			for (int i = 0; i < 9; i++)
				j[i] = sc.nextInt();
			S = 0;
			T = 0;
			dfs(0, g, j);
			double p = (double) S / (double) 362880;
			System.out.printf("%.5f %.5f", p, (1.0 - p));
			System.out.println();
		}
	}
}