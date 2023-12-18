import java.util.*;

public class Main {
	public static void main(String[]  args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		
		for (int i = 0; i < n; i++) {
			String X = scanner.next();
			String Y = scanner.next();
			
			int[][] LCS_length = new int[X.length() + 1][Y.length() + 1];
			
			for (int j = 0; j <= X.length(); j ++) {
				LCS_length[j][0] = 0;
			}
			for (int k = 0; k <= Y.length(); k ++) {
				LCS_length[0][k] = 0;
			}
			
			for (int j = 1; j <= X.length(); j ++) {
				for (int k = 1; k <= Y.length(); k ++) {
					if (X.charAt(j - 1) == Y.charAt(k - 1)) {
						 LCS_length[j][k] = LCS_length[j - 1][k - 1] + 1;
					} else if (LCS_length[j - 1][k] > LCS_length[j][k - 1]) {
						LCS_length[j][k] = LCS_length[j - 1][k];
					} else {
						LCS_length[j][k] = LCS_length[j][k - 1];
					}
				}
			}
			
			System.out.println(LCS_length[X.length()][Y.length()]);
		}
		
		scanner.close();
	}
} 

