
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
	public static void main(final String[] args) {
		@SuppressWarnings("resource")
		final Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		final int N = in.nextInt();
		final int K = in.nextInt();
		final String S = in.next();
		String R = solve(S, K);
		System.out.println(R);
	}

	public static boolean isPossibleMonth(String m) {
		final int val = Integer.parseInt(m);
		return val <= 12 && val >= 1;
	}

	static String solve(final String S, final int K) {
		final char[] chars = S.toCharArray();
		chars[K - 1] = (char) (chars[K - 1] - 'A' + 'a');
		return new String(chars);
	}
}
