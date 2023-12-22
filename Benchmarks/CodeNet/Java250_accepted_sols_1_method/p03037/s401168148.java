import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// ここにコードを挿入
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int t = 0;
		int L = 0, R = N;
		if (M == 1) {
			int c = sc.nextInt();
			int d = sc.nextInt();
			t = d - c + 1;
		} else {
			for (int i = 0; i < M; i++) {
				int a = sc.nextInt();
				int b = sc.nextInt();
				if (L <= a && b <= R) {
					L = a;
					R = b;
					t = R - L + 1;
				} else if (a <= L && R <= b) {
					t = R - L + 1;
				} else if ((L <= a && a <= R) && R < b) {
					L = a;
					t = R - L + 1;
				} else if ((L <= b && b <= R) && a < L) {
					R = b;
				} else if (b < L || R < a) {
					t = 0;
					break;
				} else {
					L = a;
					R = b;
				}

			}
		}
		System.out.println(t);
	}

}