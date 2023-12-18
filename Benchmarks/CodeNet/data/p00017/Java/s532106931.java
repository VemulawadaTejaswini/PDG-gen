import java.io.*;
import java.util.Scanner;

public class Main {

	public static String decode (String str) {

		char[] c = str.toCharArray();
		for (int i = 0; i < 26; i++) {
			str = new String(c);
			if (str.indexOf("the") != -1 || str.indexOf("this") != -1 || str.indexOf("that") != -1) {
				return str;
			}
			for (int j = 0; j < str.length(); j++) {
				if ('a' <= c[j] && c[j] <= 'z') {
					if (c[j] == 'z') {
						c[j] = 'a';
					} else {
						c[j]++;
					}
				}
			}
		}
		return null;
	}

	public static void main (String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			String str = sc.nextLine();
			System.out.println(decode(str));
		}

	}

}