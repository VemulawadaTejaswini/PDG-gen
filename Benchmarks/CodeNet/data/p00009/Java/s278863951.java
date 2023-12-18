import java.util.*;

public class Main {

	/**
	 * @param args
	 */


	static boolean[] matrix = new boolean[1000000];  //素数がfalse
	static{
		for (int i = 2; i <= 999999; i++) {
			if (matrix[i])
				continue;
			for (int j = 2; i*j <= 999999; j++) {
				matrix[i*j] = true;
			}
		}
	}

	private static int solve(int n) {
		int cnt = 0;

		for (int i = 2; i <= n; i++) {
			if (!matrix[i])
				cnt++;
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