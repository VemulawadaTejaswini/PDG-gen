import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println(a / b);
		System.out.println(a % b);
		System.out.println(String.format("%.8f", 1.0 * (double)a / (double)b));
	}
}

