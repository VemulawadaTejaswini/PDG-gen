
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		StringBuilder builder = new StringBuilder();
		String line;
		while ((line = reader.readLine()) != null) {
			if (line.isEmpty()) {
				break;
			}
			String maru = getNum('o', line);
			String batu = getNum('x', line);
			if (check(maru)) {
				System.out.println("o");
			} else if (check(batu)) {
				System.out.println("x");
			} else {
				System.out.println("d");
			}
		}

	}

	private static boolean check(String a) {
		Pattern b = Pattern.compile("1.*5.*9");
		Pattern c = Pattern.compile("3.*5.*7");
		Pattern d = Pattern.compile("1.*4.*7");
		Pattern e = Pattern.compile("2.*5.*8");
		Pattern f = Pattern.compile("3.*6.*9");

		if (a.contains("123") || a.contains("456") || a.contains("789")) {
			return true;
		}
		if (b.matcher(a).find() || c.matcher(a).find() || d.matcher(a).find()
				|| e.matcher(a).find() || f.matcher(a).find()) {
			return true;
		}

		return false;
	}

	private static String getNum(char a, String line) {
		char[] chs = line.toCharArray();
		for (int i = 0; i < chs.length; i++) {
			if (chs[i] == a) {
				chs[i] = (char) (i + 1 + '0');
			}
		}
		return String.valueOf(chs);
	}
}