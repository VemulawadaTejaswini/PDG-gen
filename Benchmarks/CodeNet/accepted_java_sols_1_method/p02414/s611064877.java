import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		int n,m,l;
		Scanner scan = new Scanner(System.in);
		n=scan.nextInt();
		m=scan.nextInt();
		l=scan.nextInt();
		int[][] A = new int[n][m];
		int[][] B = new int[m][l];
		long[][] C = new long[n][l];
		
		for(int i=0;i<n;i++)
			for(int j=0;j<m;j++)
				A[i][j]=scan.nextInt();
		
		for(int i=0;i<m;i++)
			for(int j=0;j<l;j++)
				B[i][j]=scan.nextInt();
		
		for(int i=0;i<n;i++)
			for(int j=0;j<l;j++)
				C[i][j]=0;
		
		for(int i=0;i<n;i++){
			for(int j=0;j<l;j++){
				long temp = 0;
				for(int k=0;k<m;k++){
					temp += A[i][k] * B[k][j];
				}
				C[i][j]=temp;
			}
		}
		
		for(int i=0;i<n;i++){
			for(int j=0;j<l-1;j++){
				System.out.print(C[i][j] + " ");
			}
			System.out.println(C[i][l-1]);
		}
	}
}
