import java.util.*;
import java.io.*;

class Main {
	static PrintStream out = System.out;
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		int n = in.nextInt();
		int m = in.nextInt();
		int[][] a = new int[n][m];
		int[] b = new int[m];
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				a[i][j] = in.nextInt();
			}
		}
		for(int i = 0; i < m; i++) {
			b[i] = in.nextInt();
		}
		for(int i = 0; i < n; i++) {
			long sum = 0;
			for(int j = 0; j < m; j++) {
				sum += a[i][j] * b[j];
			}
			out.println(sum);
		}
	}
}