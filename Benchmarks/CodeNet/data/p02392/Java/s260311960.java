import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		print();
	}

	private static void print() throws IOException {
		int a;
		int b;
		int c;

		Scanner scn = new Scanner(System.in);
		a = scn.nextInt();
		b = scn.nextInt();
		c = scn.nextInt();
		compare(a, b, c);
	}

	private static void compare(int a, int b, int c) {
		if (a < b && b < c){
				System.out.println("Yes");
		} else  {
			System.out.println("No");
		}
	}

}