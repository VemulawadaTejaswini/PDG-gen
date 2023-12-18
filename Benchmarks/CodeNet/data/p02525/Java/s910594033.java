import java.util.Scanner;

public class Main {
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		while (true) {
			int n = in.nextInt();
			if (n == 0) {
				break;
			}
			int[] ss = new int[n];
			int sum = 0;
			for (int i = 0; i < n; i++) {
				ss[i] = in.nextInt();
				sum += ss[i];
			}
			double m = sum / (double) n;
			double a = 0;
			for (int s : ss) {
				a += Math.pow(s - m, 2);
			}
			a = Math.sqrt(a / n);
			System.out.println(String.format("%f", a));
		}
	}
}