import java.util.*;
import java.io.*;

class Main {
	static PrintStream out = System.out;
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		char[] cs = in.nextLine().toCharArray();
		int[] xs = new int[cs.length+1];
		for (int i = 0; i < cs.length; i++) {
			if (cs[i] == '\\') {
				xs[i+1] = xs[i] - 1;
			} else if (cs[i] == '/') {
				xs[i+1] = xs[i] + 1;
				if (xs[i+1] > 0) {
					xs[i+1] = 0;
					cs[i] = '_';
				}
			} else {
				xs[i+1] = xs[i];
			}
		}
		xs[xs.length - 1] = 0;
		for (int i = cs.length - 1; i >= 0; i--) {
			if (cs[i] == '\\') {
				xs[i] = xs[i+1] + 1;
				if (xs[i] > 0) {
					xs[i] = 0;
					cs[i] = '_';
				}
			} else if (cs[i] == '/') {
				xs[i] = xs[i+1] - 1;
			} else {
				xs[i] = xs[i+1];
			}
		}
		xs[0] = 0;
		int k = 0;
		for (int i = 0; i < cs.length; i++) {
			if (cs[i] == '\\') {
				xs[i+1] = xs[i] - 1;
			} else if (cs[i] == '/') {
				xs[i+1] = xs[i] + 1;
			} else {
				xs[i+1] = xs[i];
			}
			if (xs[i+1] == 0 && xs[i] < 0) k++;
		}
		int a = 0;
		int[] l = new int[k];
		int index = 0;
		for (int i = 1; i < cs.length; i++) {
			a -= xs[i];
			l[index] -= xs[i];
			if (xs[i] == 0 && xs[i-1] < 0) index++;
		}

		out.println(a);
		StringBuilder sb = new StringBuilder();
		sb.append(k);
		for (int n : l) {
			sb.append(' ').append(n);
		}
		out.println(sb.toString());
	}
}