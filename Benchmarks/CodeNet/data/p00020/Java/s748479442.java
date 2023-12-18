import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.util.Collections.sort;

/**
 */
class Main {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);

		String s = in.nextLine();
		solve(s);
	}

	public static void solve(String s) {
		String ans = "";
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);

			// capitalize
			if((int)'a' <= (int)ch && (int)ch <= (int)'z') {
				ch = (char)((int)'A' + (int)(ch - 'a'));
			}
			ans += ch;
		}
		System.out.println(ans);
	}
}