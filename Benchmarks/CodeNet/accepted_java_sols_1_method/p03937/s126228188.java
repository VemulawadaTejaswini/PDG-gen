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

		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				if (j > 0 && i > 0) {
					if (matrix[i - 1][j].equals("#") && matrix[i][j - 1].equals("#")) {
						System.out.println("Impossible");
						return;
					}
				}
			}
		}
		System.out.println("Possible");
	}
}