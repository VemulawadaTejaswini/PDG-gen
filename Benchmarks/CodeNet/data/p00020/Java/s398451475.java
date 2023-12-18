import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	private	static	final	int				CHAR_DIFF = 'A' - 'a';
	private	static			BufferedReader	br        = null;

	static {
		br   = new BufferedReader(new InputStreamReader(System.in));
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String	strStdin = null;

		while((strStdin = parseStdin()) != null) {
			char[]	aStdin = strStdin.toCharArray();
			for (int n = 0; n < aStdin.length; n++) {
				if ('a' <= aStdin[n] && aStdin[n] <= 'z') {
					aStdin[n] += CHAR_DIFF;
				}
			}
			System.out.println(aStdin);
		}
	}

	private static String parseStdin() {
		String	strNum = null;

		try {
			String line = br.readLine();
			if (line != null) {
				if (!line.isEmpty()) {
					strNum = line;
				}
			}
		}
		catch (IOException e) {}

		return strNum;
	}
}