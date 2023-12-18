
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	public static int LCS(String x, String y) {
		int m = x.length();
		int n = y.length();
		int[][] matrix = new int[m+1][n+1];
		
		char[] s1 = new char[m+1];
		char[] s2 = new char[n+1];
		
		for(int i = 0; i < m; i++) {
			char c = x.charAt(i);
			s1[i+1] = c;
		}

		for(int i = 0; i < n; i++) {
			char c = y.charAt(i);
			s2[i+1] = c;
		}
		
		for(int i = 1; i < m+1; i++) {
			for(int j = 1; j < n+1; j++) {
				if ((s1[i]!=(s2[j]))) {
					matrix[i][j] = Math.max(matrix[i-1][j], matrix[i][j-1]);
				}
				else {
					matrix[i][j] = 1 + matrix[i-1][j-1];
				}
			}
		}
		
		
		return matrix[m][n];
	}
	

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int datasets = in.nextInt();
		
		
		for(int i = 0; i < datasets; i++) {
			String s1, s2;
			s1 = in.next();
			s2 = in.next();
			
			
			System.out.println(LCS(s1, s2));
		}

	}

}

