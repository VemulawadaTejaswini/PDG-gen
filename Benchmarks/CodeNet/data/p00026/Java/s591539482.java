import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	static int[][] grid = new int[14][14];

	static void dropL(int x, int y) {
		grid[x][y-2]++;
		grid[x-1][y-1]++;grid[x][y-1]++;grid[x+1][y-1]++;
		grid[x-2][y]++;grid[x-1][y]++;grid[x][y]++;grid[x+1][y]++;grid[x+2][y]++;
		grid[x-1][y+1]++;grid[x][y+1]++;grid[x+1][y+1]++;
		grid[x][y+2]++;
	}

	static void dropM(int x, int y) {
		grid[x-1][y-1]++;grid[x][y-1]++;grid[x+1][y-1]++;
		grid[x-1][y]++;grid[x][y]++;grid[x+1][y]++;
		grid[x-1][y+1]++;grid[x][y+1]++;grid[x+1][y+1]++;
	}

	static void dropS(int x, int y) {
		grid[x][y-1]++;
		grid[x-1][y]++;grid[x][y]++;grid[x+1][y]++;
		grid[x][y+1]++;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String line;
		while ((line = br.readLine()) != null) {
			String[] terms = line.split(",");
			int x = Integer.parseInt(terms[0]);
			int y = Integer.parseInt(terms[1]);
			int s = Integer.parseInt(terms[2]);

			switch (s) {
			case 1: dropS(x, y); break;
			case 2: dropM(x, y); break;
			case 3: dropL(x, y); break;
			}
		}

		int W = 100, T = 0;
		for (int x = 2 ; x < 12 ; x++) {
			for (int y = 2 ; y < 12 ; y++) {
				if (grid[x][y] > 0) {
					W--;
					T = Math.max(T, grid[x][y]);
				}
			}
		}
		System.out.println(W+"\n"+T);
	}
}