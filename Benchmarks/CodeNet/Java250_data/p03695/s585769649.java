import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int N = sc.nextInt();
		int[] a = nextIntArray(sc, N);

		sc.close();

		int[] colors = new int[8];
		int oth = 0;

		for (int i = 0; i < N; i++) {
			if (a[i] <= 399) {
				colors[0]++;
			} else if (a[i] <= 799) {
				colors[1]++;
			} else if (a[i] <= 1199) {
				colors[2]++;
			} else if (a[i] <= 1599) {
				colors[3]++;
			} else if (a[i] <= 1999) {
				colors[4]++;
			} else if (a[i] <= 2399) {
				colors[5]++;
			} else if (a[i] <= 2799) {
				colors[6]++;
			} else if (a[i] <= 3199) {
				colors[7]++;
			} else {
				oth++;
			}
		}

		int cnt = 0;
		for (int i = 0; i < 8; i++) {
			if (colors[i] != 0) {
				cnt++;
			}
		}

		int ansMin, ansMax;
		if (cnt == 0) {
			ansMin = 1;
		} else {
			ansMin = cnt;
		}

		ansMax = cnt + oth;

		out.print(ansMin);
		out.print(" ");
		out.println(ansMax);

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}

	@SuppressWarnings("unused")
	private int[] nextIntArray(Scanner sc, int n) {
		int[] result = new int[n];
		for (int i = 0; i < n; i++) {
			result[i] = sc.nextInt();
		}
		return result;
	}

	@SuppressWarnings("unused")
	private int[] nextIntArray1origin(Scanner sc, int n) {
		int[] result = new int[n + 1];
		for (int i = 1; i <= n; i++) {
			result[i] = sc.nextInt();
		}
		return result;
	}
}
