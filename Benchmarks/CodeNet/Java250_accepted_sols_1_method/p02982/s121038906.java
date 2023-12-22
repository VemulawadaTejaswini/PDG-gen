import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner((System.in));
		int n = sc.nextInt();
		int d = sc.nextInt();
		int[][] x = new int[n][d];
		int ans = 0, sum = 0;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < d; j++) {
				x[i][j] = sc.nextInt();
			}
		}
		
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (i == j) {
					continue;
				}
				sum = 0;
				for (int k = 0; k < d; k++) {
					sum += Math.pow(x[i][k] - x[j][k], 2);
				}
				// System.out.println("i:"+i+" j:"+j+" sum:"+Math.sqrt(sum));
				if (Math.sqrt(sum) == (int)Math.sqrt(sum)) {
					ans++;
				}
			}
		}

		System.out.println(ans);

		sc.close();
	}
}
