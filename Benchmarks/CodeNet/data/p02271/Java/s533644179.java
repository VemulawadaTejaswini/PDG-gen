import java.util.Scanner;

public class Main{
	static Scanner sc = new Scanner(System.in);

	static int n = Integer.parseInt(sc.next());

	static int[] a = new int[n];

	public static void main(String[] args) {

		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(sc.next());
		}

		int q = Integer.parseInt(sc.next());
		for (int i = 0; i < q; i++) {
			int b = Integer.parseInt(sc.next());
			if (solve(0, b)) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}
		}

	}

	private static boolean solve(int i, int sum) {
		if (sum == 0)
			return true;
		if (i >= n)
			return false;
		return (solve(i + 1, sum) || solve(i + 1, sum - a[i]));

	}
}