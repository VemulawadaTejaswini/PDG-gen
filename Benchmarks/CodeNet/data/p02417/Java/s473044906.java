import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	static enum alp {
		a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z
	}

	public static void main(String[] args) throws IOException {

		/*	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String teststr = null;
		
			if (br.ready()) {
				teststr += br.readLine();
				System.out.println(teststr);
			}
			System.out.println("endloop");
		*/
		Scanner sc = new Scanner(System.in);

		String str = "";
		
		while (sc.hasNext()) {
			String tmp = sc.nextLine();//文字列入力
			str += tmp;//文字列入力

			if (tmp.equals("")) {
				break;
			}

			//		System.out.println(str);
		}

		//	System.out.println("end:"+str);

		//拡張for文　enum型の中身を1つずつ呼び出し
		for (alp a : alp.values()) {

			//入力を文字単位に分解
			char[] ch = str.toCharArray();//文字単位でリスト化

			int count = 0;

			for (char c : ch) {//配列を呼び出し

				//配列内の文字を文字列に再変換
				String c_str = String.valueOf(c);

				//enumの中身のアルファベットと上で変換した文字列が同じかを比較
				if (a.toString().equalsIgnoreCase(c_str)) {

					count++;
				}

			}

			System.out.println(a.toString() + " : " + count);

		}

	}

}

