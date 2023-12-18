import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int l = scan.nextInt();
		long[][] a = new long[n][m];
		long[][] b = new long[m][l];
		//aの配列を格納する
		for(int i = 0; i < n; i++){
			for(int j = 0; j < m; j++){
				a[i][j] = scan.nextInt();
			}
		}
		//bの配列を格納する
		for(int i = 0; i < m; i++){
			for(int j = 0; j < l; j++){
				b[i][j] = scan.nextInt();
			}
		}
		//cを出力するためにa[i][k]*b[k][j]を計算して出力をする
		for(int i = 0; i < n; i++){
			for(int j = 0; j < l; j++){
				long c = 0;
				for(int k = 0; k < m; k++){
					c += a[i][k] * b[k][j];
				}
				if(j != 0) System.out.print(" ");
				System.out.print(c);
			}
			if(i != n) System.out.println();
		}
	}
}