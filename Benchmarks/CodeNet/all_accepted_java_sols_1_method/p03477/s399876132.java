import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int d = scan.nextInt();
		int L = a+b;
		int R = c+d;
		if (L>R) {
			System.out.println("Left");
		}
		if (L<R) {
			System.out.println("Right");
		}
		if (L==R) {
			System.out.println("Balanced");
		}
	}
}
