import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int l = sc.nextInt();
		int[][] a = new int[m][n];
		int[][] b = new int [l][m];
		long[][] c = new long [l][n];
		for(int i = 0;i < n;i++ ) {
			for(int j = 0;j < m;j++) {
				int d = sc.nextInt();
				a[j][i] = d;
			}
		}
		for(int i = 0;i < m;i++) {
			for(int j = 0;j < l;j++) {
				int d = sc.nextInt();
				b[j][i] = d;
			}
		}
		for(int i = 0;i < n;i++) {
			for(int j = 0;j < l;j++) {
				for(int k = 0; k< m; k++) {
				c[j][i] = c[j][i] + (a[k][i] * b[j][k]);
				}
				System.out.print(c[j][i]);
				if(j < l -1)System.out.print(" ");
			}
			System.out.println();
		}
	}
}



