import java.util.*;
import java.io.*;

class Main {

	void solve () {

		int p = in.nextInt(), q = in.nextInt(), r = in.nextInt();
		int[] ar = {p+q, p+r, q+r};
		Arrays.sort(ar);
		out.println(ar[0]);
		
	}

	public static PrintWriter out = new PrintWriter(System.out);
	public static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main().solve();
		out.flush();
	}

}