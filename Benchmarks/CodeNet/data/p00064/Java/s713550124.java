import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		String line = "", str = "";
		int sum = 0;
		while ((line = br.readLine()) != null) {
			str += line;
			line = null;
		}
		char[] c = str.toCharArray();
		int num = 0;
		for (int i = 0; i < c.length; i++) {
			if ((c[i] + "").matches("0|1|2|3|4|5|6|7|8|9")) {
				num = num == 0 ? c[i] - '0' : num * 10 + (c[i] - '0');
			} else {
				sum += num;
				num = 0;
			}
		}
		System.out.println(sum);
	}

}