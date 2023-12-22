import java.util.Scanner;

/**
 * https://atcoder.jp/contests/abc157/tasks/abc157_a
 *
 */
public final class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int n = scanner.nextInt();
			int ans = n / 2 + (n % 2);
			System.out.println(ans);
		}
	}

}
