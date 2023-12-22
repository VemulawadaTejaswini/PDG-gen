import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		String s = scanner.next();
		int k = scanner.nextInt();

		String asta = "*";

		char keyWord = s.charAt(k-1);

		System.out.println(s.replaceAll("[^"+keyWord+"]", asta));

		scanner.close();

	}
}