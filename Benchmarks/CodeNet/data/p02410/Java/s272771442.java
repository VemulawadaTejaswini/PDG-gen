import java.util.Scanner;
public class Main {
	/**
	 * ベクトルと行列の積を求める
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();	//行数
		int m = scan.nextInt();	//列数
		int[][] a = new int[n][m];	//行列A
		//行列Aへ入力された数字を格納する
		for(int i = 0; i < n; i++){
			for(int j = 0; j < m; j++){
				a[i][j] = scan.nextInt();
			}//for
		}//for
		//列ベクトルbへ入力された数字を格納する
		int[] b = new int[m];
		for(int j = 0; j < m; j++){
			b[j] = scan.nextInt();
		}//for
		//計算と出力
		for(int i = 0; i < n; i++){
			int sum = 0;
			for(int j = 0; j < m; j++){
				sum += a[i][j] * b[j];
			}//for
			System.out.println(sum);
		}//for
	}
}