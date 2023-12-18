import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n, m;
		while ((n = in.nextInt()) != 0 & (m = in.nextInt()) != 0) {
			int counter = 0;
			int[] array = new int[n];
			int maxw = 0;
			int[] nn = new int[n];
			for (int i = 0; i < n; i++) {
				nn[i] = in.nextInt();
				maxw += nn[i];
			}

			int[] hs = new int[maxw + 1];
			for (int i1 = 0; i1 < n; i1++) {
				int val1 = nn[i1];
				maxw += val1;
				int j1 = 0;
				int v1 = val1;
				do {
					hs[v1]++;
					v1 = val1 + array[j1];
					array[j1] = v1;
				} while (j1++ < i1);
			}
			array = new int[m];
			for (int i = 0; i < m; i++) {
				int val = in.nextInt();
				int j = 0;
				int v = val;
				do {
					v = val + array[j];
					array[j] = v;
					if (v < maxw)
						counter += hs[v];
				} while (j++ < i);
			}
			System.out.println(counter);
		}

	}
}