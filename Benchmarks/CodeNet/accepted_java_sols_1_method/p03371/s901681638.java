import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		int betu = (a * x) + (b * y);
		int sepa = c * Math.max(x, y) * 2;
		int midd;
		if (x > y) {
			midd = (c * y * 2) + a * (x - y);
		} else if (x < y) {
			midd = (c * x * 2) + b * (y - x);
		} else {
			midd = sepa;
		}
		System.out.println(Math.min(Math.min(betu, sepa), midd));
	}
}