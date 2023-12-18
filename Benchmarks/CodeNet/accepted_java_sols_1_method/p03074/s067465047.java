import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		String s = "1" + sc.next();

		int[] ruiseki = new int[s.length() + 1];

		// 累積和配列を作成
		char preChar = s.charAt(0);
		int gIndex = 1;
		int gNum = 0;
		for (int i = 1; i <= s.length(); i++) {
			gNum++;
			ruiseki[gIndex] = gNum;
			if (i < s.length() && preChar != s.charAt(i)) {
				gIndex++;
				preChar = s.charAt(i);
			}
		}

//		System.out.println(ruiseki);
		int max = gIndex == 1 ? n : 0;
		for (int i = 2; i <= gIndex; i += 2) {
//			System.out.println(2 * (k - 1) + i + 1 + ":index");
//			System.out.println(Math.min(2 * (k - 1) + i + 1, gIndex));
//			System.out.println(ruiseki[Math.min(2 * (k - 1) + i + 1, gIndex)] - ruiseki[i - 2] + ":max?");
			if (max < ruiseki[Math.min(2 * (k - 1) + i + 1, gIndex)] - ruiseki[i - 2]) {
				max = ruiseki[Math.min(2 * (k - 1) + i + 1, gIndex)] - ruiseki[i - 2];
				if (i == 2) max--;
			}
		}
		System.out.println(max);
	}
}
