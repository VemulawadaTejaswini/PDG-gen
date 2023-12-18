import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		boolean hasNext = true;
		while (hasNext) {
			int h = in.nextInt();
			int w = in.nextInt();
			if (w == 0 && h == 0) {
				hasNext = false;
			} else {
				char[][] map = new char[h][w];
				for (int y = 0; y < h; y++) {
					char[] line = in.next().toCharArray();
					map[y] = line;
				}
				int x = 0, y = 0;
				boolean isLoop = false;
				while (map[y][x] != '.' && !isLoop) {
					char c = map[y][x];
					map[y][x] = '#';
					if (c == '>') {
						x++;
					} else if (c == '<') {
						x--;
					} else if (c == 'v') {
						y++;
					} else if (c == '^') {
						y--;
					} else if (c == '#') {
						isLoop = true;
					}
				}
				if (isLoop) {
					System.out.println("LOOP");
				} else {
					System.out.print(x);
					System.out.print(' ');
					System.out.print(y);
					System.out.println();
				}
			}
		}
	}
}