import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int c = sc.nextInt();
		int[] b = new int[m];
		int[][] a = new int[n][m];
		for (int i = 0; i < m; i++) {
			b[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			for (int i2 = 0; i2 < m; i2++) {
				a[i][i2] = sc.nextInt();
			}
		}
		Solver s = new Solver(b, c);
		int ans = 0;
		for (int[] ai : a) {
			if (s.canSolve(ai)) {
				ans++;
			}
		}
		System.out.println(ans);
	}
	
}

class Solver {
	int[] b;
	int c;
	public Solver(int[] b, int c) {
		this.b = b;
		this.c = c;
	}
	boolean canSolve(int... a) {
		int value = c;
		for (int i = 0; i < b.length; i++) {
			value += a[i] * b[i];
		}
		return value > 0;
	}
}
