import java.util.*;
import java.math.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
		int k = sc.nextInt();
		double result = 0;

		for (int i = 1; i <= n; i++) {
			if (i >= k) {
				result += (n - k + 1) ;
				break;
			}
			int pow = calcPow(i, k);
			//i1つだけ足す
			result += (1 / Math.pow(2, pow)) ;

			// System.out.print(pow + " ");
			// System.out.println(result);
		}

		System.out.println(result/n);

	}

	// 2の何乗以下かを返す
	private static int calcPow(int n, int k) {
		for (int i = 0; i <= 18; i++) {
			if (n >= k) {
				return i;
			}
			n = n * 2;
		}
		return 0;
	}
}
