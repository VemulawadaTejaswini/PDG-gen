import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			int n = sc.nextInt();
			int[] r = new int[n];
			int S = sc.nextInt();

				if (n == 0 && S == 0) {
					break;
				}

				for (int i = 0; i < n; i++) {
					r[i] = sc.nextInt();
				}
			System.out.printf("%d\n", findComb(n ,S ,r));
		}

		sc.close();

	}

	private static int findComb(int n, int S, int[] r) {
		int cnt = 0;

			for (int i = 0; i < r.length - 1; i++) {
				for (int j = i + 1; j < r.length; j++) {
					if (r[i] + r[j] > S) {
						cnt++;
					}
				}
			}
		return cnt;
	}

}
