import java.util.*;
import static java.lang.System.*;

public class Main {

	Scanner sc = new Scanner(in);
	
	int num(int[][] s, int t, int x, int y) {
		if (s[x][y] != 0) return 0;
		int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1};
		int[] dy = {-1, 0, 1, -1, 1, -1, 0, 1};
		int res = 0;
		for (int i = 0; i < 8; i++) {
			int c = 1, count = 0;
			while (x+dx[i]*c >= 0 && x+dx[i]*c < 8 && y+dy[i]*c >= 0 && y+dy[i]*c < 8 && s[x+dx[i]*c][y+dy[i]*c] == -t) {
				count++;
				c++;
			}
			if (x+dx[i]*c >= 0 && x+dx[i]*c < 8 && y+dy[i]*c >= 0 && y+dy[i]*c < 8 && s[x+dx[i]*c][y+dy[i]*c] == t)
				res += count;
		}
		
		return res;
	}
	
	void renew(int[][] s, int t, int x, int y) {
		int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1};
		int[] dy = {-1, 0, 1, -1, 1, -1, 0, 1};
		for (int i = 0; i < 8; i++) {
			int c = 1, count = 0;
			while (x+dx[i]*c >= 0 && x+dx[i]*c < 8 && y+dy[i]*c >= 0 && y+dy[i]*c < 8 && s[x+dx[i]*c][y+dy[i]*c] == -t) {
				count++;
				c++;
			}
			if (x+dx[i]*c >= 0 && x+dx[i]*c < 8 && y+dy[i]*c >= 0 && y+dy[i]*c < 8 && s[x+dx[i]*c][y+dy[i]*c] == t) {
				for (int j = 0; j <= count; j++) {
					s[x+dx[i]*j][y+dy[i]*j] = t;
				}
			}
		}
	}
	
	boolean calc1(int[][] s) {
		int x = -1, y = -1;
		int count = 0;
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				int n = num(s, 1, i, j);
				if (count < n) {
					count = n;
					x = i; y = j;
				}
			}
		}
		if (count > 0) {
			renew(s, 1, x, y);
			return true;
		}
		return false;
	}
	
	boolean calc2(int[][] s) {
		int x = -1, y = -1;
		int count = 0;
		for (int i = 7; i >= 0; i--) {
			for (int j = 7; j >= 0; j--) {
				int n = num(s, -1, i, j);
				if (count < n) {
					count = n;
					x = i; y = j;
				}
			}
		}
		if (count > 0) {
			renew(s, -1, x, y);
			return true;
		}
		return false;
	}
	
	void run() {
		int[][] s = new int[8][8];
		String st;
		for (int i = 0; i < 8; i++) {
			st = sc.nextLine();
			for (int j = 0; j < 8; j++) {
				if (st.charAt(j) == 'o')
					s[i][j] = 1;
				else if (st.charAt(j) == 'x')
					s[i][j] = -1;
				else
					s[i][j] = 0;
			}
		}
		
		boolean mami = true, witch = true;
		while (mami || witch) {
			mami = calc1(s);
			witch = calc2(s);
		}
		
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				if (s[i][j] == 1)
					out.print('o');
				else if (s[i][j] == -1)
					out.print('x');
				else
					out.print('.');
			}
			out.println();
		}
		
	}
	
	public static void main(String[] args) {
		new Main().run();
	}

}