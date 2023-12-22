import java.util.Scanner;

class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		double b = 0;
		for (int i = 0; i < n; i++) {
			double a = sc.nextDouble();
			b += 1 / a;
		}
		System.out.println(1 / b);
	}
}