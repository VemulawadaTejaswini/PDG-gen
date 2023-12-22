/**
 * Yes, I have a number
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;

		while ((line = br.readLine()) != null && !line.isEmpty()) {
			if (line.equals("END OF INPUT")) break;

			line = line + " ";
			int head = 0;
			for (int i = 0; i < line.length(); i++) {
				if (line.charAt(i) == ' ') {
					System.out.print(i - head);
					head = i + 1;
				}
			}
			System.out.println();
		} //end while
	} //end main
}