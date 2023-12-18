import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int N = sc.nextInt();
		final int M = sc.nextInt();
		final int X = sc.nextInt();
		final int Y = sc.nextInt();
		int[] x = new int[N+1];
		int[] y = new int[M+1];
		int max_x = X;
		for (int i = 0; i < N; i++) {
			x[i] = sc.nextInt();
			max_x = Math.max(max_x, x[i]);
		}
		int min_y = Y;
		for (int i = 0; i < M; i++) {
			y[i] = sc.nextInt();
			min_y = Math.min(min_y, y[i]);
		}
		if (max_x < min_y) {
			System.out.println("No War");
		} else {
			System.out.println("War");
		}
	}
}