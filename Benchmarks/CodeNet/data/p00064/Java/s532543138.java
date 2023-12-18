
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
		int count = 0;
		while ((line = reader.readLine()) != null) {
			if (line.isEmpty())
				break;
			char[] a = line.toCharArray();
			for (int i = 0; i < a.length; i++) {
				if (!Character.isDigit(a[i])) {
					a[i] = ',';
				}
			}
			String[] b = String.valueOf(a).split(",");
			for (int i = 0; i < b.length; i++) {
				if (!b[i].isEmpty())
					count += Integer.parseInt(b[i]);
			}
		}
		System.out.println(count);
	}

}