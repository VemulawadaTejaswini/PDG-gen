import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		BigInteger n = new BigInteger(sc.next());
		int ans = 0;
		for (BigInteger i = BigInteger.TWO; i.compareTo(n) <= 0; i = i.add(BigInteger.ONE)) {
			// 素因数分解
			if (n.mod(i).equals(BigInteger.ZERO)) {
				n = n.divide(i);
				ans++;
			}
		}

		System.out.println(ans);
	}
}
