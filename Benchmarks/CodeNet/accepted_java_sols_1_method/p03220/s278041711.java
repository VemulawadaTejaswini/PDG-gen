import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int t = scan.nextInt();
		int a = scan.nextInt();
		int[] h = new int[n];
		for (int i = 0; i < n; i++) {
			h[i] = scan.nextInt();
		}
		double x = 0.006;
		double sa = 1<<30;
		int num = 0;
		for (int i = 0; i < n; i++) {
			double y = t- (h[i] * x);
			double z = Math.abs(a-y);
			if (sa > z) {
				num = i;
				sa = z;
			}
		}
		System.out.println(num+1);
	}
}
