import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String S = in.next();
		StringBuilder sb = new StringBuilder(S);
		int ans = 0;
		for (int i = sb.length() - 2; i >= 0; i--) {
			if (i + 1 < sb.length() && sb.charAt(i) != sb.charAt(i + 1)) {
				sb.delete(i, i + 2);
				ans += 2;
			}
		}
		System.out.println(ans);
		in.close();
	}
}