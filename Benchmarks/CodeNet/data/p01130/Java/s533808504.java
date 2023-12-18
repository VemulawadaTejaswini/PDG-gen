import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;
import static java.lang.Math.*;

public class Main {

	static int[][] d;
	static final int INF = 1 << 24;

	static Scanner scan = new Scanner(System.in);
	static PrintWriter out = new PrintWriter(System.out);

	public static void main(String[] args) {
		while(true){
			int n = si(),m = si(),s = si()-1,g1 = si()-1,g2 = si()-1;
			if(n==0) break;
			d = new int[n][n];
			for(int i = 0; i < n; i++){Arrays.fill(d[i],INF); d[i][i] = 0;}
			for (int i = 0; i < m; i++) d[si()-1][si()-1]=si();
			warshallFloyd(n);
			int mincost = INF;
			for (int i = 0; i < n; i++) mincost = min(d[s][i]+d[i][g1]+d[i][g2],mincost);
			out.println(mincost);
		}
		out.flush();
	}

	static void warshallFloyd(int n){
		for (int i = 0; i < n ; i++) {
			for (int j = 0; j < n ; j++) {
				for (int j2 = 0; j2 < n; j2++) {
					d[j][j2] = min(d[j][j2],d[j][i]+d[i][j2]);
				}
			}
		}
	}

	static int si() {
		return Integer.parseInt(scan.next());
	}
}