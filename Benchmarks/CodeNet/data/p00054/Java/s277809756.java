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
		int[]	data = null;
		while((data = parseData())!= null) {
			result(data);
		}
	}

	private static void result(int[] data) {
		String	div = String.valueOf((double)data[0] / (double)data[1]);
		int		dot = div.indexOf('.');
		int		sum = 0;
		int		len = 0;

		if (dot != -1) {
			div = div.substring(dot + 1);
			len = Math.min(data[2], div.length());
			for (int n = 0; n < len; n++) {
				sum += div.charAt(n) - '0';
			}
		}
		
		System.out.println(sum);
	}

	private static int[] parseData() {
		int[]		data  = null;
		String		stdin = parseStdin();
		String[]	line  = null;

		if (stdin != null) {
			line = stdin.split(" ");
			data = new int[3];

			for (int n = 0; n < data.length; n++) {
				data[n] = Integer.parseInt(line[n]);
			}
		}

		return data;
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