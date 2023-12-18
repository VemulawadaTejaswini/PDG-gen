import java.math.BigInteger;
import java.util.Scanner;

// 提出時にclass Main に書き換え
public class Main {
	public static void main(String[] args)  {
		// 標準入力を受け取る
		Scanner sc = new Scanner(System.in);
		BigInteger N = sc.nextBigInteger(); // BigInteger Nを受け取る
		sc.close(); // 標準入力を終了

		// Nを9で割った数の余り
		BigInteger m = N.remainder(BigInteger.valueOf(9));

		if(m.compareTo(BigInteger.ZERO) == 0) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}