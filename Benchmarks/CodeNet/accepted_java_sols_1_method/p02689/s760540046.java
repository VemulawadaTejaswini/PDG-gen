import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		int[] height = new int[n];

		for(int i = 0; i < n; i++) {
			height[i] = sc.nextInt();
		}

		for(int i = 0; i < m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			if(Math.abs(height[a - 1]) >= Math.abs(height[b - 1]) && height[b - 1] > 0) {
				height[b - 1] *= -1;
			}
			if(Math.abs(height[a - 1]) <= Math.abs(height[b - 1]) && height[a - 1] > 0) {
				height[a - 1] *= -1;
			}
		}

		int ans = 0;

		for(int i = 0; i < n; i++) {
			if(height[i] > 0) {
				ans++;
			}
		}

		System.out.println(ans);

		sc.close();

	}

}
