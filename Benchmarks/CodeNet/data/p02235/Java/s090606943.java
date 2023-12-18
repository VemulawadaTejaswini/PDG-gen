import java.util.Scanner;

public class Main {
	static final int N = 1000;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int q = scan.nextInt();
		for(int i = 0; i < q; i++) {
			String s1 = scan.next();
			String s2 = scan.next();
			System.out.println(lcs(s1, s2));
		}
		scan.close();

	}
	static int lcs(String X, String Y) {
		int[][]c = new int[N + 1][N + 1];
		int m = X.length();
		int n = Y.length();
		int maxl = 0;
		X = " " + X;
		Y = " " + Y;
		for(int i = 1; i <= m; i++) {
			for(int j = 1; j <= n; j++) {
				if(X.charAt(i) == Y.charAt(j)) {
					c[i][j] = c[i - 1][j - 1] + 1;
				}else {
					c[i][j] = Math.max(c[i - 1][j], c[i][j - 1]);
				}
				maxl = Math.max(maxl, c[i][j]);
			}
		}
		return maxl;
	}
}
