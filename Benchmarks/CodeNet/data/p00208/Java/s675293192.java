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
				if (octs[i] == '4')
					octs[i] = '5';
				else if (octs[i] > '4')
					octs[i] = (char) ((int) octs[i] + 2);
			}
			System.out.println(String.valueOf(octs));
		}
	}
}