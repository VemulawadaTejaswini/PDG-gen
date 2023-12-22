import java.util.*;
import java.io.*;

class Main {

	void solve () {

		int a = in.nextInt();
		
		if (a%2 == 0) System.out.println(0.5);
		else {
			double b = a/2 + 1;
			double c = a;
			System.out.println(String.format("%.6f", b/c));
		}
		
	}

	public static PrintWriter out = new PrintWriter(System.out);
	public static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main().solve();
		out.flush();
	}

}