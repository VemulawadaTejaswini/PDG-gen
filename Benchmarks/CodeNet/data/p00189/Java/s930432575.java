import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;


public class Vol0189 {
	final static int INF = 100000000;
	final static int abmax = 10;
	
	public static void warshallFloyd(int v, int[][] d) {
		for (int k = 0; k < v; k++) {
			for (int i = 0; i < v; i++) {
				for (int j = 0; j < v; j++) {
					d[i][j] = Math.min(d[i][j], d[i][k] + d[k][j]);
				}
			}
		}
	}
	
	public static int length(int v, int p, int[][] d) {
		int sum = 0;
		for (int i = 0; i < v; i++) {
			sum += d[p][i];
		}
		return sum;
	}
	
	public static int[][] initialization() {
		int[][] d = new int[abmax][abmax];
		for (int i = 0; i < abmax; i++) {
			for (int j = 0; j < abmax; j++) {
				if (i == j)
					d[i][j] = 0;
				else
					d[i][j] = INF;
			}
		}
		return d;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine().split(" ")[0]);
		
		while (n != 0) {
			int[][] d = initialization();
			int v = 0;
			for (int i = 0; i < n; i++) {
				String str[] = sc.nextLine().split(" ");
				int a = Integer.parseInt(str[0]);
				int b = Integer.parseInt(str[1]);
				int c = Integer.parseInt(str[2]);
				d[a][b] = c;
				d[b][a] = c;
				v = Math.max(Math.max(v, a), b);
			}
			v = v + 1;
			warshallFloyd(v, d);
			int minv = 0;
			int minsum = INF;
			for (int i = 0; i < v; i++) {
				if (minsum > length(v, i, d)) {
					minv = i;
					minsum = length(v, i, d);
				}
			}
			System.out.println(minv + " " + minsum);
			n = Integer.parseInt(sc.nextLine().split(" ")[0]);
		}
		sc.close();
	}
}
