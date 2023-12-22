import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		try(Scanner sc = new Scanner(System.in)) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			int z = sc.nextInt();

			System.out.println(z + " " + x + " " + y);
		}

	}

}
