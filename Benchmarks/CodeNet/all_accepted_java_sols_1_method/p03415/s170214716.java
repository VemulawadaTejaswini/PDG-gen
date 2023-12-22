import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		String s1 = scanner.next();
		String s2 = scanner.next();
		String s3 = scanner.next();

		System.out.println(s1.charAt(0)+""+ s2.charAt(1)+""+ s3.charAt(2));

	}
}
