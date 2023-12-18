import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		while (true) {
			int N = sc.nextInt();
			if (N == 0) break;
			int W = sc.nextInt();
			int[] hist = new int[11];
			for (int i = 0; i < N; ++i) {
				hist[sc.nextInt() / W]++;
			}
			int maxV = 0;
			int maxI = 0;
			for (int i = 0; i < 11; ++i) {
				maxV = Math.max(maxV, hist[i]);
				if (hist[i] > 0) maxI = i;
			}
			double ans = 0.01;
			for (int i = 0; i <= maxI; ++i) {
				ans += (1 - i * 1.0 / maxI) * hist[i] / maxV;
			}
			System.out.printf("%.9f\n", ans);
		}
	}
}