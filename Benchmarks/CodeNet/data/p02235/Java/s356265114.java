import java.lang.*;
import java.util.*;

class LCS_new {
	
	public int LCS(String x, String y) {
		Integer[][] matrix = new Integer[x.length()+1][y.length()+1];
		for (int i = 0; i <= x.length(); i++) {
			matrix[i][0] = 0;
		}
		for (int j = 0; j <= y.length(); j++) {
			matrix[0][j] = 0;
		}
		for (int i = 1; i <= x.length(); i++) {
			for (int j = 1; j <= y.length(); j++) {
				if (x.charAt(i-1) == y.charAt(j-1)) {
					matrix[i][j] = 1 + matrix[i-1][j-1];
				}
				else {
					matrix[i][j] = Math.max(matrix[i-1][j], matrix[i][j-1]);
				}
			}
		}
		return matrix[x.length()][y.length()];
	}
}

public class Main {

	public static void main(String[] args) {
		
		LCS_new x = new LCS_new();
		Scanner in = new Scanner(System.in);
		int q = in.nextInt();
		in.nextLine();
		for (int i = 0; i < q; i++) {
			String a = in.nextLine();
			String b= in.nextLine();
			System.out.println(x.LCS(a, b));
		}

	}

}


