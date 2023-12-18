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
		double[]	data = null;
		double		bmi  = 0.0;

		while ((data = parseData()) != null) {
			bmi = data[1] / Math.pow(data[2], 2.0);
			if (bmi >= 25.0) {
				System.out.println((int)data[0]);
			}
		}
	}

	private static double[] parseData() {
		double[]	data  = null;
		String[]	split = null;
		String		strIn = null;

		if ((strIn = parseStdin()) != null) {
			split   = strIn.split(",");
			data    = new double[3];
			data[0] = Double.parseDouble(split[0]); 
			data[1] = Double.parseDouble(split[1]); 
			data[2] = Double.parseDouble(split[2]); 
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