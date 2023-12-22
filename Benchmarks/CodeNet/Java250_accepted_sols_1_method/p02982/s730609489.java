
import java.util.Scanner;
public class Main {
	static int mod = 1000000007;
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int d = sc.nextInt();
		int[][] x = new int[n][d];
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < d; j++) {
				x[i][j] = sc.nextInt();
			}
		}
		int ans = 0;
		double dis = 0;
		for(int i = 0; i < n; i++) {
			for(int j = i+1; j < n; j++) {
				dis = 0;
				for(int k = 0; k < d; k++) {
					dis += Math.abs(x[i][k]-x[j][k]) * Math.abs(x[i][k]-x[j][k]);
				}
				if(Math.sqrt(dis) == (int)Math.sqrt(dis)) {
					ans ++;
				}
			}
		}
		System.out.println(ans);
		sc.close();
		
	}
}
