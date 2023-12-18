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
		
		int m1r = n;
		int m1c = m;
		int m2r = m;
		int m2c = l;
		
		for (int i=0; i<n; i++){
			for (int j=0; j<m; j++) {
				m1[i][j]=sc.nextInt();
			}
		}
		
		for (int i=0; i<m; i++){
			for (int j=0; j<l; j++) {
				m2[i][j]=sc.nextInt();
			}
		}
		
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < l; j++) {
				ans[i][j] = 0;
			}
		}
		
		for (int i=0; i<m1r; i++) {
			for (int j=0; j<m2c; j++) {
				for (int k=0; k<m1c; k++){
					ans[i][j] += m1[i][k] * m2[k][j];
				}
			}
		}
		
		
		
		
		for(int i=0; i<n; i++){
			for(int j=0; j<l; j++){
				System.out.print(ans[i][j]+" ");
			}
			System.out.println("");
		}
		
		

		 
	} 
}



