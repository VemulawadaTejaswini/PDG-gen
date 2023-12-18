import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try {
			int a = sc.nextInt();
			int b = sc.nextInt();

			int area = a * b;
			int perimeter = (a + b) * 2;

			System.out.println(area + " " + perimeter);
		} catch(InputMismatchException ex) {
			ex.printStackTrace();
		} finally {
			sc.close();
		}
	}
}

