import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int h[] = new int[n];
		int t = sc.nextInt();
		int a = sc.nextInt();
		double abs = 200;
		int ans = 0;
		double tmp;

		for (int i = 0; i < h.length; i++) {
			h[i] = sc.nextInt();
			tmp = Math.abs(a - (t - h[i]*0.006));
			if (i == 0) {
				abs = tmp;
				ans = 1;
			}else if (abs > tmp) {
				abs = tmp;
				ans = i + 1;
			}
		}
		sc.close();
		System.out.println(ans);

	}

}
