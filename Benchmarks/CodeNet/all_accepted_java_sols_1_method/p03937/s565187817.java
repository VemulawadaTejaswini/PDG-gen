import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt();
		int w = sc.nextInt();
		int[][] board = new int[h][w];
		for(int i = 0; i < h; i++) {
			String s = sc.next();
			for(int j = 0; j < w; j++) {
				board[i][j] = (s.charAt(j) == '#') ? 1 : 0;
			}
		}
		int cnt = 0;
		for(int y = 0; y < h; y++) {
			for(int x = 0; x < w; x++) {
				if(board[y][x] == 1) {
					cnt++;
				}
			}
		}
		if(cnt == h+w-1) {
			System.out.println("Possible");
		} else {
			System.out.println("Impossible");
		}
	}
}
