import java.util.*;
import java.io.*;

class Main {

	void solve () {

		int n = in.nextInt(), k = in.nextInt();
		char[] s = in.next().toCharArray();
		s[k-1] = Character.toLowerCase(s[k-1]);
		out.println(String.valueOf(s));
		
	}
	
	public static Scanner in = new Scanner(System.in);
	public static PrintWriter out = new PrintWriter(System.out);
	public static void main(String[] args) {
		new Main().solve();
		out.flush();
	}

}