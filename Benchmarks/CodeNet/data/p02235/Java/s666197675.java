
import java.util.Scanner;

public class Main {
	public static int LCS (char [] X, char[] Y, int a, int b) {
		int[][] result = new int[a+1][b+1];
		for (int k = 0; k <= a; k++) {
			result[k][0] = 0;
		}
		for (int j = 0; j <=b; j++) {
			result[0][j]= 0;
		}
		if (a==0 || b==0 ) {
			return 0;
		}
		for (int n = 1; n <= a; n++) {
			for(int m = 1; m <=b; m++) {
				if (X[n-1] == Y[m-1]) {
					//return 1 + LCS(X, Y, a-1, b-1);
					result[n][m] = 1 + result[n-1][m-1]; 
				}
				else {
					//return max(LCS(X,Y, a, b-1), LCS(X,Y, a-1,b));
					result[n][m] = max(result[n-1][m], result[n][m-1]);
				}			
			}
		}
		return result[a][b];
	}
	static int max(int i, int j) {
		if (i >= j) {
			return i;
		}
		else {
			return j;
		}
	}
	public static void main(String[] args) {
		Main LCS = new Main();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for (int m = 0; m < n; m++) {
			String S1 = scan.next();
			String S2 = scan.next();
			
			char[] X = S1.toCharArray();
			char[] Y = S2.toCharArray();
			int a = X.length;
			int b = Y.length;
			
			System.out.println(LCS(X,Y,a,b));
		}
		
	}
}	
