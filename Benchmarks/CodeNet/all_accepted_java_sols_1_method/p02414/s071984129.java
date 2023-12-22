import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in);) {
			
			int n = sc.nextInt();
			int m = sc.nextInt();
			int l = sc.nextInt();
			
			long a[][] = new long[n][m];
			long b[][] = new long[m][l];
			
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < m; j++) {
					a[i][j] = sc.nextInt();
				}
			}
			for(int i = 0; i < m; i++) {
				for(int j = 0; j < l; j++) {
					b[i][j] = sc.nextInt();
				}
			}
			
			StringBuilder sb = new StringBuilder();
			
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < l; j++) {
					long c = 0;
					for(int k = 0; k < m; k++) {
						c += a[i][k] * b[k][j];
					}
					sb.append(c);
					if(j < l - 1) {
						sb.append(" ");
					} else {
						sb.append("\n");
					}
				}
			}
			
			System.out.print(sb.toString());
		}
	}
}
