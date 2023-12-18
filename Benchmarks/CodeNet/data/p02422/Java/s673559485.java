import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

		String str1 = input.readLine(); // 命令を実行する文字列
		int n = Integer.parseInt(input.readLine()); // 命令の数
		String com = "", p = "";
		int num1 = 0, num2 = 0;

		StringBuilder sb1 = new StringBuilder(str1);
		StringBuilder sb2 = new StringBuilder();

		for (int i = 0; i < n; i++) {
			String str2 = input.readLine(); // 命令を何行かで受け取る
			String[] str3 = str2.split("\n"); // 改行で文字列に分ける
			for (int j = 0; j < str3.length; j++) {
				int n1 = str3[j].indexOf(" ");
				int n2 = str3[j].indexOf(" ", n1 + 1);
				int n3 = str3[j].indexOf(" ", n2 + 1);
				// コマンドと数字に分ける
				if (n3 == -1) {
					com = str3[j].substring(0, n1);
					num1 = Integer.parseInt(str3[j].substring(n1 + 1, n2));
					num2 = Integer.parseInt(str3[j].substring(n2 + 1));
				}
				// コマンドと数字に分ける（replace）
				else {
					com = str3[j].substring(0, n1);
					num1 = Integer.parseInt(str3[j].substring(n1 + 1, n2));
					num2 = Integer.parseInt(str3[j].substring(n2 + 1, n3));
					p = str3[j].substring(n3 + 1);
				}
				// コマンド別に機能を記述（sb1は変更可能な状態の文字列 ,sb2は出力用）

				// print a b:str の a 文字目から b 文字目までを出力する
				if (com.equals("print")) {
					sb2.append(sb1.substring(num1, num2 + 1) + " \n");
				}
				// reverse a b: str の a 文字目から b 文字目までを逆順にする
				if (com.equals("reverse")) {
					String st1 = sb1.substring(0, num1);
					String st2 = sb1.substring(num2 + 1);
					sb1.delete(0, num1);
					sb1.delete(num2 + 1, sb1.length());
					sb1.reverse();
					sb1.insert(0, st1);
					sb1.append(st2);

				}
				// replace a b p: str の a 文字目から b 文字目までを p に置き換える。
				if (com.equals("replace")) {
					sb1.replace(num1, num2 + 1, p);
				}

			}

		}
		System.out.println(sb2);

	}

}