import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	static class Coord {
		public int r, c;
		
		public Coord(int r, int c) {
			this.r = r;
			this.c = c;
		}
		
		public boolean equals(Object obj) {
			Coord other = (Coord)obj;
			return this.r == other.r && this.c == other.c;
		}
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int h = in.nextInt();
		int w = in.nextInt();
		int m = in.nextInt();
		
		int[] rows = new int[h];
		int[] cols = new int[w];
		List<Coord> targets = new ArrayList<Coord>();
		
		for (int i = 0; i < m; i++) {
			int r = in.nextInt();
			int c = in.nextInt();
			targets.add(new Coord(r,c));
			rows[r - 1]++;
			cols[c - 1]++;
		}
		
		int maxR = 0;
		for (int r = 0; r < h; r++) {
			maxR = Math.max(maxR, rows[r]);
		}
		
		int maxC = 0;
		for (int c = 0; c < w; c++) {
			maxC = Math.max(maxC, cols[c]);
		}
		
		int max = 0;
		for (int r = 0; r < h; r++) {
			for (int c = 0; c < w; c++) {
				if (rows[r] == maxR && cols[c] == maxC) {
					int current = targets.contains(new Coord(r + 1,c + 1)) ? maxR + maxC - 1 : maxR + maxC;
					max = Math.max(current, max);
				}
			}
		}
		
		System.out.println(max);
		
		in.close();
	}
}
