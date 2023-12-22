import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();

		if (s.matches("^A[a-z][a-z]*C[a-z]*[a-z]")) {
			System.out.println("AC");
		} else {
			System.out.println("WA");
		}

		sc.close();
	}
}