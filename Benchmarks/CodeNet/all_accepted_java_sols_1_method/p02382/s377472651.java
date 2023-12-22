import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[]x = new int[n];
		int[]y = new int[n];
		for(int i = 0; i < n; i++) {
			x[i] = scan.nextInt();
		}
		for(int i = 0; i < n; i++) {
			y[i] = scan.nextInt();
		}
		scan.close();
		long d1 = 0;
		long d2 = 0;
		long d3 = 0;
		long d4 = 0;
		for(int i = 0; i < n; i++) {
			long k = Math.abs(x[i] - y[i]);
			d1 += k;
			d2 += k * k;
			d3 += k * k * k;
			d4 = Math.max(d4, k);
		}
		double k2 = Math.sqrt(d2);
		double k3 = Math.pow(d3, (double)1/3);
		System.out.println(d1);
		System.out.println(k2);
		System.out.println(k3);
		System.out.println(d4);
	}
}
