import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int l = sc.nextInt();

		int a[][] = new int[n][m];
		int b[][] = new int[m][l];
		long c[][] = new long[n][l];

		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				a[i][j] = sc.nextInt();
			}
		}

		for(int i=0; i<m; i++) {
			for(int j=0; j<l; j++) {
				b[i][j] = sc.nextInt();
			}
		}

		//ここから行列cの計算

		for(int i=0; i<n; i++) {
			for(int j=0; j<l; j++) {
				for(int k=0; k<m; k++) {
					c[i][j] += a[i][k] * b[k][j];
				}
			}
		}

		for(int i=0; i<n; i++) {
			for(int j=0; j<l; j++) {
				if(j != 0) System.out.print(" ");
				System.out.print(c[i][j]);
			}
			System.out.println();
		}
	}
}

