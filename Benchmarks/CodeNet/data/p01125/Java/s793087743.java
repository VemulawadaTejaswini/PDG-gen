import java.util.Scanner;
import java.util.Arrays;

public class Main {
	public static void main(String args[]) {
		new Main().run();
	}
	
	void run() {
		Scanner sc = new Scanner(System.in);
		while(true) {
			final int N = sc.nextInt();
			if(N == 0) break;
			
			boolean[][] field = new boolean[21][21];
			for(int y = 0; y <= 20; y++)
				for(int x = 0; x <= 20; x++)
					field[y][x] = false;
		
			for(int i = 0; i < N; i++) {
				final int x = sc.nextInt();
				final int y = sc.nextInt();
				field[y][x] = true;
			}
			
			final int M = sc.nextInt();
			
			final int[] dx = {0, 1, 0, -1};
			final int[] dy = {1, 0, -1, 0};
			
			int curX = 10;
			int curY = 10;

			for(int i = 0; i < M; i++) {
				char dc = sc.next().charAt(0);
				int l = sc.nextInt();
				
				int d = "NESW".indexOf(dc);

				for(int j = 0; j < l; j++) {
					curX += dx[d];
					curY += dy[d];
					field[curY][curX] = false;
				}
			}
			
			boolean ok = true;

			for(int y = 0; y <= 20; y++)
				for(int x = 0; x <= 20; x++)
					if(field[y][x] == true)
						ok = false;

			System.out.println(ok ? "Yes" : "No");
		}
	}
}