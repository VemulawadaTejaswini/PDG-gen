import java.util.*;
import static java.util.Arrays.*;
import static java.lang.Math.*;

// AOJ 0037
public class Main {

	static Scanner sc = new Scanner(System.in);
	static final double EPS = 1e-10;
	public static void main(String[] args) {
		char[][] cs = new char[20][1000];
		for (int i = 0; i < 20; i++) fill(cs[i], '0');
		
		for (int i = 0; i < 9; i++) {
			String buf = sc.next();
			for (int j = 0; j < buf.length(); j++) {
				if (i % 2 == 0) {
					cs[i + 1][j * 2 + 2] = buf.charAt(j);
				} else {
					cs[i + 1][j * 2 + 1] = buf.charAt(j);
				}
			}
			
		}

		int[] dx = {1, 0, -1, 0}, dy = {0, 1, 0, -1};
		String[] str = {"R", "D", "L", "U"}; 
		int x = 1, y = 1, d = 0;
		while (!(x == 1 && y == 1 && d == 2)) {
			if (cs[y + dy[d]][x + dx[d]] == '1') {
				x += dx[d] * 2; 
				y += dy[d] * 2;
				System.out.print(str[d]);
			} else {
				
				if (cs[y + dy[(d - 1 + 4) % 4]][x + dx[(d - 1 + 4) % 4]] == '1') {
					d = (d - 1 + 4) % 4;					
				} else {
					d = (d + 1) % 4;
				}

				
			}
		}
		System.out.println();
		
	}
}