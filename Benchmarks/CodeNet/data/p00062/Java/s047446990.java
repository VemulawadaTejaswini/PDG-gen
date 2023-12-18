
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
			if (line.isEmpty())
				break;
			String result = getNum(line);
			System.out.println(result);
		}
	}

	private static String getNum(String line) {
		if (line.length() == 1) {
			return line;
		}
		char[] a = line.toCharArray();
		char[] b = new char[line.length() - 1];
		for (int i = 0; i < b.length; i++) {
			b[i] = (char) ((a[i] - '0' + (a[i + 1] - '0')) % 10 + '0');
		}
		return getNum(String.valueOf(b));
	}
}