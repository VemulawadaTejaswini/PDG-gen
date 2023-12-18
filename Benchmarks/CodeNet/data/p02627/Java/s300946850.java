import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();

		if (s.matches("[A-Z]")) {
			System.out.println("A");
		} else {
			System.out.println("a");
		}
	}
}
