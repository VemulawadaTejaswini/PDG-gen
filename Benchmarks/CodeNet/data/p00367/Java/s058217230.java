import java.util.Scanner;

/**
 * Three Meals
 */
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int[][] ahb = new int[3][1441];

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < 3; j++) {
				int sth, stm, eth, etm;
				sth = sc.nextInt();
				stm = sc.nextInt();
				eth = sc.nextInt();
				etm = sc.nextInt();
				ahb[j][sth * 60 + stm]++;
				ahb[j][eth * 60 + etm + 1]--;
			}
		}

		int ans = 50;

		for (int i = 0; i < 3; i++) {
			int _ans = 0;
			for (int j = 1; j <= 1440; j++) {
				ahb[i][j] += ahb[i][j - 1];
				_ans = Math.max(_ans, ahb[i][j]);
			}
			ans = Math.min(ans, _ans);
		}

		System.out.println(ans);
	}
}
