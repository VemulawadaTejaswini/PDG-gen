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
		String	stdin = null;
		int		sum   = 0;

		while ((stdin = parseStdin()) != null) {
			// 半角英数字ピリオドの文字列を#に置き換えておく
			stdin = stdin.replaceAll("[^0-9]", " ").trim();
			stdin = stdin.replaceAll("[ ]+", " ");
			if (!stdin.isEmpty()) {
				for (String s : stdin.split(" ")) {
					// #が含まれる文字列は対象外
					sum += Integer.parseInt(s);
				}
			}
		}

		System.out.println(sum);
	}

	private static String parseStdin() {
		String	stdin = null;

		try {
			stdin = br.readLine();
		}
		catch (IOException e) {}

		return stdin;
	}
}