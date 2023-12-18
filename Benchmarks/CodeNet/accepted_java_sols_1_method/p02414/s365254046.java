import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int l = sc.nextInt();
		int nm[][] = new int[n][m];
		int ml[][] = new int[m][l];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				nm[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < l; j++) {
				ml[i][j] = sc.nextInt();
			}
		}
		long ans = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < l; j++) {
				ans = 0;
				for (int k = 0; k < m; k++) {
					ans += nm[i][k] * ml[k][j];
				}
				if(j!=l-1) {
					System.out.print(ans + " ");
				}else {
					System.out.print(ans);
				}
			}
			System.out.println();
		}
	}
}
