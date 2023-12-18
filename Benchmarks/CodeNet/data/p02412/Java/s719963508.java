import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int[] f_w = new int[2];
		Scanner sc = new Scanner(System.in);

		do {
			for (int i = 0; i < 2; i++) {
				f_w[i] = sc.nextInt();
			}

			if (f_w[0] == 0 && f_w[1] == 0) {
				break;
			} else {
				 System.out.println(findWays(f_w[0], f_w[1]));
			}
		}while(true);
		sc.close();


	}

	private static int findWays(int n, int x) {
		int cnt = 0;

		for (int i = 1; i <= n; i++) {
			for (int j = i + 1; j <= n; j++) {
				for (int k = j + 1; k <= n; k++) {

					if (i != j && j != k && k != i && i + j + k == x) {
							cnt++;
					}

				}
			}
		}

		return cnt;

	}

}

