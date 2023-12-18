import java.util.*;

public class Main {

	/**
	 * @param args
	 */

	static int max=2;
	static boolean[] matrix = new boolean[99999];  //素数がfalse

	private static int solve(int n) {
		int cnt = 0;
		if (n < max) {
			for (int i = 2; i <= n; i++) {
				if (!matrix[i])
					cnt++;
			}
		} else {
			for (int i = 2; i <= n; i++) {
				if (matrix[i])
					continue;
				for (int j = i + 1; j <= n; j++) {
					if (!matrix[j] && j % i == 0)
						matrix[j] = true;
				}
				cnt++;
			}
			max = n + 1;
		}

		return cnt;
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);

		while(scan.hasNext()){
			System.out.println(solve(scan.nextInt()));
		}
	}

}