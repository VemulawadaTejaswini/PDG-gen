import java.util.*;
import static java.lang.System.*;

public class Main {

	Scanner sc = new Scanner(in);
	
	void run() {
		int n = sc.nextInt();
		int[][] mat = new int[n][n];
		for (int i = 0; i < n; i++)
			for (int j = 0; j < n; j++)
				mat[i][j] = sc.nextInt();
		
		long res = 0;
		for (int i = 0; i < n-1; i++) {
			for (int j = i+1; j < n; j++) {
				res += Math.min(mat[i][j], mat[j][i]);
			}
		}
		out.println(res);
	}
	
	public static void main(String[] args) {
		new Main().run();
	}

}