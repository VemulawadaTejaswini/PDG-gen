import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		long[][] cake = new long[n][3];
		for (int i = 0; i < n; i++) {
			cake[i][0] = sc.nextLong();
			cake[i][1] = sc.nextLong();
			cake[i][2] = sc.nextLong();
		}

		long answer = 0;
		long[] c = new long[n];
		for (int i = 0; i < 8; i++) {

			for (int j = 0; j < n; j++) {
				long x = 0;
				if ((i & 1) == 1) {
					x += cake[j][0];
				} else {
					x += -cake[j][0];
				}

				if (((i >> 1) & 1) == 1) {
					x += cake[j][1];
				} else {
					x += -cake[j][1];
				}

				if (((i >> 2) & 1) == 1) {
					x += cake[j][2];
				} else {
					x += -cake[j][2];
				}
				c[j] = x;
			}

			Arrays.sort(c);
			long t = 0;
			for (int j = 0; j < m; j++) {
				t += c[n - 1 - j];
			}

			answer = Math.max(answer, t);
		}

		System.out.println(answer);
	}
}
