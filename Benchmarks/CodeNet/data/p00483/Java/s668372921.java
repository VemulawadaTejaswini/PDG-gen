import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		int m = sc.nextInt(), n = sc.nextInt();
		int k = sc.nextInt();
		int imos[][][] = new int[3][m+1][n+1];
		for (int i = 1; i <= m; i++) {
			char[] chars = sc.next().toCharArray();
			for(int j = 1; j <= n; j++) {
				imos[0][i][j] = imos[0][i-1][j] + imos[0][i][j-1] - imos[0][i-1][j-1];
				imos[1][i][j] = imos[1][i-1][j] + imos[1][i][j-1] - imos[1][i-1][j-1];
				imos[2][i][j] = imos[2][i-1][j] + imos[2][i][j-1] - imos[2][i-1][j-1];
				if(chars[j-1]=='J') {
					imos[0][i][j]++;
				} else if(chars[j-1]=='O') {
					imos[1][i][j]++;
				} else {
					imos[2][i][j]++;
				}
			}
		}
		for(int i = 0; i < k; i++) {
			int sx = sc.nextInt(),sy = sc.nextInt(),gx = sc.nextInt(), gy = sc.nextInt();
			System.out.print(imos[0][gx][gy]-imos[0][sx-1][gy]-imos[0][gx][sy-1]+imos[0][sx-1][sy-1]);
			System.out.print(" ");
			System.out.print(imos[1][gx][gy]-imos[1][sx-1][gy]-imos[1][gx][sy-1]+imos[1][sx-1][sy-1]);
			System.out.print(" ");
			System.out.print(imos[2][gx][gy]-imos[2][sx-1][gy]-imos[2][gx][sy-1]+imos[2][sx-1][sy-1]);
			System.out.println();
		}
	}
}
