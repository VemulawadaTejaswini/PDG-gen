import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		// 入力
		int k = sc.nextInt();

		int ans = 0;

		//kが偶数か
		if (k / 2 == 0) {
			ans = (k/2) * (k/2);
		} else {
			ans = ((k+1)/2) * (k/2);
		}

		// 出力
		System.out.println(ans);
	}
}