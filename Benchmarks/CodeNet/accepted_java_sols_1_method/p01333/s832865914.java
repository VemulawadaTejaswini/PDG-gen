import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		int[] money = {1, 5, 10};
		int[][] charge = new int[1000000][3];
		for (int i = 0; i < charge.length; i++) {
			int j = i;
			for (int k = 2; k >= 0; k--) {
				charge[i][k] += j / money[k];
				if ((j %= money[k]) == 0) {
					break;
				}
			}
		}

		while ((line = br.readLine()) != null && !line.isEmpty()) {
			int a, b, c;
			a = Integer.parseInt(line.substring(0, line.indexOf(' ')));
			b = Integer.parseInt(line.substring(line.indexOf(' ') + 1));
			if ((a | b) == 0) {
				break;
			}
			c = (b - a) / 100;
			System.out.println(charge[c][0] + " " + charge[c][1] + " " + charge[c][2]);
		}
	}
}