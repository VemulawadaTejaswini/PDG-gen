
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().run();
	}

	private void run() {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			int n = scanner.nextInt();
			int m = scanner.nextInt();
			if ((n | m) == 0)
				break;
			double[][] map = new double[n][n];
			int[] maxmap = new int[n];
			for (int i = 0; i < n; i++) {
				double max = Integer.MIN_VALUE;
				int index = -1;
				for (int j = 0; j < n; j++) {
					double a = scanner.nextDouble();
					map[i][j] = a;
					if (max < a) {
						max = a;
						index = j;
					}
				}
				maxmap[i] = index;
			}
			double maxv = 0;
			for (int i = 0; i < n; i++) {
				double a = slove(i, m, map, maxmap);
				maxv = Math.max(maxv, a);
			}
			System.out.println(String.format("%.2f", maxv));
		}
	}

	private double slove(int s, int m, double[][] map, int[] maxmap) {
		double k = 1;
		int g = 1;
		while (g < m) {
			k *= map[s][maxmap[s]];
			s = maxmap[s];
			g++;
		}
		return k;
	}
}