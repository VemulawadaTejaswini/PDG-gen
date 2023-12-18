import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		// 1行目入力
		int n = sc.nextInt();
		int m = sc.nextInt();
		int l = sc.nextInt();

		// 行列の生成と行列内容入力
		long[][] A = CreateMatrix(n, m);
		long[][] B = CreateMatrix(m, l);

		// 行列の積計算
		long[][] C = MatrixMultiplication(A, B);

		// 表示処理
		Print(C);

	}

	// 行列生成と行列内容入力、行列(long2次元配列)を返す
	static long[][] CreateMatrix(int y, int x) {
		long[][] Matrix = new long[y][x];
		for (int i = 0; i < y; i++) {

			for (int k = 0; k < x; k++) {

				// 入力
				Matrix[i][k] = sc.nextInt();
			}
		}
		return Matrix;
	}

	// 行列の積計算し、計算結果の行列(long二次元配列)を返す
	static long[][] MatrixMultiplication(long[][] A, long[][] B) {
		long[][] C = new long[A.length][B[0].length];
		for (int k = 0; k < B.length; k++) {

			for (int i = 0; i < A.length; i++) {

				for (int j = 0; j < B[0].length; j++) {

					C[i][j] += A[i][k] * B[k][j];
				}
			}
		}
		return C;
	}

	// 表示処理
	static void Print(long[][] C) {
		// System.out.println(C.length);
		for (int i = 0; i < C.length; i++) {
			System.out.print(C[i][0]);
			for (int j = 1; j < C[0].length; j++) {
				// 数字の間にスペースを入れる
				System.out.print(" " + C[i][j]);
			}
			System.out.println();

		}
	}

}

