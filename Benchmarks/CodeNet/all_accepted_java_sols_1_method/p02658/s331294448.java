import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		BigInteger ans = BigInteger.ONE;
		
		BigInteger border = BigInteger.ONE;
		for (int i = 0; i < 18; i++) {
			border = border.multiply(BigInteger.valueOf(10));
		}
		
		boolean overFlg = false;
		for (int i = 0; i < n; i++) {
			if (overFlg) {
				// 0かだけチェック
				if (BigInteger.ZERO.equals(new BigInteger(sc.next()))) {
					ans = BigInteger.ZERO;
					break;
				}
			} else {
				// ボーダー以下
				ans = ans.multiply(new BigInteger(sc.next()));
				if (ans.equals(BigInteger.ZERO)) {
					// 0終了
					break;
				}
				if (ans.compareTo(border) > 0) {
					// ボーダー越え
					ans = BigInteger.valueOf(-1);
					overFlg = true;
				}
			}
		}
		
		System.out.println(ans);
	}
}
