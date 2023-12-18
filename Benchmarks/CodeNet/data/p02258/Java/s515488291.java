import java.util.*;
import java.io.*;

class Main {
	static PrintStream out = System.out;
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		int n = in.nextInt();
		int[] r = new int[n];
		for (int i = 0; i < n; i++) {
			r[i] = in.nextInt();
		}
		int max = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				max = Math.max(max, r[j] - r[i]);
			}
		}
		out.println(max);
	}
}