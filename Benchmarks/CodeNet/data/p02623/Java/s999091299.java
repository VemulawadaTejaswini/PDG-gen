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
		int[] asums = new int[n+1];
		asums[0] = 0;
		int [] bsums = new int[m+1];
		for (int i = 1; i < n + 1; i++) {
			int tmp = sc.nextInt();
			asums[i] = asums[i-1] + tmp;
		}
		sc.nextLine();
		for (int i = 0; i< m; i++) {
			int tmp = sc.nextInt();
			bsums[i] = bsums[i-1] + tmp;
		}
		
		int ans = 0;
		int bstart = m;
		for (int i = 0; i < n + 1; i++) {
			int sum = 0;
			// Aから0冊、1冊、2冊・・・
			sum += asums[i];
			for (int j = bstart; j >= 0; j++) {
				// Bからm冊、m-1冊、m-2冊・・・降順に
				int target = sum + bsums[j];
				if (target <= k) {
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
