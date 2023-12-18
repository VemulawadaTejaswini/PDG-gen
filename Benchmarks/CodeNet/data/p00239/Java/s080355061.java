
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		new Main().run();
	}

	private void run() {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			int n = scanner.nextInt();
			if (n == 0)
				break;
			int[][] kasi = new int[n][5];
			for (int i = 0; i < n; i++) {
				int id = scanner.nextInt();
				int p = scanner.nextInt();
				int q = scanner.nextInt();
				int r = scanner.nextInt();
				kasi[i][0] = id;
				kasi[i][1] = p;
				kasi[i][2] = q;
				kasi[i][3] = r;
				kasi[i][4] = p * 4 + q * 9 + r * 4;
			}
			int P = scanner.nextInt();
			int Q = scanner.nextInt();
			int R = scanner.nextInt();
			int C = scanner.nextInt();
			boolean flag = true;
			for (int i = 0; i < n; i++) {
				if (kasi[i][1] <= P && kasi[i][2] <= Q && kasi[i][3] <= R
						&& kasi[i][4] <= C) {
					System.out.println(kasi[i][0]);
					flag = false;
				}
			}
			if (flag)
				System.out.println("NA");
		}
	}
}