import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	private	static	BufferedReader br = null;

	static {
		br = new BufferedReader(new InputStreamReader(System.in));
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String	line   = null;
		String	answer = null;
		int		weight = 0;

		while((line = parseNum()) != null) {
			answer = "";
			weight = Integer.parseInt(line);

			for (int n = 0, bit = 1; n < 10 && weight > 0; n++, bit <<= 1, weight >>= 1) {
				if (weight % 2 != 0) {
					if (!answer.isEmpty()) {
						answer += " ";
					}
					answer += bit;
				}
			}

			System.out.println(answer);
		}
	}

	private static String parseNum() {
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