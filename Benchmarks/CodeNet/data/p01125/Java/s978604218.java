import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		while(true) {
			int n = stdIn.nextInt();
			if(n == 0) break;
			boolean[][] map = new boolean[21][21];
			for(int i = 0; i < n; i++) {
				int x = stdIn.nextInt();
				int y = stdIn.nextInt();
				map[20-y][x] = true;
			}
			int nx = 10;
			int ny = 10;
			int m = stdIn.nextInt();
			for(int i = 0; i < m; i++) {
				String d = stdIn.next();
				int c = stdIn.nextInt();
				if(d.equals("N")) {
					for(int j = 0; j < c; j++) {
						if(map[ny][nx]) {
							map[ny][nx] = false;
						}
						ny--;
						if(map[ny][nx]) {
							map[ny][nx] = false;
						}
					}
				}
				if(d.equals("S")) {
					for(int j = 0; j < c; j++) {
						if(map[ny][nx]) {
							map[ny][nx] = false;
						}
						ny++;
						if(map[ny][nx]) {
							map[ny][nx] = false;
						}
					}
				}
				if(d.equals("W")) {
					for(int j = 0; j < c; j++) {
						if(map[ny][nx]) {
							map[ny][nx] = false;
						}
						nx--;
						if(map[ny][nx]) {
							map[ny][nx] = false;
						}
					}
				}
				if(d.equals("E")) {
					for(int j = 0; j < c; j++) {
						if(map[ny][nx]) {
							map[ny][nx] = false;
						}
						nx++;
						if(map[ny][nx]) {
							map[ny][nx] = false;
						}
					}
				}
			}
			boolean ans = true;
			for(int i = 0; i < 21; i++) {
				for(int j = 0; j < 21; j++) {
					if(map[i][j]) ans = false;
				}
			}
			System.out.println((ans)?"Yes":"No");
		}
	}

}