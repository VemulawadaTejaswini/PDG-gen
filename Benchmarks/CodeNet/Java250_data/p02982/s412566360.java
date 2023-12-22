
import java.util.Scanner;

public class Main {

	static int n;
	static int d;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);


		n = sc.nextInt();
		d = sc.nextInt();

		int[][] x = new int[n][d];
		for(int i = 0 ; i < n ; i++) {
			for(int j = 0 ; j < d ; j++) {
				x[i][j] = sc.nextInt();
			}
		}
		int ans = 0;
		for(int i = 0 ; i < n ; i++) {
			for(int j = i + 1 ; j < n ; j++) {
				if(judge(x[i], x[j])) {
					ans++;
				}
			}
		}
		System.out.println(ans);
		sc.close();
	}

	private static boolean judge(int[] y, int[] z) {
		int sum = 0;
		for(int i = 0 ; i < d ; i++) {
			sum += (z[i] - y[i]) * (z[i] - y[i]);
		}
		double root = Math.sqrt((double)sum);
		int hoge = (int)root;
		return root - hoge == 0.0d;
	}
}
