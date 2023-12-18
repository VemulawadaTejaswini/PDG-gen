import java.io.*;
import java.math.*;
import java.util.*;
public class Main { 

	public static void main(String[] args) { //
		Scanner input = new Scanner(System.in);
		int R = input.nextInt();
		int C = input.nextInt();
		boolean[] badRows = new boolean[R];
		boolean[] badCols = new boolean[C];
		String[] rows = new String[R];
		for (int r = 0; r < R; r++) {
			rows[r] = input.next();
			boolean bad = true;
			for (int c = 0; c < C; c++) {
				if (rows[r].charAt(c)=='#') {
					bad=false;
					break;
				}
			}
			if (bad) badRows[r]=true;
		}
		for (int c = 0; c < C; c++) {
			boolean bad = true;
			for (int r = 0; r < R; r++) {
				if (rows[r].charAt(c)=='#') {
					bad=false;
					break;
				}
			}
			if (bad) badCols[c]=true;
		}
		for (int r = 0; r < R; r++) {
			if (!badRows[r]) {
				String ans = "";
				for (int c = 0; c < C; c++) {
					if (!badCols[c]) ans+=rows[r].substring(c,c+1);
				}
				System.out.println(ans);
			}
		}
	}
}