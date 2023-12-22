import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();

		// 文字列を分割する
		// 4文字の前提
		char[] c = new char[4];

		for (int i = 0; i < 4; i++) {
			c[i] = str.charAt(i);
		}

		// 組み合わせを調べる
		int[] x = { 0, 0, 0, 0 };

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if (i != j) {
					if (c[i] == c[j]) {
						x[i]++;
					}
				}
			}
		}

		// 全て他の1つの文字と同じ値であればOKそれ以外はNG
		boolean chk = true;

		for (int i = 0; i < 4; i++) {
			if (x[i] != 1) {
				chk = false;
			}
		}

		// 結果出力
		if (chk) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}

}
