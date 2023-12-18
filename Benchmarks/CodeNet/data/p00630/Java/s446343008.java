import java.util.Scanner;

public class Main {
	private static final int UP = 'A' - 'a';
	private static final int LOW = -UP;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		char s[];
		char targetType;
		StringBuilder sb = new StringBuilder(100);
		while (in.hasNext()) {
			s = in.next().toCharArray();
			sb.setLength(0);
			targetType = in.next().charAt(0);
			if (targetType == 'X') {
				break;
			}
			if (targetType == 'U') {
				if (!isUpper(s[0])) {
					s[0] += UP;
				}
			} else {
				if (isUpper(s[0])) {
					s[0] += LOW;
				}
			}
			sb.append(s[0]);
			for (int i = 1; i < s.length; i++) {
				if (s[i] == '_') {
					s[i + 1] += UP;
				} else {
					sb.append(s[i]);
				}
			}
			System.out.println(sb.toString());
		}
	}

	private static boolean isUpper(final char charAt) {
		return 'A' <= charAt && charAt <= 'Z';
	}
}