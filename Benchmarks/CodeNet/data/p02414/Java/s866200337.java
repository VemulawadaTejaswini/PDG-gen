import java.util.*;
import java.io.*;

class Main {
	static PrintStream out = System.out;
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		int n = in.nextInt();
		int m = in.nextInt();
		int l = in.nextInt();
		int[][] a = new int[n][m];
		int[][] b = new int[m][l];
		for(int i = 0; i < n; i++){
			for(int j = 0; j < m; j++){
				a[i][j] = in.nextInt();
			}
		}
		for(int i = 0; i < m; i++){
			for(int j = 0; j < l; j++){
				b[i][j] = in.nextInt();
			}
		}
		for(int i = 0; i < n; i++){
			String ret = "";
			for(int j = 0; j < l; j++){
				long sum = 0;
				for(int k = 0; k < m; k++){
					sum += a[i][k] * b[k][j];
				}
				ret += " " + sum;
			}
			out.println(ret.trim());
		}
	}
}