import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		int d = a / b;
		int r = a % b;
		double f = (double) a / (double) b;

		System.out.printf("%d", d);
		System.out.print(" ");
		System.out.printf("%d", r);
		System.out.print(" ");
		System.out.printf("%f", f);
	}
}

