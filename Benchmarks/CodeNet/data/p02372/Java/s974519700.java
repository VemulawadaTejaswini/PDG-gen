import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		initWF(n);
		for (int i=0;i<n-1;i++) {
			int s = in.nextInt();
			int t = in.nextInt();
			int w = in.nextInt();
			d[s][t] = w;
			d[t][s] = w;
		}
		execWF();
		for (int i=0;i<n;i++) {
			long furthest = -1;
			for (int j=0;j<n;j++) {
				if (furthest < d[i][j]) furthest = d[i][j];
			}
			System.out.println(furthest);
		}
	}
	
	///
	///// start
	static int[][] d;
	// 
	static int INIT_D = Integer.MAX_VALUE;
	
	public static void initWF(int n) {
		d = new int[n][n];
		for (int i=0;i<n;i++) {
			for (int j=0;j<n;j++) {
				d[i][j] = INIT_D;
				if (i==j) d[i][j] = 0;
			}
		}
	}
	
	public static void execWF() {
		int n = d.length;
		for (int k=0;k<n;k++) {
			for (int i=0;i<n;i++) {
				if (d[i][k] == INIT_D) continue;
				for (int j=0;j<n;j++) {
					if (d[k][j] == INIT_D) continue;

					d[i][j] = Math.min(d[i][j], d[i][k]+d[k][j]);
				}
			}
		}
	}
	
	public static boolean hasNegativeLoop() {
		int n = d.length;
		for (int i=0;i<n;i++) {
			if (d[i][i]<0) return true;
		}
		return false;
	}
	///// end
}