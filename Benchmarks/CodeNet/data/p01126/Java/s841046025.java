import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n, m, a;
		while ((n = in.nextInt()) != 0) {
			m = in.nextInt();
			a = in.nextInt();
			int max = 0;
			int[][] amida = new int[1000][n + 1];
			for (int i = 0; i < m; i++) {
				int h = in.nextInt() - 1;
				int p = in.nextInt();
				int q = in.nextInt();
				amida[h][p] = q;
				amida[h][q] = p;
				max = Math.max(h, max);
			}
			for (int h = max; h >= 0; h--) {
				if (amida[h][a] != 0) {
					a = amida[h][a];
				}
			}
			System.out.println(a);
		}
		in.close();
	}

}