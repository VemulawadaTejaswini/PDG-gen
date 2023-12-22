import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		if (N <= 999)
			System.out.println("ABC");
		else
			System.out.println("ABD");
		scanner.close();
	}
}