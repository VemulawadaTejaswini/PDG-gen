import java.util.Arrays;
import java.util.Scanner;


public class Main {
	final static int INF = 100000000;
	final static int abmax = 10;
	
	public static void warshallFloyd(int v, int[][] d) {
		for (int k = 0; k <= v; k++) {
			for (int i = 0; i <= v; i++) {
				for (int j = 0; j <= v; j++) {
					if (i == j)
						d[i][j] = 0;
					else
						d[i][j] = Math.min(d[i][j], d[i][k] + d[k][j]);
				}
			}
		}
	}
	
	public static int length(int v, int p, int[][] d) {
		int sum = 0;
		for (int i = 0; i <= v; i++) {
			sum += d[p][i];
		}
		return sum;
	}
	
	public static void main(String[] args) {
		int[][] d  = new int[abmax][abmax];
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		while (n != 0) {
			int v = 0;
			int minp = 0;
			int minsum = INF;
			for (int i = 0; i < abmax; i++) {
				Arrays.fill(d[i], INF);
			}
			
			for (int i = 0; i < n; i++) {
				int a = sc.nextInt();
				int b = sc.nextInt();
				int c = sc.nextInt();
				d[a][b] = c;
				d[b][a] = c;
				v = Math.max(v, Math.max(a, b));
			}
			warshallFloyd(v, d);
			for (int i = 0; i < v; i++) {
				if (minsum > length(v, i, d)) {
					minp = i;
					minsum = length(v, i, d);
				}
			}
			System.out.println(minp + " " + minsum);
			n = sc.nextInt();
		}
		sc.close();
	}
}
