import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		// ------------------------------------------------
		String s = sc.next();
		boolean ok = true;
		for (int i = 0; i < s.length(); i++) {
			if (i % 2 == 1) {
				if (s.charAt(i) == 'R') {
					ok = false;
					break;
				}
			} else {
				if (s.charAt(i) == 'L') {
					ok = false;
					break;
				}
			}
		}
		if (ok) {
			out.println("Yes");
		} else {
			out.println("No");
		}

		// ------------------------------------------------
		sc.close();
		out.flush();
	}
}