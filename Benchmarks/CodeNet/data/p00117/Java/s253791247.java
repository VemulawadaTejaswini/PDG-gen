
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	static int min;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int[][] num = new int[n + 1][n + 1];

		for (int i = 0; i < m; i++) {
			StringTokenizer tokenizer = new StringTokenizer(scanner.next(), ",");
			int a = Integer.parseInt(tokenizer.nextToken());
			int b = Integer.parseInt(tokenizer.nextToken());
			int c = Integer.parseInt(tokenizer.nextToken());
			int d = Integer.parseInt(tokenizer.nextToken());
			num[a][b] = c;
			num[b][a] = d;
		}
		StringTokenizer tokenizer = new StringTokenizer(scanner.next(), ",");
		int a = Integer.parseInt(tokenizer.nextToken());
		int b = Integer.parseInt(tokenizer.nextToken());
		int c = Integer.parseInt(tokenizer.nextToken());
		int d = Integer.parseInt(tokenizer.nextToken());
		min = Integer.MAX_VALUE;
		int q = c-d;
		getYen(a, 0, b, num, n, 0, a);
		q-=min;
		min = Integer.MAX_VALUE;
		getYen(b, 0, a, num, n, 0, b);
		q-=min;
		System.out.println(q);
	}

	public static void getYen(int a, int x, int b, int[][] num, int n, int yen,
			int g) {
		if (a == b) {
			min = Math.min(min, yen);
			return;
		}
		if (a == g && yen != 0 || yen > min) {
			return;
		}
		for (int i = 1; i <= n; i++) {
			if (num[a][i] != 0 && i != x) {
				getYen(i, a, b, num, n, yen + num[a][i], g);
			}
		}

	}
}