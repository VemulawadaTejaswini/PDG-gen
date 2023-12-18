import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = 300;
		int n = scan.nextInt();
		int[][] p = new int[N+1][N+1];
		int[][] sp = new int[N+1][N+1];
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				p[i][j] = scan.nextInt();
			}
		}
		
		int max = 0;
		for (int x = 1; x <= n; x++) {
			for (int y = 1; y <= n; y++) {
				for (int i = x; i <= n; i ++) {
					for (int j = y; j <= n; j++) {
						sp[i][j] = sp[i-1][j] + sp[i][j-1] + p[i][j] - sp[i-1][j-1];
						if (sp[i][j] > max)  {
							max = sp[i][j];
						}
					}
				}
				for (int i = x; i <= n; i ++) {
					for (int j = y; j <= n; j++) {
						sp[i][j] = 0;
					}
				}
			}
		}
		System.out.println(max);
		scan.close();
	}
}