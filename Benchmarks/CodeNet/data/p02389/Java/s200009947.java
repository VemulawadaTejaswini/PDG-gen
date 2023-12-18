import java.util.Scanner;

public class Rectangle {

	public static void main(String[] args) {
		int a = 0;
		int b = 0;

		try(Scanner scan = new Scanner(System.in)) {
			System.out.print("???a???");
			a = scan.nextInt();
			System.out.print("???b???");
			b = scan.nextInt();

			System.out.println("??¢??????" + a +  " ?? " + b + " = " + (a * b));
			System.out.println("??¨???????????????" + "(" + a + " ?? " + b + ")" + " ?? " + "2 = " + ((a * b) * 2));
		}
	}

}