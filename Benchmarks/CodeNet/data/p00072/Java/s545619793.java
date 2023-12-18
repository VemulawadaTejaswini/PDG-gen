import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in).useDelimiter("[^0-9]+");
		while (true) {
			int n = sc.nextInt();
			if (n == 0)
				break;
			int m = sc.nextInt();
			int[][] e = new int[m][3];
			for (int i = 0; i < m; i++) {
				e[i][0] = sc.nextInt();
				e[i][1] = sc.nextInt();
				e[i][2] = sc.nextInt() / 100 - 1;
			}
			Arrays.sort(e, new Comparator<int[]>() {
				public int compare(int[] a, int[] b) {
					return a[2] - b[2];
				}
			});
			boolean[] b = new boolean[n];
			Arrays.fill(b, false);
			int w = 0;
			for (int i = 0; i < m; i++) {
				if (b[e[i][0]] && b[e[i][1]])
					continue;
				b[e[i][0]] = b[e[i][1]] = true;
				w += e[i][2];
			}
			System.out.println(w);
		}
	}
}