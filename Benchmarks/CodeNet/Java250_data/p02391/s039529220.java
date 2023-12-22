import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		String[] array = line.split(" ");
		int a = Integer.parseInt(array[0]);
		int b = Integer.parseInt(array[1]);

		if (a < b) {
			System.out.println("a < b");

		}
		if (a > b) {
			System.out.println("a > b");

		}
		if (a == b) {
			System.out.println("a == b");

		}
	}

}