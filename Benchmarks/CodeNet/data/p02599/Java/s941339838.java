import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * 解説通りに実装したソースコード
 */
public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int n = scanner.nextInt(), q = scanner.nextInt();
			short[][] c = new short[n + 1][n];
			IntStream.rangeClosed(1, n).forEach(i -> {
				System.arraycopy(c[i - 1], 0, c[i], 0, n);
				c[i][scanner.nextInt() - 1]++;
			});
//			print(c);
			IntStream.range(0, q).forEach(i -> {
				int l = scanner.nextInt(), r = scanner.nextInt();
				System.out.println(getResult(c, l, r));
			});
		}
	}

//	private static void print(short[][] c) {
//		for (int i = 0; i < c.length; i++) {
//			for (int j = 0; j < c[i].length; j++) {
//				System.out.print(c[i][j] + ",");
//			}
//			System.out.println();
//		}
//	}

	private static int getResult(short[][] c, int l, int r) {
		int count = 0;
		for (int i = 0; i < c[0].length; i++) {
			if (c[r][i] > c[l - 1][i]) {
				count++;
			}
		}
		return count;
	}
}
