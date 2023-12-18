import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	private	static	BufferedReader	br = null;

	static {
		br = new BufferedReader(new InputStreamReader(System.in));
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char	ball  = 'A';
		char[]	trade = null;

		while ((trade = parseTrade()) != null) {
			ball = (ball == trade[0]) ? trade[1] : (ball == trade[1]) ? trade[0] : ball;
		}

		System.out.println(ball);
	}

	private static char[] parseTrade() {
		String	strIn = null;
		char[]	table = null;

		if ((strIn = parseStdin()) != null) {
			String[]	line = strIn.split(",");

			table    = new char[2];
			table[0] = line[0].charAt(0);
			table[1] = line[1].charAt(0);
		}
		
		return table;
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