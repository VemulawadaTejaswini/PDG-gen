import java.util.*;
import static java.lang.System.*;

public class Main {

	Scanner sc = new Scanner(in);
	
	String[][] memo;
	int[][] mat;
	int w, h;
	
	int compare(String s1, String s2) {
		int c1, c2;
		c1 = c2 = 0;
		int index = 0;
		while (index < s1.length() && s1.charAt(index) == '0') {
			c1++;
			index++;
		}
		index = 0;
		while (index < s2.length() &&s2.charAt(index) == '0') {
			c2++;
			index++;
		}
		if (s1.length()-c1 > s2.length() -c2) return 1;
		else if (s1.length()-c1 < s2.length() -c2) return -1;
		
		return s1.substring(c1).compareTo(s2.substring(c2));
	}
	
	String calc(int i, int j) {
		if (memo[i][j] == null) {
			String s1, s2;
			s1 = s2 = null;
			if (i+1 < h && mat[i+1][j] >= 0) s1 = calc(i+1, j);
			if (j+1 < w && mat[i][j+1] >= 0) s2 = calc(i, j+1);
			if (s1 == null && s2 == null)
				memo[i][j] = String.valueOf(mat[i][j]);
			else if (s1 == null)
				memo[i][j] = String.valueOf(mat[i][j])+s2;
			else if (s2 == null)
				memo[i][j] = String.valueOf(mat[i][j])+s1;
			else if (compare(s1, s2) > 0)
				memo[i][j] = String.valueOf(mat[i][j])+s1;
			else
				memo[i][j] = String.valueOf(mat[i][j])+s2;
		}
		return memo[i][j];
	}
	
	void run() {
		while (true) {
			w = sc.nextInt(); h = sc.nextInt();
			if (w == 0 && h == 0) return;
			sc.nextLine();
			mat = new int[h][w];
			for (int i = 0; i < h; i++) {
				String s = sc.nextLine();
				for (int j = 0; j < w; j++) {
					if (Character.isDigit(s.charAt(j))) {
						mat[i][j] = Character.getNumericValue(s.charAt(j));
					} else {
						mat[i][j] = -1;
					}
				}
			}
			
			memo = new String[h][w];
			String ans = "0";
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					if (memo[i][j] == null && mat[i][j] >= 0) {
						calc(i, j);
						if (compare(ans, memo[i][j]) < 0)
							ans = memo[i][j];
					}
				}
			}
			
			int index = 0, c = 0;
			while (ans.charAt(index) == '0') {
				c++;
				index++;
			}
			
			out.println(ans.substring(c));
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}

}