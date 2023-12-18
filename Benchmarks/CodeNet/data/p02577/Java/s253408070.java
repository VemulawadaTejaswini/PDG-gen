import java.math.BigInteger;
import java.util.Scanner;

// 提出時にclass Main に書き換え
public class Main {
	public static void main(String[] args)  {
		// 標準入力を受け取る
		Scanner sc = new Scanner(System.in);
		BigInteger N = sc.nextBigInteger(); // BigInteger Nを受け取る
		sc.close(); // 標準入力を終了

		long n = 0; // 各桁の数の和
		n = sumDigits(N);

		if(n % 9 == 0) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}

	//sumDigits:負でないint nが与えられた場合、その桁の合計を再帰的に返す。
	public static long sumDigits(BigInteger n) {
		long sum = 0;
		BigInteger z = BigInteger.valueOf(0);
		//自然数の各桁の和を計算
		while (n.compareTo(z) != 0) {
			//sumDigitsは単独ではloopしないので、while loopを使う。
			BigInteger s = n.remainder(BigInteger.TEN);
			sum += s.longValue();
			//再右端の桁を得るために%10を利用する。
			n = n.divide(BigInteger.TEN);
			//再右端の桁を取り除くためにn/=10を利用する。
		}

		return sum;//合計を返す
	}

}