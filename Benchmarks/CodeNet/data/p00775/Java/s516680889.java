import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int r = sc.nextInt();
			if (r == 0) {
				sc.close();
				break;
			}

			int n = sc.nextInt();

			int[] xl = new int[n];
			int[] xr = new int[n];
			int[] h = new int[n];
			for (int i = 0; i < n; i++) {
				xl[i] = sc.nextInt();
				xr[i] = sc.nextInt();
				h[i] = sc.nextInt();
			}

			int[] cover = new int[2 * r];
			for (int i = 0; i < n; i++) {
				int ll = Math.max(0, xl[i] + r);
				int rr = Math.min(r * 2, Math.max(0, xr[i] + r));

				for (int j = ll; j < rr; j++) {
					cover[j] = Math.max(cover[j], h[i]);
				}
			}

			double res = 100000.0;
			for (int i = 0; i < cover.length; i++) {
				int xx = i - r > 0 ? i - r + 1 : r - i - 1;
				double t1 = cover[i]
						+ r
						* (1 - Math
								.sin(Math.acos((double) Math.abs(r - i) / r)));
				double t2 = cover[i] + r
						* (1 - Math.sin(Math.acos((double) xx / r)));
				res = Math.min(res, Math.min(t1, t2));
			}

			System.out.println(String.format("%.4f", res));
		}
	}
}