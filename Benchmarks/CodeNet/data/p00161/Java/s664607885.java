import static java.lang.Integer.MAX_VALUE;
import static java.lang.Integer.MIN_VALUE;
import static java.lang.Integer.parseInt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Sport Meet
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		while (!(line = br.readLine()).equals("0")) {

			int[][] min = { { 0, MAX_VALUE }, { 0, MAX_VALUE } };
			int[][] max = { { 0, MIN_VALUE }, { 0, MIN_VALUE } };
			int n = Integer.parseInt(line);
			for (int i = 0; i < n; ++i) {
				line = br.readLine();
				int team = parseInt(line.substring(0, line.indexOf(' ')));
				int sec = seconds(line.substring(line.indexOf(' ') + 1));

				//
				if (sec < min[0][1]) {
					min[1][0] = min[0][0];
					min[1][1] = min[0][1];
					min[0][0] = team;
					min[0][1] = sec;
				} else if (sec > min[0][1] && sec < min[1][1]) {
					min[1][0] = team;
					min[1][1] = sec;
				} else if (sec > max[0][1]) {
					max[1][0] = max[0][0];
					max[1][1] = max[0][1];
					max[0][0] = team;
					max[0][1] = sec;
				} else if (sec < max[0][1] && sec > max[1][1]) {
					max[1][0] = team;
					max[1][1] = sec;
				}
			}
			System.out.print(String.format("%d\n%d\n%d\n", min[0][0],
					min[1][0], max[1][0]));
		}
	}

	static int seconds(String info) {
		StringTokenizer st = new StringTokenizer(info);
		int min = 0, sec = 0;
		for (int i = 0; i < 8; ++i) {
			if (i % 2 == 0) {
				min += parseInt(st.nextToken());
			} else {
				sec += parseInt(st.nextToken());
			}
		}
		return min * 60 + sec;
	}

}