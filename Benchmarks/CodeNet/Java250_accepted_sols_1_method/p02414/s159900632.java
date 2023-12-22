import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int l = scan.nextInt();
		
		long a[][] = new long[n][m];
		long b[][] = new long[m][l];
		long c[][] = new long[n][l];
		
		for(int i = 0; i < n; i++){
			for(int j = 0; j < m; j++){
				a[i][j] = scan.nextLong();
			}
		}
		
		for(int h = 0; h < m; h++){
			for(int k = 0; k < l; k++){
				b[h][k] = scan.nextLong();
			}
		}
		
		for(int p = 0; p < n; p++){
			for(int q = 0; q < l; q++){
				long s = 0;
				for(int r = 0; r < m; r++){
					s = s + a[p][r] * b[r][q];
					c[p][q] = s;
				}
			}
		}
		
		for(int s = 0; s < n; s++){
			for(int t = 0; t < l; t++){
				System.out.print(c[s][t]);
				if(t != l - 1){
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}