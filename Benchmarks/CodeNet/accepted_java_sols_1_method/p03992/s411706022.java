import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String iString = scanner.next();
		System.out.println(iString.substring(0, 4) + " " + iString.substring(4));
	}
}