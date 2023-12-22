import java.io.*;
import java.math.*;
import java.util.*;
public class Main { //Just brute force problems with small constraints

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int R = input.nextInt();
		int C = input.nextInt();
		boolean[][] vis = new boolean[R][C];
		String[] rows = new String[R];
		int x = 0;
		int y = 0;
		for (int j = 0; j < R; j++) {
			rows[j] = input.next();
		}
		while (true) {
			char cur = rows[y].charAt(x);
			vis[y][x]=true;
			if (cur=='#') {
				if (x+1<C&&rows[y].charAt(x+1)=='#') x++;
				else if (y+1<R&&rows[y+1].charAt(x)=='#') y++;
				else break;
			}else break;
		}
		boolean good=true;
		for (int r = 0; r < R; r++) {
			for (int c = 0; c < C;c++) {
				if (rows[r].charAt(c)=='#'&&!vis[r][c]) {
					good=false;
					break;
				}
			}
		}
		System.out.println(good?"Possible":"Impossible");
	}
}