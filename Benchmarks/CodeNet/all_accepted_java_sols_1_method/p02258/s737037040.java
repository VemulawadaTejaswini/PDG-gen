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
		int[] max = new int[n];
		max[n-1] = r[n-1];
		for (int i = n - 2; i > 0; i--) {
			max[i] = Math.max(max[i+1], r[i]);
		}
		int[] min = new int[n];
		min[0] = r[0];
		for (int i = 1; i < n; i++) {
			min[i] = Math.min(min[i-1], r[i]);
		}
		int ret = 0x80000000;
		for (int i = 1; i < n; i++) {
			ret = Math.max(ret, max[i] - min[i-1]);
		}
		out.println(ret);
	}
}