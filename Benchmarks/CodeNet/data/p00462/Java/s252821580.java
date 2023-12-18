import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		while (true) {
			int D = sc.nextInt();
			if (D == 0) break;
			int N = sc.nextInt();
			int M = sc.nextInt();
			int[] p = new int[N + 1];
			for (int i = 0; i < N - 1; ++i) {
				p[i] = sc.nextInt();
			}
			p[N] = D;
			Arrays.sort(p);
			int ans = 0;
			for (int i = 0; i < M; ++i) {
				int k = sc.nextInt();
				int pos = Arrays.binarySearch(p, k);
				if (pos < 0) {
					pos = -pos - 2;
					int d = Math.min(k - p[pos], p[pos + 1] - k);
					ans += d;
				}
			}
			System.out.println(ans);
		}
	}
}