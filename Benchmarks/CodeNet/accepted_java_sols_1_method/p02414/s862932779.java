import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int l = sc.nextInt();
		long[][] a = new long[100][101];
		long[][] b = new long[101][100];
		long[][] c = new long[100][100];
		int i  = 0;
		int j  = 0;
		int k  = 0;

		for(i = 0; i < n; i++) {
			for(k = 1; k <= m; k++) {
				a[i][k] = sc.nextInt();
			}
		}

		for(k = 1; k <= m; k++) {
			for(j = 0; j < l; j++) {
				b[k][j] = sc.nextInt();
			}
		}

		for(i = 0; i < n; i++) {
			for(j = 0; j < l; j++) {
				for(k = 1; k <= m; k++) {
					c[i][j] += a[i][k] * b[k][j];
				}
				if(j < l-1) {
					System.out.print(c[i][j] + " ");
				}else {
					System.out.print(c[i][j]);
				}
			}
			System.out.println();
		}
		sc.close();
	}
}

