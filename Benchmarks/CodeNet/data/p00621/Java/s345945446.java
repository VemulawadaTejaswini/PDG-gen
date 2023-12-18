import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * Problem A: Sleeping Cats
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		StringBuilder sb = new StringBuilder();
		while (!(line = br.readLine()).equals("0 0")) {
			int l = Integer.parseInt(line.substring(0, line.indexOf(' ')));
			int q = Integer.parseInt(line.substring(line.indexOf(' ') + 1));

			int[] wall = new int[l];
			Arrays.fill(wall, -1);

			StringTokenizer st;
			int c, w, s;
			for (int i = 0; i < q; i++) {
				st = new StringTokenizer(br.readLine());
				if (st.nextToken().equals("s")) {
					c = Integer.parseInt(st.nextToken());
					w = Integer.parseInt(st.nextToken());
					s = sleep(c, w, wall);
					if (s > -1) {
						sb.append(s + "\n");
					} else {
						sb.append("impossible\n");
					}
				} else {
					c = Integer.parseInt(st.nextToken());
					wakeup(c, wall);
				}
			}
			sb.append("END\n");
		}
		System.out.print(sb.toString());
	}

	static int sleep(int cat, int width, int[] wall) {
		int begin = -1;
		int space = 0;
		for (int i = 0; i < wall.length; i++) {
			if (wall[i] == -1) {
				space++;
				if (space == 1)
					begin = i;
				if (space == width)
					break;
			} else {
				space = 0;
				begin = -1;
			}
		}
		if (space == width) {
			for (int i = 0; i < width; i++) {
				wall[begin + i] = cat;
			}
		} else {
			begin = -1;
		}
		return begin;
	}

	static void wakeup(int cat, int[] wall) {
		for (int i = 0; i < wall.length; i++) {
			if (wall[i] == cat)
				wall[i] = -1;
		}
	}
}