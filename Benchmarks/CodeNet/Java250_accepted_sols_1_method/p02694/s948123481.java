import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		// ------------------------------------------------
		long x = Long.parseLong(sc.next());

		int ret = 0;
		long kane = 100;
		while (kane < x) {
			kane += kane / 100;
			ret++;
		}

		out.println(ret);

		// ------------------------------------------------
		sc.close();
		out.flush();
	}
}