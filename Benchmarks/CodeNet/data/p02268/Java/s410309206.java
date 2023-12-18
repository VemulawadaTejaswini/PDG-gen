import java.util.Scanner;

public class Main {

	public static int n;
	public static int[] S;
	public static int q;
	public static int[] T;

	public static void main(String[] args) {

		int t = 0;
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		S = new int[n];
		for (int i = 0; i < n; i++) {
			S[i] = sc.nextInt();
		}
		q = sc.nextInt();
		T = new int[q];
		for (int i = 0; i < q; i++) {
			T[i] = sc.nextInt();
		}

		for (int i = 0; i < q; i++) {
			if (binarySearch(T[i])) {
				t++;
			}
		}
		System.out.println(t);
	}

	public static boolean binarySearch(int x) {
		int l = 0;
		int r = n - 1;
		while (true) {
			if (l < r) {
				int m = (l + r) / 2;
				if (S[m] < x) {
					l = m + 1;
				} else {
					r = m;
				}
			} else {
				break;
			}
		}
		if (S[l] == x) {
			return true;
		} else {
			return false;
		}
	}

}
