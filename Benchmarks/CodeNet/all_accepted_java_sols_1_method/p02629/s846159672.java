import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long num = in.nextLong();
		String s;
		long firstIndexAlpha = (long) 'a'; // アルファベットの最初の文字
		long sizeAlpha = 26; // アルファベットの個数
		if (num <= 0) {
			/* 0以下はブランクで返す */
			

		} else if (num <= sizeAlpha) {
			/* 1～26までの処理 */
			s = String.valueOf((char) (firstIndexAlpha + num - 1));
			System.out.println(s);

		} else {
			/* 27以上の処理 */

			long offset = num - 1; // 0からの連番に補正した値
			long tmp = offset;
			String str = "";
			while (true) {
				long div = tmp / sizeAlpha; // 商
				long mod = tmp % sizeAlpha; // あまり
				/* 1～26までの処理 */
				s = String.valueOf((char) (firstIndexAlpha + mod));
				str = s + str;
				if (div <= 0) {
					break;
				}
				tmp = (div - 1);
			}
			System.out.println(str);

		}
	}
}