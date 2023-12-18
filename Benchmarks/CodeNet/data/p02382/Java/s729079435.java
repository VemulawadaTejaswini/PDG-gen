import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x[] = new int[n];
		int y[] = new int[n];
		int d[] = new int[n];
		for (int i = 0; i < n; i++)
			x[i] = sc.nextInt();
		for (int i = 0; i < n; i++)
			y[i] = sc.nextInt();
		double p1 = 0, p2 = 0, p3 = 0, pm = 0;
		for (int i = 0; i < n; i++) {
			d[i] = Math.abs(x[i] - y[i]);
			p1 += d[i];
			p2 += d[i] * d[i];
			p3 += d[i] * d[i] * d[i];
			if (d[i] > pm) {
				pm = d[i];
			}
		}
		p2 = Math.sqrt(p2);
		p3 = Math.pow(p3, (1.0 * 1 / 3));
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(pm);
	}
}
