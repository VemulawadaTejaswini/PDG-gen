import java.util.*;

public class Main {
	public static void main(String[] args) {

		// 入力
		Scanner sc = new Scanner(System.in);
		
		// 数値
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int k = sc.nextInt();
		
		int max = a;
		if (b > max) {
			max = b;
		}
		if (c > max) {
			max = c;
		}
		
		int x = max;
		for (int i = 0; i < k; i++) {
			x = x*2;
		}

		int ans = x + a + b + c - max;

		// 出力
		System.out.println(ans);

		sc.close();

	}
}