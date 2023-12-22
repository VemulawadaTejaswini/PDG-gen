import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		// ------------------------------------------------

		int x = Integer.parseInt(sc.next());

		int ret = 0;

		ret += (x / 500) * 1000;
		x %= 500;
		ret += (x / 5) * 5;

		out.println(ret);

		// ------------------------------------------------
		sc.close();
		out.flush();
	}
}