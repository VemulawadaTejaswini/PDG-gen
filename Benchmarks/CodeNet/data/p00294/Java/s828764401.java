import java.util.Arrays;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int N = stdIn.nextInt();
		int M = stdIn.nextInt();
		int p = stdIn.nextInt();
		int d[] = new int[M];
		for (int i = 0; i < M; i++) {
			int a = stdIn.nextInt();
			d[i] = (a - p + N) % N;
		}
		Arrays.sort(d);
		int b = 0;
		if (N - d[0] < d[M - 1]) {
			b = N - d[0];
		} else {
			b = d[M - 1];
		}
		for (int i = 0; i < M; i++) {
			if (i > 0) {
				int a = 2 * (N - d[i]) + d[i - 1];
				if (a < b) {
					b = a;
				}
				if (i < M - 1) {
					int c = 2 * d[i] + N - d[i + 1];
					if (c < b) {
						b = c;
					}
				}
			}
		}
		System.out.println(b * 100);
	}
}