import java.util.Scanner;

public class Main {
	
	private static int n;
	private static int[] A;

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		Scanner sc = new Scanner(System.in);

		n = Integer.parseInt(sc.nextLine());
		String[] a = (sc.nextLine()).split(" ");
		int[] X = new int[n];
		for (int i = 0; i < n; i++) {
			X[i] = Integer.parseInt(a[i]);
		}
		A = X;

		int q = Integer.parseInt(sc.nextLine());
		String[] m = (sc.nextLine()).split(" ");
		int[] M = new int[q];
		for (int i = 0; i < q; i++) {
			M[i] = Integer.parseInt(m[i]);
			if (solve(0,M[i])) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}
		}
	}

	public static boolean solve(int i, int m) {
		if (m == 0) {
			return true;
		} else if (i >= n) {
			return false;
		}
		return solve(i + 1, m) || solve(i + 1, m - A[i]);

	}

}