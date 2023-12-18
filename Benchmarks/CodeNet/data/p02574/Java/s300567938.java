import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
			}
			boolean pairwise = true;
			boolean setwise = false;
			int tmpgcd = a[0];
			for (int i = 1; i < n; i++) {
				if (!setwise) {
					tmpgcd = gcd(tmpgcd, a[i]);
					if (tmpgcd == 1) {
						setwise = true;
					}
				}
				if (pairwise) {
					for (int j = 0; j < i; j++) {
						if (gcd(a[i], a[j]) != 1) {
							pairwise = false;
							break;
						}
					}
				}
			}
			if (pairwise) {
				System.out.println("pairwise coprime");
			} else {
				if (setwise) {
					System.out.println("setwise coprime");
				} else {
					System.out.println("not coprime");
				}
			}
		}
	}

	public static int gcd(int a, int b) {
		if (b == 0) {
			return a;
		} else {
			return gcd(b, a % b);
		}
	}
}