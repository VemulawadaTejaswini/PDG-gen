import java.util.Scanner;
import java.lang.Math;
import java.util.ArrayList;
import java.util.List;
//List<Integer> list = new ArrayList<>();

class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		int m = stdIn.nextInt();
		int c = stdIn.nextInt();
		int[] b = new int[m];
		for (int i = 0; i < m; i++)
			b[i] = stdIn.nextInt();
		int[][] a = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++)	
				a[i][j] = stdIn.nextInt();
		}

		int ans = 0;
		int sum;
		for (int i = 0; i < n; i++) {
			sum = c;
			for (int j = 0; j < m; j++)
				sum = sum + a[i][j] * b[j];
			ans = (sum > 0) ? ans + 1 : ans;
		}

		System.out.println(ans);
	}
}