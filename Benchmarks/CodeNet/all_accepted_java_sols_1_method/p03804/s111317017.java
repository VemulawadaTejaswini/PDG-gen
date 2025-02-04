import java.util.Scanner;

public class Main {
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int n = sc.nextInt();
		int m = sc.nextInt();
		char[][] a = new char[n][n];
		for (int i = 0;i < n;i++) {
			String s = sc.next();
			a[i] = s.toCharArray();
		}
		char[][] b = new char[m][m];
		for (int i = 0;i < m;i++) {
			String s = sc.next();
			b[i] = s.toCharArray();
		}

		for (int i = 0;i < n-m+1;i++) {
			for (int j = 0;j < n-m+1;j++) {
				boolean ret = true;
				for (int k = 0;k < m;k++) {
					for (int l = 0;l < m;l++) {
						if (a[i+k][j+l]!=b[k][l]) ret = false;
					}
				}
				if (ret) {
					System.out.println("Yes");
					return;
				}
			}
		}
		System.out.println("No");
	}
}
