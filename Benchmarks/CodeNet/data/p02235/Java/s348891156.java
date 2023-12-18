
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int datasets = in.nextInt();
		in.nextLine();
		for(int i = 0; i<datasets; i++) {
			String a = in.nextLine();
			String b = in.nextLine();
			System.out.println(LCS(a, b));
		}
	}
	
	public static int LCS(String a, String b) {
		int m = a.length();
		int n = b.length();
		int[][] subprobs = new int[m+1][n+1];
		
		for(int i = 0; i <= m; i++) {
			subprobs[i][0] = 0;
		}
		
		for(int i = 0; i<=n; i++) {
			subprobs[0][i] = 0;
		}
		
		for(int i = 1; i<=m; i++) {
			for(int j = 1; j<=n; j++) {
				if(a.charAt(i-1) != b.charAt(j-1)) {
					subprobs[i][j] = Math.max(subprobs[i-1][j], subprobs[i][j-1]);
				}
				else {
					subprobs[i][j] = 1 + subprobs[i-1][j-1];
				}
			}
		}
		
		return subprobs[m][n];
	}

}

