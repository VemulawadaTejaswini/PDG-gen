

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader sb = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			String num = sb.readLine();
			int count = 0;
			if (num.equals("0")) {
				break;
			}
			for (int i = 0; i < num.length(); i++) {
				count += Integer.parseInt(num.substring(i, i + 1));
			}
			System.out.println(count);

		}
	}

}