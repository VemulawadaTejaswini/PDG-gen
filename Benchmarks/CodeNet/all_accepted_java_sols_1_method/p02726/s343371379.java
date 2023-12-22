
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt() - 1;
		int y = sc.nextInt() - 1;
		int[][] dist = new int[n][n];
		for(int i = 0; i < n; i++) {
			for(int j = i + 1; j < n; j++) {
				dist[i][j] = Math.min(j - i, Math.abs(i - x) + Math.abs(j - y) + 1);
				dist[j][i] = Math.min(j - i, Math.abs(i - x) + Math.abs(j - y) + 1);
			}
		}
		int[] ans = new int[n];
		for(int i = 0; i < n; i++) {
			for(int j = i + 1; j < n; j++) {
				ans[dist[i][j]]++;
			}
		}
		for(int i = 1; i < n; i++) {
			System.out.println(ans[i]);
		}
	}

}
