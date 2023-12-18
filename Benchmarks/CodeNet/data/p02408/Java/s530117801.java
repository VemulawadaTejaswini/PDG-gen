import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		Boolean[][] is = new Boolean[4][13];
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 13; j++) {
				is[i][j] = false;
			}
		}
		int n = Integer.parseInt(str);
		for (int i = 0; i < n; i++) {
			str = br.readLine();
			String[] card = str.split(" ");
			if (card[0].equals("S")) {
				int k = Integer.parseInt(card[1]);
				is[0][k - 1] = true;
			} else if (card[0].equals("H")) {
				int k = Integer.parseInt(card[1]);
				is[1][k - 1] = true;
			} else if (card[0].equals("C")) {
				int k = Integer.parseInt(card[1]);
				is[2][k - 1] = true;
			} else {
				int k = Integer.parseInt(card[1]);
				is[3][k - 1] = true;
			}
		}
		String[] mark = { "S", "H", "C", "D" };
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 13; j++) {
				if (!is[i][j]) {
					System.out.println(mark[i] + " " + (j + 1));
				}
			}
		}
	}
}