import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		BigInteger modnum = BigInteger.ONE;
		for (int i = 0; i < 9; i++) {
			modnum = modnum.multiply(BigInteger.TEN);
		}
		modnum = modnum.add(BigInteger.valueOf(7));
		
		BigInteger ans = BigInteger.ONE;
		BigInteger q = BigInteger.ONE;
		BigInteger e = BigInteger.ONE;
		
		for (int i = 0; i < n; i++) {
			ans = ans.multiply(BigInteger.TEN).mod(modnum);
			q = q.multiply(BigInteger.valueOf(9)).mod(modnum);
			e = e.multiply(BigInteger.valueOf(8)).mod(modnum);
		}
		System.out.println(ans.subtract(q).subtract(q).add(e).mod(modnum));
	}
}
