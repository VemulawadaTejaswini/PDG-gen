import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		BigInteger n = new BigInteger(a);
		BigInteger n2 = new BigInteger(a);
		BigInteger sqrt = n.sqrt();
		int ans = 0;
		List<BigInteger> divNums = new ArrayList<BigInteger>();
		for (BigInteger i = BigInteger.TWO; i.compareTo(sqrt) <= 0; i = i.add(BigInteger.ONE)) {
			// 素因数分解
			if (n.mod(i).equals(BigInteger.ZERO)) {
				n = n.divide(i);
				ans++;
				divNums.add(i);
			}
		}
		if (!n2.equals(BigInteger.ONE)) {
			// 1以外
			if (ans == 0) {
				// 割れないまま平方根越え→素数
				ans++;
			} else if (!n.equals(BigInteger.ONE)) {
				// 割ったけど、割り切れてない
				if (!divNums.contains(n)) {
					// 残りが割ってない数
					ans++;
				}
			}
		}


		System.out.println(ans);
	}
}
