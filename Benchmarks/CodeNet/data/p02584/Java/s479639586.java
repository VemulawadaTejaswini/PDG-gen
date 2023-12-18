import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		BigInteger x = new BigInteger(sc.next());
		BigInteger k = new BigInteger(sc.next());
		BigInteger d = new BigInteger(sc.next());
		BigInteger abs = x.abs();
		BigInteger goal = null;
		
		BigInteger div = x.divide(d);
		if (div.compareTo(k) > 0) {
			goal = abs.subtract(d.multiply(k));
			System.out.println(goal);
		} else if (div.compareTo(k) == 0) {
			goal = abs.subtract(d.multiply(k));
			System.out.println(goal);
		} else {
			// 距離縮める
			abs = abs.subtract(d.multiply(div));
			// 残り試行が奇数か偶数か
			BigInteger exa = k.subtract(div).mod(BigInteger.TWO);
			if (exa.equals(BigInteger.ZERO)) {
				// 偶数回
				goal = abs.abs();
			} else {
				goal = abs.subtract(d).abs();
			}
			System.out.println(goal);
		}
	}
}
