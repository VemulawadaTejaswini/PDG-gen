import java.util.*;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		int l = sc.nextInt();
		
			int mrxA[][] = new int[100][100];
			int mrxB[][] = new int[100][100];
			int mrxC[][] = new int[100][100];
		
		//??????A??????????????\???
		for(int j = 0; j < n; j++) {
			for(int i = 0; i < m; i++) {
				mrxA[i][j] = sc.nextInt();
			}
		}
		
		//??????B??????????????\???
		for(int j = 0; j < m; j++) {
			for(int i = 0; i < l; i++) {
				mrxB[i][j] = sc.nextInt();
			}
		}
		
		//??????C????????????????´?
		for(int i = 0; i < l; i++) {
			for(int j = 0; j < l; j++) {
				for(int k = 0; k < l; k++) {
					mrxC[k][j] = mrxA[i][j] * mrxB[k][i] + mrxC[k][j];
					
				}
			}
		}
		
		//??????
		for(int j = 0; j < n; j++) {
			for(int i = 0; i < l; i++) {
				System.out.print(mrxC[i][j]);
				if(i != l -1) {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		

	}
}