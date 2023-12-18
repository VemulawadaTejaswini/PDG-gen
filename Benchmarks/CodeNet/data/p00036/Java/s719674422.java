import static java.lang.Math.*;
import static java.util.Arrays.*;
import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) {
		try {
			System.setIn(new FileInputStream("src/xxxyyyy/input.txt"));
			System.setOut(new PrintStream(new FileOutputStream("src/xxxyyyy/result.txt")));
		} catch (FileNotFoundException e) {
		}
		new Main().run();
	}

	void run() {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			table = new char[8][];
			for(int i = 0; i < 8; i++) {
				String s = sc.next();
				table[i] = s.toCharArray();
			}
			System.out.println(solve());
		}
	}
	
	char[][] table;
	char solve() {
		int[][] mask = {
				{0, 1, 1, 0, 1, 1},
				{1, 0, 2, 0, 3, 0},
				{0, 1, 0, 2, 0, 3},
				{1, -1, 1, 0, 2, -1},
				{0, 1, 1, 1, 1, 2},
				{1, 0, 1, 1, 2, 1},
				{0, 1, 1, -1, 1, 0},
		};
		
		for(int row = 0; row < 8; row++)
			for(int col = 0; col < 8; col++) {
				if( table[row][col] == '1' ) {
					for(int k = 0; k < 7; k++) {
						boolean ok = true;
						for(int i = 0; i < 3; i++) {
							int x = row + mask[k][i * 2];
							int y = col + mask[k][i * 2 + 1];
							if( !(0 <= x && x < 8 && 0 <= y && y < 8) ){
								ok = false;
								break;
							}
							if( table[x][y] != '1' ) {
								ok = false;
								break;
							}
						}
						if( ok )
							return (char) ('A' + k);
					}
				}
			}
		return '?';
	}
	
	void debug(Object... os) {
		System.err.println(deepToString(os));
	}
}