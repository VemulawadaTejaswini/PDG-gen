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
		String	strIn = null;
		double	in    = 0.0;
		double	max   = Double.MIN_VALUE;
		double	min   = Double.MAX_VALUE;
		boolean	bflag = false;

		while ((strIn = parseStdin()) != null) {
			in    = Double.parseDouble(strIn);
			max   = Math.max(max, in);
			min   = Math.min(min, in);
			bflag = true;
		}

		if (bflag) {
			System.out.println(max - min);
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