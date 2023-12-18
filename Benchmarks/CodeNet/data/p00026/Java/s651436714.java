import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// 10*10マス目の紙
		int paper[][] = new int[10][10];
		// 色がついてないマス目の個数
		int emptySpace = 0;
		// 1番濃いマス目の濃さ
		int max = 0;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();

		while (str != null) {
			// 文字列を指定した区切り文字(",")によって分割し,それぞれの配列の要素として格納する
			String[] strList = str.split(",");
			int x = Integer.parseInt(strList[0]);
			int y = Integer.parseInt(strList[1]);
			int size = Integer.parseInt(strList[2]);

			// 滴下メソッド
			Main main = new Main();
			main.drop(paper, x, y, size);
		}

		// 色のついてない部分のマス目の個数と、1番濃いマス目の濃さを格納
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if (paper[i][j] == 0) {
					emptySpace += 1;
				}
				if (paper[i][j] > max) {
					max = paper[i][j];
				}
			}
		}

		System.out.println(emptySpace);
		System.out.println(max);
	}

	// ぞれぞれのサイズに合わせた滴下メソッド呼び出す
	public void drop(int paper[][], int x, int y, int size) {
		if (size == 1) {
			drop1(paper, x, y);
		}

		if (size == 2) {
			drop2(paper, x, y);
		}

		if (size == 3) {
			drop3(paper, x, y);
		}
	}

	// サイズ小の滴下メソッド
	public void drop1(int paper[][], int x, int y) {
		paper[x][y] += 1;
		if (x + 1 < 10) {
			paper[x + 1][y] += 1;
		}
		if (x - 1 > -1) {
			paper[x - 1][y] += 1;
		}
		if (y + 1 < 10) {
			paper[x][y + 1] += 1;
		}
		if (y - 1 > -1) {
			paper[x][y - 1] += 1;
		}
	}

	// サイズ中の滴下メソッド
	public void drop2(int paper[][], int x, int y) {
		drop1(paper, x, y);
		if (x + 1 < 10 && y + 1 < 10) {
			paper[x + 1][y + 1] += 1;
		}
		if (x + 1 < 10 && y - 1 > -1) {
			paper[x + 1][y - 1] += 1;
		}
		if (x - 1 > -1 && y + 1 < 10) {
			paper[x - 1][y + 1] += 1;
		}
		if (x - 1 > -1 && y - 1 > -1) {
			paper[x - 1][y - 1] += 1;
		}
	}

	// サイズ大の滴下メソッド
	public void drop3(int paper[][], int x, int y) {
		drop1(paper, x, y);
		drop2(paper, x, y);

		if (x + 2 < 10) {
			paper[x + 2][y] += 1;
		}
		if (x - 2 > -1) {
			paper[x - 2][y] += 1;
		}
		if (y + 2 < 10) {
			paper[x][y + 2] += 1;
		}
		if (y - 2 > -1) {
			paper[x][y - 2] += 1;
		}

	}

}