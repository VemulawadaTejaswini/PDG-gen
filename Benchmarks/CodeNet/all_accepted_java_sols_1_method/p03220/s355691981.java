import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int t = sc.nextInt();
		int a = sc.nextInt();
		int[] h = new int[n];
		double temp = 100000000;
		int ans = 0;
		for (int i = 0; i < n; i++) {
			h[i] = sc.nextInt();
			if (Math.abs(a - (t - h[i] * 0.006)) < temp) {
				temp = Math.abs(a - (t - h[i] * 0.006));
				ans = i+1;
			}
		}
		System.out.println(ans);
	}
}