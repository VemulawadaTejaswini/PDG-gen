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
		String	str = null;

		while((str = parseStr()) != null) {
			str = reverse(str);
			System.out.println(str);
		}
	}

	private static String parseStr() {
		String	str = null;

		try {
			String line = br.readLine();
			if (line != null) {
				if (!line.isEmpty()) {
					str = line;
				}
			}
		}
		catch (NumberFormatException e) {}
		catch (IOException e) {}

		return str;
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
}