import java.util.*;
 
public class Main {
	
    public static void main( String args[] ) {
        Scanner scan = new Scanner( System.in );

        int n = scan.nextInt();
		int m = scan.nextInt();
		int l = scan.nextInt();
		
		
		int[][] vecA = new int[n][m];
		int[][] vecB = new int[m][l];
		
		// input
		for( int i = 0; i < n; i++ ) {
			for( int j = 0; j < m; j++ ) {
				vecA[i][j] = scan.nextInt();
				
			}
		}
		
		for( int i = 0; i < m; i++ ) {
			for( int j = 0; j < l; j++ ) {
				vecB[i][j] = scan.nextInt();
				
			}
		}
		
		int[][] vecC = new int[n][l];
		for( int i = 0; i < n; i++ ) {
			for( int k = 0; k < l; k++ ) {
				long sum = 0;
				
				for( int j = 0; j < m; j++ ) {
					sum += vecA[i][j] * vecB[j][k];
					
				}
				
				System.out.print((k == 0 ? "" : " ") + sum);
				
			}
			System.out.println();
		}
		
	}
}