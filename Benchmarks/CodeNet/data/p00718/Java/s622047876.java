import java.util.Scanner;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
	private static int[] mcxi = {
	        1000, 100, 10, 1
	};
	private static char[] s = {
	        'm', 'c', 'x', 'i'
	};
	static Pattern pt = Pattern.compile("(([2-9]?)m)?(([2-9]?)c)?(([2-9]?)x)?((\\d?)i)?");
	static Matcher mc = pt.matcher("");

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			int sum = 0;
			for (int j = 0; j < 2; j++) {
				mc.reset(in.next()).matches();
				sum += val(mc);
			}
			sb.setLength(0);
			for (int j = 0; j < 4; j++) {
				int mn = sum / mcxi[j];
				sum %= mcxi[j];
				if (mn > 0) {
					if (mn > 1) {
						sb.append(mn);
					}
					sb.append(s[j]);
				}
			}
			System.out.println(sb);
		}
	}

	static int val(MatchResult mr) {
		int result = 0;
		for (int i = 0; i < 4; i++) {
			if (mr.group(i * 2 + 1) != null) {
				result += mcxi[i] * ((!mr.group(i * 2 + 2).isEmpty()) ? Integer.parseInt(mr.group(i * 2 + 2)) : 1);
			}
		}
		return result;
	}
}