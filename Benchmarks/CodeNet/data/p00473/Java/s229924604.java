import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static int N;
	static int[] c;
	static int ans = Integer.MAX_VALUE;

	public static void main(String[] args) {
		N = sc.nextInt();
		c = new int[N];
		for (int i = 0; i < N - 1; ++i) {
			c[i] = sc.nextInt();
		}
		rec(0, 0, 0);
		System.out.println(ans);
	}

	static void rec(int pos, int len, int cost) {
		if (len == N / 2) {
			ans = Math.min(ans, cost);
			return;
		}
		if (cost >= ans) return;
		for (int i = N / 2 - len; i > 0; --i) {
			rec(pos + i, pos - len, cost + c[pos + i - 1]);
		}
	}

}