import java.util.Scanner;

public class Main {
	static int n;
	static int[] ps;

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		while (true) {
			n = sc.nextInt();
			if (n == 0)
				break;
			ps = new int[n];
			for (int i = 0; i < n; i++) {
				ps[i] = sc.nextInt();
			}
			System.out.println(solve(0, 0, 0));
		}
	}

	public static int solve(int k, int a, int b) {
		if (k == n) {
			return Math.abs(a - b);
		}
		return Math.min(solve(k + 1, a, b + ps[k]), solve(k + 1, a + ps[k], b));
	}
}