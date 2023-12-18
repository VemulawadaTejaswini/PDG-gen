import java.util.Scanner;
import java.util.Arrays;

public class Main { 
	
	
	
	public static void main(String[] args) { 
		
		Scanner sc = new Scanner(System.in); 
			
		int n = sc.nextInt(); 
		int m = sc.nextInt(); 
		int l = sc.nextInt();
		
		int[][] m1 = new int[n][m];
		int[][] m2 = new int[m][l];
		int[][] ans = new int[n][l];

		
		// read matrix 1
		for (int i=0; i<n; i++){
			for (int j=0; j<m; j++) {
				m1[i][j]=sc.nextInt();
			}
		}
		
		// read matrix 2
		for (int i=0; i<m; i++){
			for (int j=0; j<l; j++) {
				m2[i][j]=sc.nextInt();
			}
		}
		
		// fill zero's in result matrix
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < l; j++) {
				ans[i][j] = 0;
			}
		}
		
		// calculate answer matrix
		for (int i=0; i<n; i++) {
			for (int j=0; j<l; j++) {
				for (int k=0; k<m; k++){
					ans[i][j] += m1[i][k] * m2[k][j];
				}
			}
		}
		
		// Print answer matrix ................................. PRESENTATION ERROR
		
		
		for(int i=0; i<n; i++){
			for(int j=0; j<l; j++){
				System.out.print(ans[i][j]+" ");
			}
			
			
			
			
			if (i == n-1){
				break;
			} else {
				System.out.println();
			}
				
		}
		
		

		 
	} 
}



