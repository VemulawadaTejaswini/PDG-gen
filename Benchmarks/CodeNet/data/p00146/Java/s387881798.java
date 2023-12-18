
import java.util.Scanner;

public class Main {
	static int n;
	static double min = Double.MAX_VALUE;
	static String ans = "";

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		int[] id = new int[n];
		int[] k = new int[n];
		int[] v = new int[n];
		for (int i = 0; i < n; i++) {
			id[i] = scanner.nextInt();
			k[i] = scanner.nextInt();
			v[i] = scanner.nextInt();
		}
		slove(0, 0, 0, 0, id, k, v, 0, "");
		for (int i = 0; i < ans.length(); i++) {
			int x = ans.charAt(i) - '0';
			System.out.print(id[x]);
			System.out.print(i == ans.length() - 1 ? "\n" : " ");
		}
	}

	static void slove(int m, int w, int bit, int a, int[] id, int[] k, int[] v,
			double time, String str) {
		if (time > min) {
			return;
		}
		if (a == n) {
			if (min > time) {
				min = time;
				ans = str;
			}
			return;
		}
		w += a == 0 ? 0 : v[m] * 20;
		for (int i = 0; i < n; i++) {
			if (((bit >> i) & 1) == 0) {
				double dis = Math.abs(k[i] - k[m]);
				double t = dis * (70 + w) / 2000;

				slove(i, w, bit | (1 << i), a + 1, id, k, v, time + t, str + i);
			}
		}
	}
}