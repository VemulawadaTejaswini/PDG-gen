
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 定型ループ
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int k = sc.nextInt();

		int max = 0;
		if (a >= b) {
			if (a >= c) {
				max = a;
			} else if (b >= c) {
				max = b;
			} else {
				max = c;
			}
		} else {
			if (b >= c) {
				max = b;
			} else {
				max = c;
			}
		}
		int tmp = max;
		for (int i = 0; i < k; i++) {
			tmp = tmp * 2;
		}
		int ans = a + b + c - max + tmp;
		System.out.println(ans);
	}
}
