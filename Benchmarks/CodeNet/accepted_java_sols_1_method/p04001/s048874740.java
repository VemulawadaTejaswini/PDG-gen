import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 入力1をnに入れる
		String s = sc.next();

		int n = s.length() -1;
		long ans = 0;

		for (int i=0; i< 1 << n;i++) {

			//ビット全探索で文字列Sに"+"を挿入していく
			StringBuilder sb = new StringBuilder(s);
			for (int j=n-1; j>=0; j--) {
				if ((1 & i >> j) == 1) {
					sb.insert(j+1, "+");
				}
			}

			//"+"入りの文字列をsplitして足し合わせる
			String[] str = sb.toString().split("\\+",0);
			for (int j=0; j<str.length;j++) {
				ans += Long.parseLong(str[j]);
			}
		}

		System.out.println(ans);

	}
}