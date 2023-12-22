import java.util.Scanner;

public class Main {
	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int n = sc.nextInt();
		int t = sc.nextInt();
		int a = sc.nextInt();
		int[] h = new int[n];
		double[] x = new double[n];
		for(int i = 0; i < n; i++) {
			h[i] = sc.nextInt();
			x[i] = t-h[i]*0.006;
		}
		System.out.println(palace(x,a));

	}

	public static int palace(double[] x, int a) {
		double tmp = Math.abs(a - x[0]);
		int tmp2 = 1;
		for(int i = 1; i < x.length; i++) {
			if(Math.abs(a - x[i]) < tmp) {
				tmp = Math.abs(a - x[i]);
				tmp2 = i+1;
			}
		}
		return tmp2;
	}
}