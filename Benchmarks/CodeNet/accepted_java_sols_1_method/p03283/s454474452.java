import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int Q = sc.nextInt();
		int[] l = new int[m];
		int[] r = new int[m];
		for(int i = 0; i < m; i++) {
			l[i] = sc.nextInt() - 1;
			r[i] = sc.nextInt() - 1;
		}
		int[] p = new int[Q];
		int[] q = new int[Q];
		for(int i = 0; i < Q; i++) {
			p[i] = sc.nextInt() - 1;
			q[i] = sc.nextInt() - 1;
		}
		// x[i][j]：区間[i, j]を走る電車の個数
		int[][] x = new int[n][n];
		for(int i = 0; i < m; i++) x[l[i]][r[i]]++;
		// query[i][j]：区間[i, i]〜区間[i, j]を走る電車の個数
		int[][] query = new int[n][n];
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				for(int k = i; k <= j; k++) {
					query[i][j] += x[i][k];
				}
			}
		}
		for(int i = 0; i < Q; i++) {
			int cnt = 0;
			for(int j = p[i]; j <= q[i]; j++) {
				if(p[i] == 0) cnt += query[j][q[i]];
				else cnt += query[j][q[i]] - query[j][p[i] - 1];
			}
			System.out.println(cnt);
		}
	}
}
