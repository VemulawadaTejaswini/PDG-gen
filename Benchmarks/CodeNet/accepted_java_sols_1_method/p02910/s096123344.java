import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

	/** 奇数文字の一覧 */
	private static final List<Character> EVEN_LIST = Arrays.asList('R', 'U', 'D');
	/** 偶数文字の一覧 */
	private static final List<Character> ODD_LIST = Arrays.asList('L', 'U', 'D');

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			char[] s = scanner.next().toCharArray();
			boolean result = true;
			for (int i = 0; i < s.length; i++) {
				if (1 == (i & 1)) {
					// 0-indexのため、偶数文字
					if (!ODD_LIST.contains(s[i])) {
						result = false;
						break;
					}
				} else {
					if (!EVEN_LIST.contains(s[i])) {
						result = false;
						break;
					}
				}
			}
			System.out.println(result ? "Yes" : "No");
		}
	}
}
