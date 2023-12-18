import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		double h = sc.nextInt() / 12. * Math.PI * 2.;
		double m = sc.nextInt() / 60. / 12. * Math.PI * 2.;
		double rad = Math.abs(h - m);
		// System.out.println(rad / Math.PI / 2. * 360.);
		double res = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2) - (2. * a * b * Math.cos(rad)));
		System.out.println(res);
	}

}
