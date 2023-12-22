import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int m = sc.nextInt();
		int[] k = new int[n];
		int[][] a = new int[n][m];
		for(int i = 0; i < n; i++) {
			k[i] = sc.nextInt();
			for(int j = 0; j < k[i]; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		int[] like = new int[m];
		Arrays.fill(like, 0);
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < k[i]; j++) {
				like[a[i][j]-1]++;
			}
		}
		int ans = 0;
		for(int i = 0; i < m; i++) {
			if(like[i] == n) {
				ans++;
			}
		}
		System.out.println(ans);
		
		
		
	}
}
