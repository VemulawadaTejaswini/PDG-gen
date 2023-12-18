import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		BigInteger n = new BigInteger(sc.next());
		int sqrtn = n.sqrt().intValue();
		int[] sqrtCnt = new int[sqrtn+1];
		int divCnt = 0;
		for (int i = 2; i < sqrtn+1; i++) {
			// 素因数分解
			int cnt = 0;
			if (n.mod(BigInteger.valueOf(i)).equals(BigInteger.ZERO)) {
				cnt++;
				n = n.divide(BigInteger.valueOf(i));
				divCnt++;
			}
			sqrtCnt[i] = cnt;
		}
		int ans = 0;
		for (int i = 0; i < sqrtn+1; i++) {
			ans += sqrtCnt[i];
		}
		if (sqrtn != 1 && divCnt == 0) {
			// nが1以外で素数の場合、自分で割れるため1
			ans++;
		}
		System.out.println(ans);
	}
}
