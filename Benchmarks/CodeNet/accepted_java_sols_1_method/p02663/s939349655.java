import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 入力値保持
		int h1 = sc.nextInt();
		int m1 = sc.nextInt();
		int h2 = sc.nextInt();
		int m2 = sc.nextInt();
		int k = sc.nextInt();
		int ans = 0;

		// 開始時間帯計算
		ans = (h2 * 60 + m2) - (h1 * 60 + m1) - k;

		// 結果出力
		System.out.println(ans);
	}
}