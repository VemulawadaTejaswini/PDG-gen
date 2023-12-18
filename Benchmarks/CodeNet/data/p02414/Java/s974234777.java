import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//下ごしらえ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int l = sc.nextInt();
		int[][] A = new int[n][m];
		int[][] B = new int[m][l];
		long[][] C = new long[n][l];
		for(int i=0;i<n;i++) {
			for(int k=0;k<m;k++) A[i][k]=sc.nextInt();
		}
		for(int k=0;k<m;k++) {
			for(int j=0;j<l;j++) B[k][j]=sc.nextInt();
		}

		//計算
		for(int i=0;i<n;i++) {
			for(int j=0;j<l;j++) {
				for(int k=0;k<m;k++) {
					C[i][j] += A[i][k] * B[k][j];
				}
				System.out.print(C[i][j]);
				if(!(j+1==l)) System.out.print(" ");
			}
			System.out.println();
		}
	}

}

