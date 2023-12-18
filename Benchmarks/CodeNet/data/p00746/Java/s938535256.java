import java.util.Scanner;

public class Main {
	void run() {
		Scanner sc = new Scanner(System.in);

		while (true) {
			int n = sc.nextInt();
			if (n == 0) {
				break;
			}

			int[] x = new int[n];
			int[] y = new int[n];
			x[0] = y[0] = 0;

			/*
			 * テ・ツキツヲテ・ツ?エ(= 0)テッツシツ古、ツクツ凝・ツ?エ (= 1)テッツシツ古・ツ渉ウテ・ツ?エ (= 2)テッツシツ古、ツクツ甘・ツ?エ (= 3)
			 */
			int l, r, t, b;
			l = r = t = b = 0;

			for (int i = 1; i < n; i++) {
				int p = sc.nextInt();
				int q = sc.nextInt();

				x[i] = x[p];
				y[i] = y[p];

				if (q == 0) x[i]--;
				if (q == 1) y[i]--;
				if (q == 2) x[i]++;
				if (q == 3) y[i]++;
				l = Math.min(l, x[i]);
				r = Math.max(r, x[i]);
				t = Math.max(t, y[i]);
				b = Math.min(b, y[i]);
			}

			System.out.println((r - l + 1) + " " + (t - b + 1));
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}
}