import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		// ------------------------------------------------

		int a, b, c, d;
		a = Integer.parseInt(sc.next());
		b = Integer.parseInt(sc.next());
		c = Integer.parseInt(sc.next());
		d = Integer.parseInt(sc.next());

		boolean takaWin = false;
		while (true) {
			c -= b;
			if (c <= 0) {
				takaWin = true;
				break;
			}
			a -= d;
			if (a <= 0) {
				takaWin = false;
				break;
			}
		}
		if (takaWin) {
			out.println("Yes");
		} else {
			out.println("No");
		}

		// ------------------------------------------------
		sc.close();
		out.flush();
	}
}