import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, d, r;
		double f;
		a = sc.nextInt();
		b = sc.nextInt();
		d = a / b;
		r = a % b;
		f = 1.00000*a / b;
		System.out.printf(d+" "+r+" %f", f);
	}
}