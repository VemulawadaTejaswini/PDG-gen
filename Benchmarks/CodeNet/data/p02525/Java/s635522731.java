import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int ave = 0;
		while (true) {
			int n = sc.nextInt();
			if (n == 0)
				break;
			int[] x = new int[n];
			for (int i = 0; i < n; i++) {
				x[i] = sc.nextInt();
			}

			ave = ave(x);
			System.out.printf("%.8f\n", deviate(x, ave));
		}
	}

	public static int ave(int[] x) {
		int ave = 0;
		for (int i = 0; i < x.length; i++) {
			ave += x[i];
		}
		return ave / x.length;
	}

	public static double deviate(int[] x, int ave) {
		double ans = 0;
		for (int i = 0; i < x.length; i++) {
			ans += (x[i] - ave) * (x[i] - ave);
		}
		return Math.sqrt(ans / x.length);
	}
}