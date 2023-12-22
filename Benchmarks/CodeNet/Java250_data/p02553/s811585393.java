import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			long a = scanner.nextLong(), b = scanner.nextLong(), c = scanner.nextLong(), d = scanner.nextLong();
			System.out.println(max(a * c, a * d, b * c, b * d));
		}
	}

	/**
	 * 配列の最大値を計算する
	 * 
	 * @param a 配列
	 * @return 配列の最大値
	 */
	private static long max(long... a) {
		return Arrays.stream(a).max().getAsLong();
	}
}
