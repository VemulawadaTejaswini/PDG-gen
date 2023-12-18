import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int l = sc.nextInt();
		int [][] a = new int[n][m];
		int [][] b = new int[m][l];
		int [][] c = new int[n][l];
		for (int i=0;i<n; i++){
			for (int j=0; j<m; j++){
				a[i][j]=sc.nextInt();
			}
		}
		for (int j=0;j<m; j++){
			for (int k=0; k<l; k++){
				b[j][k]=sc.nextInt();
			}
		}
		for (int i=0; i<n; i++){
			for (int j=0; j<l; j++){
				for (int k=0;k<m; k++){
					c[i][j] += a[i][k] * b[k][j];
				}
				System.out.print(c[i][j]);
				if(j!=l-1)System.out.print(" ");
			}
			System.out.println();
		}
	}
}