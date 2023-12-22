import java.util.*;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		int l = sc.nextInt();
		
		int mrxA[][] = new int[n][m];
		int mrxB[][] = new int[m][l];
		long mrxC[][] = new long[n][l];
		
		//??????A??????????????\???
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				mrxA[i][j] = sc.nextInt();
			}
		}
		
		//??????B??????????????\???
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < l; j++) {
				mrxB[i][j] = sc.nextInt();
			}
		}
		
		//??????C????????????????´?
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < l; j++) {
				for(int k = 0; k < m; k++) {
					mrxC[i][j] += (mrxA[i][k] * mrxB[k][j]);
				}
				System.out.print(mrxC[i][j]);
				if(j != l -1) {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}