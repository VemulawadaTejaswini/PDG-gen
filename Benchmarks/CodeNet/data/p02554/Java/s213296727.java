import java.util.*;

public class Main {
	public static void main(String[] args) {
		// ABC081A
		Scanner sc = new Scanner(System.in);
		// スペース区切りの整数の入力
		long n = sc.nextInt();

		long out = 0;

		if (n == 1)
			out = 0;
		else {
			for (int i = 2; i <= n; i++) {
				long tmp=1;
				for (int j = 0; j < i; j++) {
					tmp *= (n - j);
				}
				for (int j = 0; j < i; j++) {
					tmp /= (i - j);
				}
//				tmp = tmp % 1000000007;
				tmp *= (Math.pow(2, i) - 2);
//				tmp = tmp % 1000000007;
				tmp *= Math.pow(8, n - i);

				out += tmp;
				out = out % 1000000007;
			}

		}
		// 出力
		System.out.println(out);

		sc.close();
	}
}
