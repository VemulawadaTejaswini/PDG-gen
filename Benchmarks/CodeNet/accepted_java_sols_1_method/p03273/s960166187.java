import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt(); scan.nextLine();
		boolean[] g = new boolean[n];
		boolean[] r = new boolean[m];
		Arrays.fill(g, false);
		Arrays.fill(r, false);

		ArrayList<Character> c = new ArrayList<>();
		char[][] a = new char[n][m];
		for (int i = 0; i < n; i++) {
			String A = scan.nextLine();
				for (int j = 0; j < m; j++) {
					a[i][j] = A.charAt(j);
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (a[i][j] == '#') {
					g[i] = true;
				}
			}
		}
		for (int j = 0; j < m; j++) {
			for (int i = 0; i < n; i++) {
				if (a[i][j] == '#') {
					r[j] = true;
				}
			}
		}
		
		for (int i = 0; i < n; i++) {
			if (!g[i]) continue;
			for (int j = 0; j < m; j++) {
				if (!r[j]) continue;
				System.out.print(a[i][j]);
			}
			System.out.println("");
		}

	}
}
