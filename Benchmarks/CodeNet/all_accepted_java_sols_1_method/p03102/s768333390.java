import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		// ソースコードの数を取得
		int numN = sc.nextInt();

		// ソースコードの特徴の数を取得
		int numM = sc.nextInt();

		// 演算用値Cを取得
		int numC = sc.nextInt();

		// ソースコードの特徴の数分ループ
		int[] arrayBn = new int[numM];
		for (int i = 0; i < numM; i++) {
			// 演算用の整数Bnをint型配列に取得
			arrayBn[i] = sc.nextInt();
		}

		// ソースコードの数分ループ
		int[][] arrayAn = new int[numN][numM];
		for (int i = 0; i < numN; i++) {
			for (int j = 0; j < numM; j++) {
				// ソースコードの特徴をint型2次元配列に取得
				arrayAn[i][j] = sc.nextInt();
			}
		}

		// ソースコードの数分ループ
		int[] arrayResult = new int[numN];
		for (int i = 0; i < numN; i++) {
			int value = 0;
			for (int j = 0; j < numM; j++) {
				// int型2次元配列を行単位で演算
				value = value + arrayAn[i][j] * arrayBn[j];
			}
			// 結果をint型配列に格納（1:正答する、0:正答しない）
			value = value + numC;
			if (value > 0) {
				// 正答する
				arrayResult[i] = 1;
			} else {
				// 正答しない
				arrayResult[i] = 0;
			}
		}

		// ソースコードの数分ループ
		int count = 0;
		for (int i : arrayResult) {
			if (i == 1) {
				count++;
			}
		}
		System.out.println(count);

		sc.close();
	}
}
