import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		sc.nextLine();
		
		BigInteger before = BigInteger.ONE;
		BigInteger tmp = BigInteger.ONE;
		BigInteger[] div = new BigInteger[n];
		for (int i = 0; i < n; i++) {
			int tmpScore = sc.nextInt();
			BigInteger ts = new BigInteger(String.valueOf(tmpScore));
			div[i] = ts;
			if (i < k) {
				// k-1まで
				before = before.multiply(ts);
				if (i != 0) {
					tmp = tmp.multiply(ts);
				}
			} else {
				tmp = tmp.multiply(ts);
				if (tmp.compareTo(before) > 0) {
					System.out.println("Yes");
				} else {
					System.out.println("No");
				}
				before = tmp;
				tmp = tmp.divide(div[i-k+1]);
			}
		}
	}
}
