import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n= stdIn.nextInt();
		int m= stdIn.nextInt();
		int l= stdIn.nextInt();
		long x[][] = new long[n][m];
		long y[][] = new long[m][l];
		long z=0;
		for(int i=0;i<n; i++) {
			for(int j=0;j<m; j++) {
				x[i][j] = stdIn.nextInt();
			}
		}
		for(int i=0;i<m; i++) {
			for(int j=0;j<l; j++) {
				y[i][j] = stdIn.nextInt();
			}
		}
		stdIn.close();
		for(int i=0;i<n; i++) {
			for(int j=0;j<l; j++) {
				z=0;
				for(int k=0;k<m; k++) {
					z +=x[i][k] * y[k][j];
				}
				System.out.print(z);
				if (j != l-1) {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}

