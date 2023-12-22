import java.util.*;
import java.io.*;

class Main {
	static PrintStream out = System.out;
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();

		int count = 0;
		for (int i = a; i <= b; i++) {
			if (c % i == 0) count++;
		}
		out.println(count);
	}
}