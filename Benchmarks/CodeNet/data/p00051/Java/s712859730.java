import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


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
		String	strIn = parseStdin();

		if (strIn != null) {
			int	max = Integer.parseInt(strIn);
			for (int n = 0; n < max; n++) {
				strIn = parseStdin();
				sub(strIn.toCharArray());
			}
		}
	}

	private static void sub(char[] strIn) {
		String	strMin = null;
		String	strMax = null;

		Arrays.sort(strIn);

		strMin = String.valueOf(strIn);
		strMax = reverse(strMin);

		System.out.println(Long.parseLong(strMax) - Long.parseLong(strMin));
	}

	private static String reverse(String str) {
		char[]	buff = str.toCharArray();
		int		nLen = str.length();
		char	c    = 0;

		for(int n1 = 0, n2 = nLen - 1; n1 < n2; n1++, n2--) {
			c        = buff[n1];
			buff[n1] = buff[n2];
			buff[n2] = c;
		}

		return String.valueOf(buff);
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