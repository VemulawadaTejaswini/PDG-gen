import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		// 入力
		int n = sc.nextInt();
		int m = sc.nextInt();

		// A行列の入力
		long[][] A = CreateVectorA(n, m);

		// B行列の入力
		long[] b = CreateVectorB(m);

		// 計算
		long[] C = IntegrationVector(A, b);

		//出力
		print(C);

	}

	//Aベクトルを生成
	static long[][] CreateVectorA(int n, int m) {
		long[][] vector = new long[n][m];
		for (int i = 0; i < n; i++) {

			for (int k = 0; k < m; k++) {

				vector[i][k] = sc.nextInt();
			}
		}
		return vector;
	}

	//bベクトルを生成
	static long[] CreateVectorB(int m) {
		long[] vector = new long[m];
		for (int j = 0; j < m; j++) {

			vector[j] = sc.nextInt();
		}
		return vector;
	}

	//Aベクトルとbベクトルの積を計算
	static long[] IntegrationVector(long[][] A, long[] b) {
		long C[]=new long[A.length];
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < b.length; j++) {

				C[i] += A[i][j] * b[j];
			}
			
		}
		return C;
	}

	//表示処理
	static void print(long[] C) {
		for (int i = 0; i < C.length; i++) {
			//出力
			System.out.println(C[i]);
		}
	}

}

