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
		int[] as = new int[n];
		int amax = 0;
		int amaxCnt = 0;
		int [] bs = new int[m];
		int bmax = 0;
		int bmaxCnt = 0;
		for (int i = 0; i< n; i++) {
			as[i] = sc.nextInt();
			amax += as[i];
			if (amax > k) {
				amax -= as[i];
				break;
			} else {
				amaxCnt++;
			}
		}
		sc.nextLine();
		for (int i = 0; i< m; i++) {
			bs[i] = sc.nextInt();
			bmax += bs[i];
			if (bmax > k) {
				bmax -= bs[i];
				break;
			} else {
				bmaxCnt++;
			}
		}
		int ans = amaxCnt;
		BigInteger tarV = BigInteger.valueOf(amax);		// 評価対象値
		BigInteger bigK = BigInteger.valueOf(k);
		int bCnt = 0;
		for (int i = amaxCnt; i >= 0; i--) {
			// 初回：評価値はA最大。Bからどれだけ積めるか
			for (int j = bCnt; j < bmaxCnt; j++) {
				// 積む
				tarV = tarV.add(BigInteger.valueOf(bs[j]));
				if (tarV.compareTo(bigK) > 0) {
					if (i + bCnt > ans) {
						ans = i + bCnt;
					}
					break;
				} else {
					bCnt++;
					if (j == bmaxCnt -1 && i + bCnt > ans) {
						ans = i + bCnt;
					}
				}
			}
			tarV = tarV.subtract(BigInteger.valueOf(as[i]));
		}
		System.out.println(ans);
	}
	
}
