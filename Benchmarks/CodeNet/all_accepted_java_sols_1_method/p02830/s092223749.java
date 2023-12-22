import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		// ------------------------------------------------
		int n = Integer.parseInt(sc.next());
		String s = sc.next(), t = sc.next();
		String ret = "";
		for (int i = 0; i < n; i++) {
			ret += s.charAt(i);
			ret += t.charAt(i);
		}
		out.println(ret);

		// ------------------------------------------------
		sc.close();
		out.flush();
	}
}