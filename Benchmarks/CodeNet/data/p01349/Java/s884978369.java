import java.util.*;
import static java.lang.System.*;

public class Main {

	Scanner sc = new Scanner(in);
	int h, w, n;
	char[][] b;
	
	int[] dx = {0, 0, 1, -1};
	int[] dy = {1, -1, 0, 0};
	boolean delete() {
		boolean[][] check = new boolean[h][w];
		boolean flag = false;
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				if (b[i][j] != '.') {
					char c = b[i][j];
					int count;
					for (int k = 0; k < 4; k++) {
						count = 1;
						while (0 <= i+count*dx[k] && i+count*dx[k] < h && 0 <= j+count*dy[k] && j+count*dy[k] < w && c == b[i+count*dx[k]][j+count*dy[k]])
							count++;
						if (count >= n) {
							flag = true;
							for (int l = 0; l < count; l++) {
								check[i+l*dx[k]][j+l*dy[k]] = true;
							}
						}
					}
				}
			}
		}
		
		for (int i = 0; i < h; i++)
			for (int j = 0; j < w; j++)
				if (check[i][j])
					b[i][j] = '.';
		
		return flag;
	}
	
	void fall() {
		for (int i = 0; i < h-1; i++) {
			for (int j = 0; j < w; j++) {
				if (b[i][j] != '.' && b[i+1][j] == '.') {
					char[] temp = new char[i+1];
					for (int k = 0; k < i+1; k++) 
						temp[k] = b[k][j];
					int count = 1;
					while (i+count+1 < h && b[i+count+1][j] == '.') count++;
					for (int k = 0; k < count; k++) {
						b[k][j] = '.';
					}
					for (int k = 0; k < i+1; k++) {
						b[count+k][j] = temp[k];
					}
				}
			}
		}
	}
	
	boolean isDeleted(char[][] map) {
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				b[i][j] = map[i][j];
			}
		}
		
		fall();
		while (delete()) {
			fall();
		}
		
		boolean flag = true;
		
		I:for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				if (b[i][j] != '.') {
					flag = false;
					break I;
				}
			}
		}
		
		return flag;
	}
	
	void run() {
		h = sc.nextInt(); w = sc.nextInt(); n = sc.nextInt();
		char[][] map = new char[h][w];
		b = new char[h][w];
		sc.nextLine();
		for (int i = 0; i < h; i++) {
			String s = sc.nextLine();
			for (int j = 0; j < w; j++) {
				map[i][j] = s.charAt(j);
			}
		}
		
		boolean flag = false;
		I:for (int i = 0; i < h; i++) {
			for (int j = 0; j < w-1; j++) {
				if (map[i][j] != map[i][j+1]) {
					char temp = map[i][j];
					map[i][j] = map[i][j+1];
					map[i][j+1] = temp;
					if (isDeleted(map)) {
						flag = true;
						break I;
					}
					temp = map[i][j];
					map[i][j] = map[i][j+1];
					map[i][j+1] = temp;
				}
			}
		}
		if (flag) out.println("YES");
		else out.println("NO");
	}
	
	public static void main(String[] args) {
		new Main().run();
	}

}