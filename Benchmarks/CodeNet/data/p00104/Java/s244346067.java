import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new MagicTiles().solve();
	}
	public void solve() {
		Scanner input = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);

		int H, W;
		char[][] maze = new char[101][101];

		while (true) {
			String[] tmp = input.nextLine().split(" ");

			H = Integer.parseInt(tmp[0]);
			W = Integer.parseInt(tmp[1]);
			
			if(H == 0 && W == 0) break;

			for (int i = 0; i < H; i++) {				
					maze[i] = input.nextLine().toCharArray();
			}
			
			int ii = 0, jj = 0;
			
			while(maze[ii][jj] != '.' && maze[ii][jj] != 'X') {
				if(maze[ii][jj] == '>') { maze[ii][jj] = 'X'; jj += 1; continue; }
				if(maze[ii][jj] == '<') { maze[ii][jj] = 'X'; jj -= 1; continue; }
				if(maze[ii][jj] == '^') { maze[ii][jj] = 'X'; ii -= 1; continue; }
				if(maze[ii][jj] == 'v') { maze[ii][jj] = 'X'; ii += 1; continue; }
			}		
			if(maze[ii][jj] == 'X') {
				out.println("LOOP");
			} else {
				out.println(jj + " " + ii);
			}
		}
		input.close();
		out.close();
		System.exit(0);
	}
}