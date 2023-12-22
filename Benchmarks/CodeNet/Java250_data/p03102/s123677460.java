import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int c = sc.nextInt();
		int[] b = new int[m];
		int[][] a = new int[n][m];
		int answer = 0;
		for(int i = 0; i < m; i++) {
			b[i] = sc.nextInt();
		}
		for(int i = 0; i < n; i++) {
			int total = c;
			for(int j = 0; j < m; j++) {
				a[i][j] = sc.nextInt();
				total += a[i][j]*b[j];
			}
			if(total > 0) answer++;
		}
		System.out.println(answer);
	}

}
