import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int t = sc.nextInt();
		int a = sc.nextInt();

		double l = 100000000;

		int ans = 0;

		for (int i = 0; i < n; i++) {
			int h = sc.nextInt();

			double ave = t - h * 0.006;

			double s = Math.abs(ave - a);

			if(s < l) {
				l = s;
				ans = i + 1;
			}
		}

		System.out.println(ans);

		sc.close();

	}
}