import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		String s = scanner.next();
		int length = s.length();
		for (int i = 0; i < length; i++) {
			System.out.print((char) ('A' + (s.charAt(i) - 'A' + n) % 26));
		}
	}

}
