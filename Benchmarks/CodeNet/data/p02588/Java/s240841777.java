import java.math.BigDecimal;
import java.util.Scanner;

// 提出時にclass Main に書き換え
public class Main {
	public static void main(String[] args)  {
		// 標準入力を受け取る
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // int Nを受け取る
		double A[] = new double[N]; // 実数Aを受け取るための配列

		int ans = 0; // 積が整数であるような添字のペアの個数

		for (int i = 0; i < N; i++) {
			A[i] = sc.nextDouble(); // 実数A[i]をString型で受け取る
		}
		sc.close(); // 標準入力を終了

		for (int i = 0; i < N; i++) {
			for (int j = N - 1; j > i; j--) {
				BigDecimal ai = BigDecimal.valueOf(A[i]); // double を BigDecimalに変換
				BigDecimal aj = BigDecimal.valueOf(A[j]);
				BigDecimal variable = ai.multiply(aj); // AiとAjの積
				BigDecimal variableInt = variable.setScale(0,BigDecimal.ROUND_DOWN); // 積の整数部分
				if(variable.compareTo(variableInt) == 0) {
					// variableが整数なら、整数化しても値は等しくなる
					ans += 1;
				}
			}
		}

		System.out.println(ans);
	}

}