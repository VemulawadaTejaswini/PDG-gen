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
		String	strNum = null;
		double	s      = calcSum();
		while((strNum = parseStdin())!= null) {
			System.out.printf("%.8f\n", s * Double.parseDouble(strNum));
		}
	}

	private static double calcSum() {
		double	s = 1.0;
		double	d = 1.0;

		for(int i = 2; i <= 10; i++) {
			d  = (i % 2 == 0) ? d * 2: d / 3.0;
			s += d;
		}

		return s;
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