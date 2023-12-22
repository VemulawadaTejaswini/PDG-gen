

import java.util.Scanner;

public class Main{
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String s = scan.next();

		String anser = "No";

		StringBuilder sb = new StringBuilder(s);

		if (s.equals(sb.reverse().toString())) {

			String sbe = s.substring(0, (s.length() - 1) / 2);
			String sba = s.substring((s.length() + 1) / 2, s.length());

			StringBuilder sbbe = new StringBuilder(sbe);
			StringBuilder sbba = new StringBuilder(sba);

			if (sbe.equals(sbbe.reverse().toString()) && sba.equals(sbba.reverse().toString())) {
				anser = "Yes";

			}

		}
		System.out.println(anser);

	}

}
