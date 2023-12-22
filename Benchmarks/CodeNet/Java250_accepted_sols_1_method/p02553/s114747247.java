import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		BigInteger ans = BigInteger.ONE;
		BigInteger ans1 = ans.multiply(BigInteger.valueOf(a)).multiply(BigInteger.valueOf(c));
		BigInteger ans2 = ans.multiply(BigInteger.valueOf(a)).multiply(BigInteger.valueOf(d));
		BigInteger ans3 = ans.multiply(BigInteger.valueOf(b)).multiply(BigInteger.valueOf(c));
		BigInteger ans4 = ans.multiply(BigInteger.valueOf(b)).multiply(BigInteger.valueOf(d));
		if (ans1.compareTo(ans2) >= 0) {
			// 2 < 1
			if (ans1.compareTo(ans3) >= 0) {
				if (ans1.compareTo(ans4) >= 0) {
					System.out.println(ans1);
				} else {
					System.out.println(ans4);
				}
			} else {
				if (ans3.compareTo(ans4) >= 0) {
					System.out.println(ans3);
				} else {
					System.out.println(ans4);
				}
			}
		} else {
			if (ans2.compareTo(ans3) >= 0) {
				if (ans2.compareTo(ans4) >= 0) {
					System.out.println(ans2);
				} else {
					System.out.println(ans4);
				}
			} else {
				if (ans3.compareTo(ans4) >= 0) {
					System.out.println(ans3);
				} else {
					System.out.println(ans4);
				}
			}
		}
	}
}
