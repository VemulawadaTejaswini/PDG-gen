import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static int A, B, C;

	public static void main(String[] args) {
		while (true) {
			A = sc.nextInt();
			if (A == 0) break;
			B = sc.nextInt();
			C = sc.nextInt();
			int[] ans = solve();
			if (ans != null) {
				if (ans[0] < ans[2]) {
					swap(ans);
				} else if (ans[0] == ans[2] && ans[1] < ans[3]) {
					swap(ans);
				}
				System.out.println(ans[0] + " " + ans[1] + " " + ans[2] + " " + ans[3]);
			} else {
				System.out.println("Impossible");
			}
		}
	}

	static void swap(int[] ans) {
		int tmp = ans[0];
		ans[0] = ans[2];
		ans[2] = tmp;
		tmp = ans[1];
		ans[1] = ans[3];
		ans[3] = tmp;
	}

	static int[] solve() {
		int[] ret = new int[4];
		if (C == 0) {
			ret[0] = A;
			ret[1] = B;
			ret[2] = 1;
			return ret;
		}
		ArrayList<Integer> bp = new ArrayList<Integer>();
		for (int i = 1; i <= Math.abs(C); ++i) {
			if (C % i == 0) {
				bp.add(i);
				bp.add(-i);
			}
		}
		for (int i = 1; i <= A; ++i) {
			if (A % i != 0) continue;
			int p = i;
			int r = A / i;
			for (int q : bp) {
				int s = C / q;
				if (p * s + q * r == B) {
					ret[0] = p;
					ret[1] = q;
					ret[2] = r;
					ret[3] = s;
					return ret;
				}
			}
		}
		return null;
	}
}