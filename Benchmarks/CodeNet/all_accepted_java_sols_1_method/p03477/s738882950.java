import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();

		int left = a + b;
		int right = c + d;

		if (left > right) {
			System.out.println("Left");
		} else if (left == right){
			System.out.println("Balanced");
		} else {
			System.out.println("Right");
		}
	}
}
