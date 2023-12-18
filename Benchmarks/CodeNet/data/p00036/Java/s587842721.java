import java.util.*;
import static java.util.Arrays.*;
import static java.lang.Math.*;

// AOJ 0036
public class Main {

	static Scanner sc = new Scanner(System.in);
	static final double EPS = 1e-10;
	public static void main(String[] args) {
		while (sc.hasNext()) {
			char[][] cs = new char[12][12];
			int[][][] fg = {
				{{1, 0}, {0, 1}, {1, 1}},
				{{1, 0}, {2, 0}, {3, 0}},
				{{0, 1}, {0, 2}, {0, 3}},
				{{1, 0}, {1, -1}, {2, -1}},
				{{0, 1}, {1, 1}, {1, 2}},
				{{1, 0}, {1, 1}, {2, 1}},
				{{1, 0}, {0, 1}, {-1, 1}}
			};
			for (int i = 0; i < 12; i++) fill(cs[i], '0');
			int i,j,k,l,x,y;
			for (i = 0; i < 8; ) {
				String buf = sc.next();
				if (buf.equals("")) break;
				for (j = 2; j < 10; j++) 
					cs[i][j] = buf.charAt(j - 2);
				
				i++;
			}
			if (i == 0) break;
			for (i = 0; i < 8; i++) {
				for (j = 2; j < 10; j++) {
					if (cs[i][j] == '1') {
						for (k = 0; k < 7; k++) {
							for (l = 0; l < 3; l++) 
								if (cs[i + fg[k][l][0]][j + fg[k][l][1]] == '0') break;

							if (l == 3) 
								System.out.println((char)('A' + k));
						}
					}
				}
			}
		}
	}
}