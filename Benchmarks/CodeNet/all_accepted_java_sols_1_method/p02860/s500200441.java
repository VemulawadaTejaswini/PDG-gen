import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		// ------------------------------------------------
		int n = Integer.parseInt(sc.next());
		String s = sc.next();

		if (s.length() % 2 == 0 && s.substring(0, n / 2).equals(s.substring(n / 2, n))) {
			out.println("Yes");
		} else {
			out.println("No");
		}

		// ------------------------------------------------
		sc.close();
		out.flush();
	}
}