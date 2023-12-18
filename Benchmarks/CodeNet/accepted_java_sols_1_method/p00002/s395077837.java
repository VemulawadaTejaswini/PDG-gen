import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	/**
	 * AOJ002 Digit Number
	 *
	 * @param args
	 * @throws IOException
	 *             ??\?????¨??????
	 */
	public static void main(String[] args) throws IOException {

		BufferedReader bufferedReader = new BufferedReader(
				new InputStreamReader(System.in));

		String strInput = bufferedReader.readLine();
		while (strInput != null) {
			String[] strDigit = strInput.split("\\s");

			int sum = Integer.parseInt(strDigit[0])
					+ Integer.parseInt(strDigit[1]);

			System.out.println(Integer.toString(sum).length());
			strInput = bufferedReader.readLine();
		}

		bufferedReader.close();
	}

}