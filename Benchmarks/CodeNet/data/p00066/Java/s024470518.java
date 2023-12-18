
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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
		if (a.contains("123") || a.contains("456") || a.contains("789")) {
			return true;
		}
		if ((a.contains("1") && a.contains("5") && a.contains("9"))
				|| (a.contains("3") && a.contains("5") && a.contains("7"))) {
			return true;
		}
		char[] chs = new char[a.length()];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				chs[i * 3 + j] = a.charAt(j * 3 + i);
			}
		}
		String b = String.valueOf(chs);
		if (b.contains("147") || b.contains("258") || b.contains("369")) {
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