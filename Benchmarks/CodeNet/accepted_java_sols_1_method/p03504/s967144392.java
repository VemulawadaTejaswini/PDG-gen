import java.util.Arrays;
import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int C = sc.nextInt();
		int[][] a = new int[C][100000];
		for (int i = 0; i < N; ++i) {
			int s = sc.nextInt() - 1;
			int t = sc.nextInt() - 1;
			int c = sc.nextInt() - 1;
			for (int j = s; j <= t; ++j)
				if (a[c][j] == 0)
					a[c][j]++;
		}
 
		int ans = 0;
		for (int i = 0; i < 100000; ++i) {
			int tmp = 0;
			for (int j = 0; j < C; ++j) {
				tmp += a[j][i];
			}
			ans = Math.max(ans, tmp);
		}
		System.out.println(ans);
	}
}