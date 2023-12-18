import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	Scanner sc = new Scanner(System.in);

	void run() {
		for (;;) {
			int n = sc.nextInt();
			if (n == 0)
				break;
			int[] hs = new int[n + 1];
			int[] ds = new int[n];
			for (int i = 0; i <= n; i++) {
				hs[i] = sc.nextInt();
			}

			for (int i = 0; i < n; i++) {

				ds[i] = hs[i + 1] - hs[i];
			}
			int d = 0;
			if (ds[0] == ds[3])
				d = ds[0];
			else if (ds[0] == ds[1])
				d = ds[0];
			else if (ds[1] == ds[2])
				d = ds[1];
			else if (ds[2] == ds[3])
				d = ds[2];
			else if (ds[1] == ds[3])
				d = ds[1];
			for (int i = 0; i < n-1; i++) {
				if (ds[i] != d && ds[i + 1] != d) {
					System.out.println(hs[i + 1]);
					break;
				}
			}
			if (ds[0] != d)
				System.out.println(hs[0]);
			if (ds[n - 1] != d)
				System.out.println(hs[n]);
		}
	}

	public static void main(String[] args) {

		new Main().run();
	}
}