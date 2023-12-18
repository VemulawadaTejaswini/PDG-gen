import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		scanner.close();

		String out = s.replace(",", " ");

		System.out.println(out);

	}

}
