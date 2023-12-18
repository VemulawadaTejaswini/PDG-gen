import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if (a < b) {
			if (b < c) {
				System.out.println("a < b < c\n");
			} else if (a < c) {
				System.out.println("a < c < b\n");
			}
		}
		if (b < a) {
			if (a < c) {
				System.out.println("b < a < c\n");
			} else if (c < a) {
				System.out.println("b < c < a\n");
			}
		}
		if (c < a) {
			if (a < b) {
				System.out.println("c < a < b\n");
			} else if (b < a) {
				System.out.println("c < b < a\n");
			}
		}
	}
}