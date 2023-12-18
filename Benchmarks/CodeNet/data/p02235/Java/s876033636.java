import static java.lang.Math.max;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	char[] x;
	char[] y;
	boolean[][] flag;
	int[][] c;
	void run() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			
			String X = sc.next();
			x = X.toCharArray();
			String Y = sc.next();
			y = Y.toCharArray();
			
			flag = new boolean[X.length()][Y.length()];
			c = new int[X.length()][Y.length()];
			
			int ans = LCS(X.length()-1, Y.length()-1);
			System.out.println(ans);
		}
		
		sc.close();
	}
	
	int LCS(int i, int j) {
		if(i == -1 || j == -1)
			return 0;
		
		if(flag[i][j] == true)
			return c[i][j];
		
		flag[i][j] = true;
		
		if(x[i] == y[j])
			return c[i][j] = LCS(i-1, j-1)+1;
		
		return c[i][j] = max(LCS(i-1,j), LCS(i,j-1));
	}

	void debug(Object... o) {
		System.out.println(Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}
