import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int n, m, l, i, j, k, a, b;
		try (Scanner sc = new Scanner(System.in)) {
			n = sc.nextInt();
			m = sc.nextInt();
			l = sc.nextInt();
			int n_m[][] = new int[n][m];
			int m_l[][] = new int[m][l];
			long output[][] = new long[n][l]; //表の配列
			for(i = 0; i < n; i++) {
				for(j = 0; j < m; j++) {
					n_m[i][j] = sc.nextInt();
				}
			}
			for(i = 0; i < m; i++) {
				for(j = 0; j < l; j++) {
					m_l[i][j] = sc.nextInt();
				}
			}
			for(i = 0; i < n; i++) {
				for(j = 0; j < m; j++) {
					for(k = 0; k < l; k++) {
						output[i][k] += n_m[i][j] * m_l[j][k];
						if(j == m - 1) {
							if(k < l - 1) {
								System.out.print(output[i][k] + " ");
							}else {
								System.out.println(output[i][k]);
							}
						}
					}
				}
			}
		}
	}
}

