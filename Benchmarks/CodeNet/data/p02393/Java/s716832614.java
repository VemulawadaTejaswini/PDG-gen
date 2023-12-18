import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();

		String[] n = line.split(" ");
		int a = Integer.parseInt(n[0]);
		int b = Integer.parseInt(n[1]);
		int c = Integer.parseInt(n[2]);

		if (a < b && a < c && b < c) {
			System.out.println(a + " " + b + " " + c);
		} else if (b < a && b < c && a < c) {
			System.out.println(b + " " + a + " " + c);
		} else if (a < b && a < c && c < b) {
			System.out.println(a + " " + c + " " + b);
		} else if (b < a && b < c && c < a) {
			System.out.println(b + " " + c + " " + a);
		} else if (c < a && c < b && a < b) {
			System.out.println(c + " " + a + " " + b);
		} else if (c < a && c < b && b < a) {
			System.out.println(b + " " + c + " " + a);
		}

	}

}

