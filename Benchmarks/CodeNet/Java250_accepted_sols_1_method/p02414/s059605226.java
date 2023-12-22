
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int l = sc.nextInt();
		long[][] mtx1 = new long[n][m];
		long[][] mtx2 = new long[m][l];
		for(int i = 0; i < n; i++){
			for(int k = 0; k < m; k++){
				mtx1[i][k] = sc.nextLong();
			}
		}
		for(int i = 0; i < m; i++){
			for(int k = 0; k < l; k++){
				mtx2[i][k] = sc.nextLong();
			}
		}
		for(int i = 0; i < n; i++){
			for(int k = 0; k < l; k++) {
				if(k != 0) {
					System.out.print(" ");
				}
				long sum = 0;
				for(int p = 0; p < m; p++){
					sum += mtx1[i][p] * mtx2[p][k];
				}
				System.out.print(sum);
			}
			System.out.println();
		}
	}
}

