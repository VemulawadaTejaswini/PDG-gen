import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		int N = sc.nextInt();
		for (int i = 0; i < N; ++i) {
			int Y = sc.nextInt();
			int M = sc.nextInt();
			int D = sc.nextInt();
			int ans = dm(Y, M) - D + 1;
			for (int j = M + 1; j <= 10; ++j) {
				ans += dm(Y, j);
			}
			for (int j = Y + 1; j < 1000; ++j) {
				for (int k = 1; k <= 10; ++k) {
					ans += dm(j, k);
				}
			}
			System.out.println(ans);
		}
	}

	static int dm(int y, int m) {
		if (y % 3 == 0) return 20;
		return m % 2 == 0 ? 19 : 20;
	}

}