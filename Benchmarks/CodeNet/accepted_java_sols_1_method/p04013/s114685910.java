import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A = sc.nextInt();
		int[]x = new int[N];
		for(int i = 0; i < N; i++) {
			x[i] = sc.nextInt();
		}
		sc.close();
		long sum = 0;
		int l = 50 * 50 ;
		long[][][] d= new long[N + 1][N + 1][l + 1];
		d[0][0][0] = 1;
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				for(int k = 0; k <= l; k++) {
					if(d[i][j][k] != 0) {
						d[i + 1][j + 1][k + x[i]] += d[i][j][k];
						d[i + 1][j][k] += d[i][j][k];
					}
				}
			}
		}
		for(int j = 1; j <= N; j++) {
			sum += d[N][j][j * A];
		}
		System.out.println(sum);
	}
}