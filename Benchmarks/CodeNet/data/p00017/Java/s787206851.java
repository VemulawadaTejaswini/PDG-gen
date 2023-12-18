import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class Main {

	public static int count(String hash, String needle) {
		if (!hash.contains(needle)) return 0;
		int count = 0;
		String str = new String(hash);
		while (str.contains(needle)) {
			count++;
			str = str.substring(0, str.indexOf(needle))+str.substring(str.indexOf(needle)+1);
		}
		return count;
	}

	public static String decode(String s, int r) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0 ; i < s.length() ; i++) {
			char c = s.charAt(i);
			if (c < 'a' || c > 'z') {
				sb.append(c);
			} else {
				sb.append((char) (((c-97-r)%26)+97));
			}
		}
		return sb.toString();
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

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