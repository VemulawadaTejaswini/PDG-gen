import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		int a = stdIn.nextInt();
		int b = stdIn.nextInt();
		if (a%3 != 0) {
			if (b%3 != 0) {
				if ((a+b)%3 != 0) {
					System.out.println("Impossible");
				}else {
					System.out.println("Possible");
				}
			}else {
				System.out.println("Possible");
			}
		}else {
			System.out.println("Possible");
		}
	}
}
