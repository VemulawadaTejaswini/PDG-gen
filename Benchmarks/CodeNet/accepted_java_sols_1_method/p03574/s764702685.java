import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split(" ");

		int h = Integer.parseInt(str[0]);
		int w = Integer.parseInt(str[1]);

		String matrix[][] = new String[h][w];

		for (int i = 0; i < h; i++) {
			str = br.readLine().split("");
			for (int j = 0; j < w; j++) {
				matrix[i][j] = str[j];
			}
		}

		String ans[][] = new String[h][w];

		int dx[] = { 1, -1, 1, -1, 1, -1, 0, 0 };
		int dy[] = { 0, 0, 1, 1, -1, -1, 1, -1 };

		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				if (matrix[i][j].equals(".")) {
					int count = 0;
					for (int k = 0; k < 8; k++) {
						int nx = j + dx[k];
						int ny = i + dy[k];

						if (nx >= 0 && nx < w && ny >= 0 && ny < h) {
							if (matrix[ny][nx].equals("#")) {
								count++;
							}
						}
					}
					ans[i][j] = String.valueOf(count);
				} else {
					ans[i][j] = "#";
				}
			}
		}
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				System.out.print(ans[i][j]);
			}
			System.out.println();
		}
	}
}