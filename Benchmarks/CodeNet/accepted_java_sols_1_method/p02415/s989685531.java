import static java.lang.Character.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		while ((str = br.readLine()) != null) {
			for (int i = 0; i < str.length(); i++) {
				char c = str.charAt(i);
				if (isLetter(c)) {
					if (isUpperCase(c)) {
						System.out.print(toLowerCase(c));
					} else {
						System.out.print(toUpperCase(c));
					}
				} else {
					System.out.print(c);
				}
			}
			System.out.println();
		}
	}

}