import java.util.*;
import java.lang.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int k = in.nextInt();
		for (int i = 0; i < k; i++) {
			String a = in.next();
			String b = in.next();
			int l = find_LCS(a,b);
			System.out.println(l);
		}
		in.close();
	}
	
	public static int find_LCS(String a, String b) {
		int m = a.length();
		int n = b.length();
		int[][] lcs = new int[m+1][n+1];
		
		
		for (int i = 1; i <= m; i++) {
			for (int j = 1; j <= n; j++) {
				lcs[i][j] = Math.max(lcs[i-1][j], lcs[i][j-1]);
				if (a.charAt(i-1) == b.charAt(j-1)) {
					lcs[i][j] = 1 + lcs[i-1][j-1];
				}
			}
		}
		
		return lcs[m][n];
	}
}

