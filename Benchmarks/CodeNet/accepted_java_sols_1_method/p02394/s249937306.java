import java.util.*;
import java.io.*;

class Main {
	static PrintStream out = System.out;
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {

		int W = in.nextInt();
		int H = in.nextInt();
		int x = in.nextInt();
		int y = in.nextInt();
		int r = in.nextInt();

		if (0 > x - r || 0 > y - r || W < x + r || H < y + r) {
			out.println("No");
		} else {
			out.println("Yes");
		}
	}
}