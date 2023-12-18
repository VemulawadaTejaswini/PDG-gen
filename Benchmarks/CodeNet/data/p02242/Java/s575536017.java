import java.util.*;


public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int g[][] = new int[114][114];
		for (int i=0; i<114; i++) for (int j=0; j<114; j++) {
			if (i==j) g[i][j] = 0;
			else g[i][j] = 123456789;
		}
		
		for (int i=0; i<n; i++) {
			int v = scan.nextInt();
			int k = scan.nextInt();
			for (int j=0; j<k; j++) {
				int to = scan.nextInt(); int cost = scan.nextInt();
				g[v][to] = cost;
			}
		}
		
		for (int k=0; k<n; k++) {
			for (int i=0; i<n; i++) {
				for (int j=0; j<n; j++) {
					g[i][j] = Math.min(g[i][j], g[i][k]+g[k][j]);
				}
			}
		}
		
		int ans = 0;
		for (int i=0; i<n; i++) {
			System.out.println(i+" "+g[0][i]);
		}
	}
}


