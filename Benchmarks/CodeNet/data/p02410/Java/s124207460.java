import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt(),m=sc.nextInt();
		int[][] A = new int[n][m];
		int[][] B= new int[m][1];

		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				A[i][j]=sc.nextInt();
			}
		}

		for(int i=0;i<m;i++) {
			B[i][0]=sc.nextInt();
		}

		for(int i=0;i<n;i++) {
			int ans =0;
			for(int j=0; j<m;j++) {
				ans += A[i][j]*B[j][0];
			}
			System.out.println(ans);
		}
	}
}
