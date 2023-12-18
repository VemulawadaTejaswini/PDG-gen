import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int c = sc.nextInt();
		int[][] d1 = new int[c][c];
		int[][] c1 = new int[n][n];
		int[][] cnum = new int[3][50];
		for(int i = 0; i < c; i++) {
			for(int j = 0; j < c; j++) {
				d1[i][j] = sc.nextInt();
			}
		}
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				c1[i][j] = sc.nextInt()-1;
				cnum[(i+j)%3][c1[i][j]]++;
			}
		}
		int ans = 1000000000;
		for(int i = 0; i < c; i++) {
			for(int j = 0; j < c; j++) {
				for(int k = 0; k < c; k++) {
					if(i==j||j==k||i==k) continue;
					int res = 0;
					for(int m = 0; m < c; m++) {
						res += cnum[0][m]*d1[m][i];
						res += cnum[1][m]*d1[m][j];
						res += cnum[2][m]*d1[m][k];
					}
					ans = Math.min(ans, res);
				}
			}
		}
		System.out.println(ans);
		
	}

}