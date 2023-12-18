import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int k = sc.nextInt();
		sc.nextLine();
		// Aの総時間
		BigInteger[] asums = new BigInteger[n+1];
		asums[0] = BigInteger.ZERO;
		BigInteger [] bsums = new BigInteger[m+1];
		bsums[0] = BigInteger.ZERO;
		
		for (int i = 1; i < n + 1; i++) {
			int tmp = sc.nextInt();
			asums[i] = asums[i-1].add(BigInteger.valueOf(tmp));
		}
		sc.nextLine();
		for (int i = 1; i< m + 1; i++) {
			int tmp = sc.nextInt();
			bsums[i] = bsums[i-1].add(BigInteger.valueOf(tmp));
		}
		
		BigInteger bigK = BigInteger.valueOf(k);
		int ans = 0;
		int bstart = m;
		for (int i = 0; i < n + 1; i++) {
			BigInteger sum = BigInteger.ZERO;
			// Aから0冊、1冊、2冊・・・
			sum = sum.add(asums[i]);
			for (int j = bstart; j >= 0; j--) {
				// Bからm冊、m-1冊、m-2冊・・・降順に
				BigInteger target = sum.add(bsums[j]);
				if (target.compareTo(bigK) <= 0) {
					if (ans < i + j) {
						// 更新
						ans = i + j;
					}
					bstart = j;
					break;
				}
			}
		}
		System.out.println(ans);
	}
	
}
