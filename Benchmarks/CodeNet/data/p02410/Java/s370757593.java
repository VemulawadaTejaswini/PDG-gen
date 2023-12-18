import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner( System.in );
		
		int n	= sc.nextInt();
		int m	= sc.nextInt();
		
		int[][] vectorA = new int[n][m];
		int[]	vectorB = new int[m];
		int[]	vectorC = new int[n];
		
		// input
		for( int i = 0; i < n; i++ ) {
			for( int j = 0; j < m; j++ ) {
				vectorA[i][j] = sc.nextInt();

			}
			
		}
		
		// input
		for( int i = 0; i < m; i++ ) {
			vectorB[i] = sc.nextInt();
			
		}
		
		// calc and output
		for( int i = 0; i < n; i++ ) {
			vectorC[i] = 0;
			for( int j = 0; j < m; j++ ) {	
				vectorC[i] += ( vectorA[i][j] * vectorB[j] );
				
			}
			
			System.out.println( vectorC[i] );
		}
		
		
		
		
	}
	
}