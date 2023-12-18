import java.util.Scanner;

public class Main {

	void main() {

		try(Scanner sc = new Scanner(System.in)) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println((a*b) + " " + (2*a + 2*b));
		}
	}

	public static void main(String[] args) {

		new Main().main();

	}

}

