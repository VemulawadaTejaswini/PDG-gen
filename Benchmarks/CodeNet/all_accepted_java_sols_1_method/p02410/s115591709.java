import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int m = scan.nextInt();
		scan.nextLine();
		int[][] A = new int[n][m];
		int[][] B = new int[m][1];
		
		for (int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				A[i][j] = scan.nextInt();
			}
			scan.nextLine();
		}
		
		for (int i=0; i<m; i++) {
			B[i][0] = scan.nextInt();
			scan.nextLine();
		}
		
		for (int i=0; i<n; i++) {
			int sum=0;
			for(int j=0; j<m; j++) {
				sum += A[i][j] * B[j][0];
			}
			System.out.println(sum);
		}
	}
}

