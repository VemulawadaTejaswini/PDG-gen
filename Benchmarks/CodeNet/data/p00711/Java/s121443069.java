import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		while (in.hasNext()) {
			int w = in.nextInt();
			int h = in.nextInt();
			if (w != 0 && h != 0) {
				char[][] tile = new char[h + 2][];
				int fx = -1;
				int fy = -1;
				tile[0] = new char[w + 2];
				Arrays.fill(tile[0], '#');
				for (int y = 0; y < h; y++) {
					sb.setLength(0);
					sb.append('#').append(in.next()).append('#');
					String line = sb.toString();
					tile[y + 1] = line.toCharArray();
					if (line.contains("@")) {
						fy = y + 1;
						fx = line.indexOf('@');
					}
				}
				tile[h + 1] = new char[w + 2];
				Arrays.fill(tile[h + 1], '#');
				tile[fy][fx] = '.';
				fill(fx, fy, tile);
				int count = 0;
				for (char[] l : tile) {
					for (char c : l) {
						if (c == '@') count++;
					}
				}
				System.out.println(count);
			} else {
				break;
			}
		}
	}

	private static void fill(int fx, int fy, char[][] tile) {
		if (tile[fy][fx] == '.') {
			tile[fy][fx] = '@';
			fill(fx + 1, fy, tile);
			fill(fx - 1, fy, tile);
			fill(fx, fy + 1, tile);
			fill(fx, fy - 1, tile);
		}
	}
}