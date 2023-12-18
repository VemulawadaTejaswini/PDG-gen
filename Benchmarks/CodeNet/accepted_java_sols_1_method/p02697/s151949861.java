import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * 解説通りに実装したソースコード
 */
public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			scanner.nextInt();
			int m = scanner.nextInt();
			int n = 2 * m + 1;
			int[][] a = new int[n / 2][2];
			int diff = 1 - (m & 1);
			IntStream.range(0, n / 4).forEach(i -> {
				a[i][0] = i + 1;
				a[i][1] = n / 2 - i + diff;
			});
			IntStream.range(n / 4, n / 2).forEach(i -> {
				a[i][0] = i + n / 4 + 2;
				a[i][1] = n - (i - n / 4);
			});
			IntStream.range(0, m).forEach(i -> System.out.println(a[i][0] + " " + a[i][1]));
		}
	}
}
