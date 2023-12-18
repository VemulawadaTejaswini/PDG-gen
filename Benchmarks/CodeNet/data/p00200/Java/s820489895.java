import java.util.Scanner;

public class Main {
	public static final int INF = 10000000;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {

			int n = sc.nextInt();
			int m = sc.nextInt();
			if (n+m==0) {
				break;
			}

			int[][] cost = new int[m][m];
			int[][] time = new int[m][m];
			for(int i=0;i<m;i++) {
				for(int j=0;j<m;j++) {
					if (i!=j) {
						cost[i][j] = INF;
						time[i][j] = INF;
					}
				}
			}
			for(int i=0;i<n;i++) {
				int a = sc.nextInt()-1;
				int b = sc.nextInt()-1;
				int c = sc.nextInt();
				int t = sc.nextInt();
				cost[a][b] = c;
				cost[b][a] = c;
				time[a][b] = t;
				time[b][a] = t;
			}
			for(int k=0;k<m;k++) {
				for(int i=0;i<m;i++) {
					for(int j=0;j<m;j++) {
						cost[i][j] = Math.min(cost[i][j],cost[i][k] + cost[k][j]);
						time[i][j] = Math.min(time[i][j], time[i][k] + time[k][j]);
					}
				}
			}
			int Q = sc.nextInt();
			for(int i=0;i<Q;i++) {
				int p = sc.nextInt()-1;
				int q = sc.nextInt()-1;
				int r = sc.nextInt();
				if (r==0) {
					System.out.println(cost[p][q]);
				}else{
					System.out.println(time[p][q]);
				}
			}
		}
	}

}