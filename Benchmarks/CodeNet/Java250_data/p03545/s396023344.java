import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 入力1をnに入れる
		String s = sc.next();

		int n = s.length();

		for (int i = 0; i < 1 << n; i++) {
			StringBuilder sb = new StringBuilder(s);

			//ビット全探索で文字列Sに"+ - "を挿入していく
			for (int j = n - 2; j >= 0; j--) {
				if ((1 & i >> j) == 1) {
					sb.insert(j + 1, "+");
				} else {
					sb.insert(j + 1, "-");
				}
			}

			String str = sb.toString();
			int ans = Character.getNumericValue(str.charAt(0));
			//"+ - "入りの文字列をsplitして足し合わせる
			for (int j = 1; j < 2 * n - 2; j= j+2) {
				if (str.charAt(j) == '+') {
					ans += Character.getNumericValue(str.charAt(j+1));
				} else if (str.charAt(j) == '-') {
					ans -= Character.getNumericValue(str.charAt(j+1));
				}
			}

//			System.out.println("sb:" + sb);
//			System.out.println("ans:" + ans);
			if (ans == 7) {
				System.out.println(sb+"="+ans);
				break;
			}
		}
	}
}
