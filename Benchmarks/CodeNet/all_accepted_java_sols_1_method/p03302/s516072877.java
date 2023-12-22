import java.util.Scanner;

public class Main {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		int a = scan.nextInt();
		int b = scan.nextInt();
		if(a + b == 15) {
			System.out.println("+");
		} else if (a * b == 15) {
			System.out.println("*");
		} else {
			System.out.println("x");
		}
    }
}
