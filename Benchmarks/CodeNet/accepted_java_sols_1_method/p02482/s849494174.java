import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a, b;
		a = scan.nextInt();
		b = scan.nextInt();
		if (a == b) {
			System.out.println("a == b");
		} else if (a > b) {
			System.out.println("a > b");
		} else if (a < b) {
			System.out.println("a < b");
		}
	}
}