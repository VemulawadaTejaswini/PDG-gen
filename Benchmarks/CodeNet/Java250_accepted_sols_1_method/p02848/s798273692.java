import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		// ------------------------------------------------
		int n = Integer.parseInt(sc.next());
		String s = sc.next();
		String ret = "";

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			int a = c - 'A';
			a = (a + n) % 26;
			ret += (char) ('A' + a);
		}

		out.println(ret);

		// ------------------------------------------------
		sc.close();
		out.flush();
	}
}