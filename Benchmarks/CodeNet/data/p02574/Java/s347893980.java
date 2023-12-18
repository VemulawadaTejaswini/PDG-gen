import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		int ones = 0, nonOnes = 0;
		for (int i = 0; i < n; i++) a[i] = sc.nextInt();
		for (int i = 0; i < n - 1; i += 3) {
			for (int j = i + 1; j < n; j++) {
				if (solve(a[i], a[j], i, j, a)) ones++;
				else nonOnes++;
			}
		}
		if (ones > 0 && nonOnes == 0) System.out.println("pairwise coprime");
		else if (ones > 0 && nonOnes > 0) System.out.println("setwise coprime");
		else if (ones == 0 && nonOnes > 0) System.out.println("not coprime");
	}

	private static boolean solve(int x, int y, int i, int j, int a[]) {
		// TODO Auto-generated method stub
		int r =gcd(x, y);
		if (r == 1) return true;
		a[i] = r;
		a[j] = r;
		return false;
	}

	private static int gcd(int a, int b) {
		// TODO Auto-generated method stub
		return b == 0 ? a : gcd(b, a % b);
	}

}
