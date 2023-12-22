import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		// ------------------------------------------------

		int n = Integer.parseInt(sc.next());

		long ret = 0;
		for (int i = 1; i <= n; i++) {
			if (i % 15 == 0) {

			} else if (i % 3 == 0) {

			} else if (i % 5 == 0) {

			} else {
				ret += i;
			}
		}
		out.println(ret);

		// ------------------------------------------------
		sc.close();
		out.flush();
	}
}