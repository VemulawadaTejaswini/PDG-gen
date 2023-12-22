import java.util.Scanner;

/**
 * https://atcoder.jp/contests/abc146/tasks/abc146_b
 *
 */
public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		String s = scanner.next();

		System.out.println(rotN(n, s));
	}

	private static String rotN(int n, String s) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			sb.append(rot(n, s.charAt(i)));
		}
		return sb.toString();
	}

	private static char rot(int n, char ch) {
		int code = (int) ch - 'A';
		return (char) (((code + n) % 26) + 'A');
	}

}
