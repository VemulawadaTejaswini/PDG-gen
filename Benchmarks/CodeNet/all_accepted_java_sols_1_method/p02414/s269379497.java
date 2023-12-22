import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		int m = s.nextInt();
		int l = s.nextInt();
		int gyouretuA[][] = new int [n][m];
		int gyouretuB[][] = new int [m][l];
		long gyouretuC[][] = new long [n][l];
		
		for(int i = 0;i < n; i++){
			for(int j = 0;j < m; j++){
				gyouretuA[i][j] = s.nextInt();
			}
		}
		
		for(int i = 0;i < m; i++){
			for(int j =0; j < l; j++){
				gyouretuB[i][j] = s.nextInt();
			}
		}
		
		for(int i = 0;i < n; i++){
			for(int j = 0; j < l; j++){
				for(int k = 0; k < m; k++){
					gyouretuC[i][j] += gyouretuA[i][k] * gyouretuB[k][j];
				}
			}
		}
		
		for(int i =0;i < n; i++){
			for(int j =0;j < l; j++){
				System.out.print(gyouretuC[i][j]);
				if(j < l - 1)
					System.out.print(" ");
			}
			System.out.println();
			s.close();
		}
	}
}

