import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

	static int n, A[];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		A = new int[n];
		for (int i = 0; i < n; i++)
			A[i] = sc.nextInt();

		int q = sc.nextInt();
		for (int i = 0; i < q; i++) {
			int M = sc.nextInt();
			System.out.println(IntStream.range(0, n).anyMatch(t -> solve(t, M)) ? "yes" : "no");
		}

		sc.close();
	}

	static boolean solve(int p, int M) {
		if (M == 0)
			return true;
		if (p == n)
			return false;
		return solve(p + 1, M - A[p]) || solve(p + 1, M);
	}
}
