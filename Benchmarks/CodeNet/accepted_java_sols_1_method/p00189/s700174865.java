import java.io.PrintWriter;
import java.util.Scanner;


public class Main {

	static final int INF = Integer.MAX_VALUE/2;

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);

		while(true){
			int n = Integer.parseInt(scan.next());
			if(n==0) break;
			int[][] d = new int[10][10];
			for (int i = 0; i < 10; i++) {
				for (int j = 0; j < 10; j++) {
					d[i][j] = INF;
					if(i==j) d[i][j] = 0;
				}
			}
			int m = 0;
			for (int i = 0; i < n; i++) {
				int a = Integer.parseInt(scan.next()),b = Integer.parseInt(scan.next()),c = Integer.parseInt(scan.next());
				d[b][a] = d[a][b] = c;
				m = (short)Math.max(Math.max(a, b),m);
			}
			m++;

			for (int k = 0; k < m; k++) {
				for (int i = 0; i < m; i++) {
					for (int j = 0; j < m; j++) {
						d[i][j] = Math.min(d[i][j], d[i][k]+d[k][j]);
					}
				}
			}

			int mincost=INF,v=0;
			for (short i = 0; i < m; i++) {
				int sum = 0;
				for (short j = 0; j < m; j++) {
					sum+=d[i][j];
				}
				if(mincost>sum){
					mincost = sum;
					v = i;
				}
			}
			out.println(v+" "+mincost);
		}

		out.flush();
	}

}