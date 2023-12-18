import java.util.Scanner;

public class Main {
	private static final int MAP_SIZE = 100;
	private static final int BLOCK = 99;

	public static void main(String[] arg) {
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			int life = in.nextInt() + 1;
			int n = in.nextInt();
			if (life == 0 && n == 0) {
				break;
			}
			int[][] map = new int[MAP_SIZE * 2 + 1][MAP_SIZE * 2 + 1];
			for (int i = 0; i < n; i++) {
				int x = in.nextInt() + MAP_SIZE;
				int y = in.nextInt() + MAP_SIZE;
				map[x][y] = BLOCK;
			}
			int x = 0, y = 0;
			try {
				x = in.nextInt() + MAP_SIZE;
				y = in.nextInt() + MAP_SIZE;
				System.out.println(setMove(map, x, y, life));
			} catch (Exception e) {
				throw new RuntimeException(x + ":" + y + "\n" + showMap(map));
			}
		}
		in.close();
	}

	private static String showMap(int[][] map) {
		StringBuilder sb = new StringBuilder();
		int sp = 0;
		for (int[] line : map) {
			for (int i = 0; i < MAP_SIZE * 2 - sp; i++) {
				sb.append("  ");
			}
			sp++;
			for (int i : line) {
				sb.append(String.format("[%2d]", i));
			}
			sb.append("\r\n");
		}
		return sb.toString();
	}

	static int setMove(int[][] map, int x, int y, int t) {
		int count = 0;
		if (map[x][y] < t) {
			if (map[x][y] == 0) {
				count++;
			}
			map[x][y] = t;
		} else {
			return 0;
		}
		// System.out.print("x=" + (x - 30) + " y=" + (y - 30) + " " +
		// map[x][y]);
		// System.out.println("=>" + t);
		if (--t > 0) {
			count += setMove(map, x, y - 1, t);
			count += setMove(map, x, y + 1, t);
			count += setMove(map, x - 1, y, t);
			count += setMove(map, x + 1, y, t);
			count += setMove(map, x - 1, y - 1, t);
			count += setMove(map, x + 1, y + 1, t);
		}
		return count;
	}
}