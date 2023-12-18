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
		String	strIn  = null;
		double	weight = 0.0;

		while ((strIn = parseStdin()) != null) {
			weight = Double.parseDouble(strIn);
			result(weight);
		}
	}

	private static void result(double weight) {
		String	strRank = "heavy";

		if (weight <= 48.0) {
			strRank = "light fly";
		}
		else if (weight <= 51.0) {
			strRank = "fly";
		}
		else if (weight <= 54.0) {
			strRank = "bantam";
		}
		else if (weight <= 57.0) {
			strRank = "feather";
		}
		else if (weight <= 60.0) {
			strRank = "light";
		}
		else if (weight <= 64.0) {
			strRank = "light welter";
		}
		else if (weight <= 69.0) {
			strRank = "welter";
		}
		else if (weight <= 75.0) {
			strRank = "light middle";
		}
		else if (weight <= 81.0) {
			strRank = "middle";
		}
		else if (weight <= 91.0) {
			strRank = "light heavy";
		}

		System.out.println(strRank);
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