import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

	public static void solve (int n, int[] aArray) {

		int max = 0;
		double step_sum = 0;
		for (int i = 0; i < n; i++) {
			// １人目は必ず０
			if (i == 0) {
				max = aArray[i];
				continue;
			}

			// ステップ足し込む
			if (max > aArray[i]) {
				step_sum = step_sum + (max - aArray[i]);
			}

			// 必要であれば最大を入れ替える
			if (aArray[i] > max) {
				max = aArray[i];
			}

		}

//		System.out.println(("" + step_sum).replaceAll("\\.0", ""));
		System.out.println(BigDecimal.valueOf(step_sum).toPlainString().replaceAll("\\.0", ""));

	}

	public static void main(String[] args) {

		long start = System.currentTimeMillis();
	    // 引数で標準入力System.inを指定する
	    Scanner scanner = new Scanner(System.in);
		try {

		    // 1行目を取得(a)
			int n  = scanner.nextInt();
			scanner.nextLine();

			int[] aArray = new int[n];
			for (int i = 0; i < n; i++) {
				aArray[i] = scanner.nextInt();
			}
			scanner.nextLine();

			solve(n, aArray);

		} finally {
		    // Scannerクラスのインスタンスをクローズ
		    scanner.close();
		}
		long end = System.currentTimeMillis();
		// System.out.println((end - start) );
	}


	// ************************************
	// Common
	// ************************************

	private static final int[] changeArrayStringToInt(String line) {

		String[] strArray = line.split(" ");

		int[] intArray = new int[strArray.length];

		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = Integer.parseInt(strArray[i]);
		}
		return intArray;
	}

}
