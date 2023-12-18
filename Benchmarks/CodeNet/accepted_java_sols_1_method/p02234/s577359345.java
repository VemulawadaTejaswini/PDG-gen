import java.util.Scanner;
public class Main {
private static Scanner s = new Scanner(System.in);
public static void main(String[] args) {
	int n = s.nextInt();
	int[] p = new int[n+1];
	int[][] m = new int[n+1][n+1];

	for(int i = 1;i <= n;i++) {
		p[i-1] = s.nextInt();
		p[i] = s.nextInt();
		m[i][i] = 0;
	}

	for(int k = 2;k <= n;k++) {
		for(int i = 1;i <= n-k+1;i++) {
			int j = k + i - 1;
			m[i][j] = Integer.MAX_VALUE;;
			for(int l = i;l <= j-1;l++) {
			if(m[i][l] + m[l+1][j] + p[i-1] * p[l] * p[j] < m[i][j])
				m[i][j] = m[i][l] + m[l+1][j] + p[i-1] * p[l] * p[j];
			}
		}
	}
	System.out.println(m[1][n]);
}
}


