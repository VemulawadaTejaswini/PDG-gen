import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		//input H and W
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();

		//prepare input and answer string as array
		char[][] mines = new char[h + 2][w + 2];
		char[][] ans = new char[h][w];

		//initialize mines
		for (int i = 0; i < h + 2; i++) {
			for (int j = 0; j < w + 2; j++) {
				mines[i][j] = '.';
			}
		}

		//fill mines
		for (int i = 0; i < h; i++) {
			//read string and convert it array
			String s = sc.next();
			char[] line = s.toCharArray(); //string -> char array
			for (int j = 0; j < w; j++) {
				if (line[j] == '#') {
					mines[i + 1][j + 1] = '#';
				} else {
					mines[i + 1][j + 1] = '.';
				}
			}
		}
		//fill answer
		for (int i = 1; i < h + 1; i++) {
			for (int j = 1; j < w + 1; j++) {
				int counter = 0;
				//mineがある場所の答えはそのままmine
				if (mines[i][j] == '#') {
					ans[i - 1][j - 1] = '#';
				} else {
					//前後左右のmineの数をcountに入れる
					for (int k = i - 1; k <= i + 1; k++) {
						for (int k2 = j - 1; k2 <= j + 1; k2++) {
							if (mines[k][k2] == '#') {
								counter++;
							}
						}
					}
					//char配列のansにintデータを入れるために、char型にキャスト
					ans[i - 1][j - 1] = (char) ('0' + counter);
				}
			}
		}

		for (int i = 0; i < h; i++) {
			String output = new String(ans[i]);
			System.out.println(output);
		}
		sc.close();
	}
}
