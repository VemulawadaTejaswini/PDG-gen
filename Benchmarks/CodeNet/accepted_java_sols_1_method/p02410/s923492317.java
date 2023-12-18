import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		int lineA[][] = new int[n][m];
		int lineB[] = new int[m];
		int c[] = new int[n];

		// a???????????????????¨????
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				lineA[i][j] = sc.nextInt();
			}
		}
		// b????´??????????????¨????
		for (int i = 0; i < m; i++) {
			lineB[i] = sc.nextInt();
		}

		// ????¨?
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				c[i] += lineA[i][j] * lineB[j];
			}
		}

		// ??????
		for (int i = 0; i < n; i++) {
			System.out.println(c[i]);
		}
	}

}