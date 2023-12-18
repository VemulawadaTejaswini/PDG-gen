
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int w, h;
		while (((w = s.nextInt()) != 0 && ((h = s.nextInt()) != 0))) {
			int[][] t = new int[h+1][w+2];
			int[][] d = new int[h+1][w+2];
			for (int y = 0; y <= h; y++)
				for (int x = 0; x <= w+1; x++) {
					if (1 <= x && x <= w && 1 <= y && y <= h) t[y][x] = s.nextInt();
					else t[y][x] = -1;
					d[y][x] = 0;
				}
			
			for (int x = 1; x <= w; x++) 
				if (t[1][x] == 0) d[1][x] = 1;

			for (int y = 2; y <= h; y++) 
				for (int x = 1; x <= w; x++) {
					if (t[y][x] == 0) {
						if (t[y-1][x-1] == 0) d[y][x] += d[y-1][x-1];
						if (t[y-1][x+1] == 0) d[y][x] += d[y-1][x+1];
					}
					if (t[y][x] != 1) {
						if (t[y-1][x] == 0) d[y][x] += d[y-1][x];
						if (t[y-2][x] == 2) d[y][x] += d[y-2][x];
					}
				}

			int sum = 0;
			for (int x = 1; x <= w; x++) sum += d[h][x];
			for (int x = 1; x <= w; x++) 
				if (t[h-1][x] == 2) sum += d[h-1][x];
			System.out.println(sum);
		}
	}
}