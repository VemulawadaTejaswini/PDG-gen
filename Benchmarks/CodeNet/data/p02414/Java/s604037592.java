import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		//入力
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int l = scanner.nextInt();

		//配列nm,ml
		int[][] nm = new int[n][m];
		int[][] ml = new int[m][l];

		//nm入力
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				nm[i][j] = scanner.nextInt();
			}
		}
		//ml入力
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < l; j++) {
				ml[i][j] = scanner.nextInt();
			}
		}

		//n*lをm回繰り返しsumに計上。sumをn*l回繰り返し出力
		for(int i=0; i<n; i++) {
			
			for(int j=0; j<l; j++) {
				
				long sum = 0;
				for(int k=0; k<m; k++) {
					
					sum += nm[i][k] * ml[k][j];
					
				}
				if(j == 0) {
					System.out.print(sum);
				}else {
					System.out.print(" " + sum);
				}
			}
							System.out.println();
		}
	}
}
