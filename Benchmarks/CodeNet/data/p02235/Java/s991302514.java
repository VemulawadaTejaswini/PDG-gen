
import java.util.Scanner;

public class Main{
	
	static int LCS(String a, String b) {
		int max = Math.max(a.length(), b.length());
		int[][] array = new int[max + 1][max + 1];
		int m = a.length();
		int n = b.length();
		int MAX = 0;
		a = ' ' + a;
		b = ' ' + b;
		for (int i = 1; i <= m; i++) {
			for (int j = 1; j <= n; j++) {
				if (a.charAt(i) == b.charAt(j)) {
					array[i][j] = array[i - 1][j - 1] + 1;
				} else {
					array[i][j] = Math.max(array[i - 1][j], array[i][j - 1]);
				}
				MAX = Math.max(MAX, array[i][j]);
			}
		}
		return MAX;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for(int i=0; i<n; i++) {
			String s1 = in.next();
			String s2 = in.next();
			System.out.println(LCS(s1, s2));
		}
	}

}



