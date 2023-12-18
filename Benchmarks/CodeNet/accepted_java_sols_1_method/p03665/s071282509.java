import java.util.Scanner;

/**
 * 大岩達典 J4-170821<br>
 * A-Biscuits<br>
 * https://beta.atcoder.jp/contests/agc017/tasks/agc017_a
 * <br>
 * 教壇から見て左中央<br>
 * <br>
 */
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		final int n = scanner.nextInt();
		final int p = scanner.nextInt();
		int odd = 0;
		for (int i = 0; i < n; i++) {
			int tmp = scanner.nextInt();
			if (tmp % 2 == 1) odd++;
		}
		scanner.close();
		
		long result;
		if (odd == 0) {
			if (p == 0) result = (long)Math.pow(2, n);
			else result = 0;
		} else {
			result = (long)Math.pow(2, n-1);
		}
		
		System.out.println(result);
	}
	
}
