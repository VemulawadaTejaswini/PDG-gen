import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * 解説どおりに作成したソースコード
 */
public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			char[] s = scanner.next().toCharArray();
			int n = s.length;
			System.out.println(IntStream.range(0, n - 1).filter(i -> s[i] != s[i + 1])
					.map(i -> Math.max(i + 1, n - i - 1)).min().orElse(n));
		}
	}
}
