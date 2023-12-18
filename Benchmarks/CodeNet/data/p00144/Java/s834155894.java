
import java.util.*;
import java.io.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;
import static java.lang.Math.*;

public class Main {

	int INF = 1 << 28;
	//long INF = 1L << 62;
	double EPS = 1e-10;
	
	int n;
	int[][] es;
	
	void run() {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		es = new int[n][n];
		for (int[] a: es) fill(a, INF);
		for (int i=0;i<n;i++) es[i][i] = 0;
		for (int i=0;i<n;i++) {
			int r = sc.nextInt()-1, k = sc.nextInt();
			for (int j=0;j<k;j++) {
				int t = sc.nextInt()-1;
				es[r][t] = 1;
			}
		}
		
		for (int k=0;k<n;k++) for (int i=0;i<n;i++) for (int j=0;j<n;j++) {
			es[i][j] = min(es[i][j], es[i][k] + es[k][j]);
		}
		int p = sc.nextInt();
		for (int i=0;i<p;i++) {
			int s = sc.nextInt()-1, d = sc.nextInt()-1, v = sc.nextInt();
			System.out.println((es[s][d] + 1 <= v ? es[s][d] + 1 : "NA"));
		}
	}
	

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}