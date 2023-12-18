import java.util.*;
import static java.lang.System.*;

public class Main {

	Scanner sc = new Scanner(in);
	
	int compare(String s1, String s2) {
		if (s1.length() == 0 && s2.length() == 0) return 0;
		if (s1.length() == 0) return -1;
		if (s2.length() == 0) return 1;
		
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
	
	void run() {
		while (true) {
			int w = sc.nextInt(), h = sc.nextInt();
			if (w == 0 && h == 0) return;
			sc.nextLine();
			int[][] mat = new int[h][w];
			String[][] dp = new String[h+1][w+1];
			
			for (int i = 0; i < h; i++) {
				String s = sc.nextLine();
				for (int j = 0; j < w; j++) {
					if (Character.isDigit(s.charAt(j))) {
						mat[i][j] = Character.getNumericValue(s.charAt(j));
						dp[i][j] = String.valueOf(s.charAt(j));
					} else {
						mat[i][j] = -1;
						dp[i][j] = "";
					}
				}
			}
			
			
			for (int i = 0; i <= w; i++) dp[h][i] = "";
			for (int i = 0; i <= h; i++) dp[i][w] = "";
			
			String ans = "";
			for (int i = h-1; i >= 0; i--) {
				for (int j = w-1; j >= 0; j--) {
					if (mat[i][j] >= 0) {
						if (compare(dp[i+1][j], dp[i][j+1]) > 0)
							dp[i][j] = dp[i][j] + dp[i+1][j];
						else
							dp[i][j] = dp[i][j] + dp[i][j+1];
						
						if (compare(dp[i][j], ans) > 0)
							ans = dp[i][j];
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