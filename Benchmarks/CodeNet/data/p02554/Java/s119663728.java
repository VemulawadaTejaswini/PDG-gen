import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		BigInteger ans = BigInteger.ONE;
		BigInteger q = BigInteger.ONE;
		BigInteger e = BigInteger.ONE;
		BigInteger modnum = BigInteger.ONE;
		for (int i = 0; i < 9; i++) {
			modnum = modnum.multiply(BigInteger.TEN);
		}
		modnum = modnum.add(BigInteger.valueOf(7));
		
		for (int i = 0; i < n; i++) {
			ans = ans.multiply(BigInteger.TEN);
			q = q.multiply(BigInteger.valueOf(9));
			e = e.multiply(BigInteger.valueOf(8));
		}
		System.out.println(ans.subtract(q).subtract(q).add(e).mod(modnum));
	}
}
