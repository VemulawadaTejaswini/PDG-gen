import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static String decode (String code) {
		String ret = "";
		for (int i = 0; i < code.length(); i++) {
			if (code.charAt(i) == '@') {
				int lim = code.charAt(i + 1) - '0';
				char c = code.charAt(i + 2);
				for (int j = 0; j < lim; j++)
					ret += c + "";
				i += 2;
			} else {
				ret += code.charAt(i) + "";
			}
		}
		return ret;
	}

	public static void main(String[] args) throws IOException {

		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		while ((line = br.readLine()) != null) {
			System.out.println(decode(line));
			line = null;
		}

	}

}