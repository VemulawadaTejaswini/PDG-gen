import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

/**
 * Super Metropolis
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		int W, H, N;

		words = br.readLine().split(" ");
		W = parseInt(words[0]);
		H = parseInt(words[1]);
		N = parseInt(words[2]);


		int sX, sY, tX, tY;
		int ans = 0;

		line = br.readLine();
		sX = parseInt(line.substring(0, line.indexOf(' ')));
		sY = parseInt(line.substring(line.indexOf(' ') + 1));

		for (int i = 0; i < N - 1; i++) {
			line = br.readLine();
			tX = parseInt(line.substring(0, line.indexOf(' ')));
			tY = parseInt(line.substring(line.indexOf(' ') + 1));

			if ((sX < tX && sY < tY) || (sX > tX && sY > tY)) {
				ans += Math.min(Math.abs(sX - tX), Math.abs(sY - tY))
						+ Math.abs(Math.abs(sX - tX) - Math.abs(sY - tY));
			} else {
				ans += Math.abs(Math.abs(sX - tX) + Math.abs(sY - tY));
			}
			
			sX = tX;
			sY = tY;
		}

		System.out.println(ans);
	}
}