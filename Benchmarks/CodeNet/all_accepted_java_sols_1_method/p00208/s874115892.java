import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		char[] octs;
		while (!(line = br.readLine()).equals("0")) {
			octs = Integer.toOctalString(Integer.parseInt(line)).toCharArray();
			for (int i = 0; i < octs.length; i++) {
				switch (octs[i]) {
				case '4':
					octs[i] = '5';
					break;
				case '5':
					octs[i] = '7';
					break;
				case '6':
					octs[i] = '8';
					break;
				case '7':
					octs[i] = '9';
					break;
				}
			}
			System.out.println(String.valueOf(octs));
		}
	}
}