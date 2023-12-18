import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class Main {

	public static String decode(String s, int r) {
		String alph = "abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz";
		StringBuilder sb = new StringBuilder();
		for (int i = 0 ; i < s.length() ; i++) {
			char c = s.charAt(i);
			if (c < 'a' || c > 'z') {
				sb.append(c);
			} else {
				sb.append(alph.charAt(alph.indexOf(c)+r));
			}
		}
		return sb.toString();
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println(decode("a", 2));

		String line;
		while ((line = br.readLine()) != null) {
			for (int r = 0 ; r < 27 ; r++) {
				String decoded = decode(line, r);
				if (decoded.indexOf("the") > -1 || decoded.indexOf("this") > -1 || decoded.indexOf("that") > -1) {
					System.out.println(decoded); break;
				}
			}

		}

	}
}