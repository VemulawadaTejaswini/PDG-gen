import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();
		int K = scan.nextInt();
		String S = scan.next();

		char c[] = S.toCharArray();
		c[K - 1] = Character.toLowerCase(c[K - 1]);
		System.out.println(new String(c));

	}
}