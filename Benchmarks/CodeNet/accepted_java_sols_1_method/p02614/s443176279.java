import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt(), p = sc.nextInt();
		char a[][] = new char[n][m];
		for (int i = 0; i < n; i++) {
			String temp = sc.next();
			for (int j = 0; j < m; j++)
				a[i][j] = temp.charAt(j);
		}
		int ans = 0;
		for (int i = 0; i < 1 << n; i++) {
			for (int j = 0; j < 1 << m; j++) {
				int totalBlacks = 0;
				for (int k = 0; k < n; k++)
					for (int l = 0; l < m; l++)
						if ((((1 << k) & i) > 0) && (((1 << l) & j) > 0))
							if (a[k][l] == '#')
								totalBlacks++;
				if (totalBlacks == p)
					++ans;
			}
		}
		System.out.println(ans);
	}
}
