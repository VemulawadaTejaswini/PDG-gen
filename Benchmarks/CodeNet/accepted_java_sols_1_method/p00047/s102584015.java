import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/*
カップゲーム

3 つのカップがふせて置かれています。カップの置かれている場所を、順に A,B,C と呼ぶことにします。
最初は A に置かれているカップの中にボールが隠されているとします。
カップの位置を入れ替えると、中に入っているボールも一緒に移動します。
入れ替える２つのカップの位置を読み込んで、最終的にどの場所のカップにボールが隠されているかを出力するプログラムを作成してください。

Input
　入れ替える２つのカップの位置が順番に複数行にわたり与えられます。
　各行に、入れ替える２つのカップの位置を表す文字（A, B, または C）がカンマ区切りで与えられます。
　入れ替える操作は 50 回を超えません。

Output
　ボールが入っているカップの場所（A, B, または C）を１行に出力します。

Sample Input
B,C
A,C
C,B
A,B
C,B

Output for the Sample Input
A

*/

/**
 * カップゲーム
 *
 * http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=0047
 */
public class Main {

	public static void main(String[] args) throws Exception {
		// キー：カップ名、値：ボールが入っているかどうか　最初はAに入っている
		Map<String, Boolean> cups = new HashMap<>();
		cups.put("A", true);
		cups.put("B", false);
		cups.put("C", false);

		try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
			reader.lines().map(line -> line.split(",")).forEach(pair -> {
				// 二つを入れ替える
				boolean temp = cups.get(pair[1]);
				cups.put(pair[1], cups.get(pair[0]));
				cups.put(pair[0], temp);
			});

			// 入っているカップ（値がtrueのもの）を出力する
			cups.entrySet().forEach(e -> {
				if (e.getValue()) {
					System.out.println(e.getKey());
				}
			});
		}
	}

}

