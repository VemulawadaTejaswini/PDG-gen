import java.util.Scanner;

public class Main {
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		int width, length;
		int tile[][];
		int mark[][];

		while (true) {
			length = sc.nextInt();
			width = sc.nextInt();
			if ((width | length) == 0) {
				break;
			}
			tile = new int[length][width];
			mark = new int[length][width];
			for (int i = 0; i < length; i++) {
				String s = sc.next();
				for (int j = 0; j < width; j++) {
					tile[i][j] = s.charAt(j);
				}
			}
			int x = 0;
			int y = 0;
			mark[y][x] = 1;
			while (true) {
				if (tile[y][x] == '>') {
					x++;
				} else if (tile[y][x] == '<') {
					x--;
				} else if (tile[y][x] == '^') {
					y--;
				} else if (tile[y][x] == 'v') {
					y++;
				} else if (tile[y][x] == '.') {
					System.out.println(x + " " + y);
					break;
				}
				if (mark[y][x] == 1) {
					System.out.println("LOOP");
					break;
				}
				mark[y][x] = 1;
			}
		}
	}
}