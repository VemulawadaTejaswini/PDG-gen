import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S = sc.next();

		for (int i = 0; i < S.toCharArray().length; i++) {
			System.out.print((char)((S.toCharArray()[i] + N - 65) % 26 + 65));
		}

		System.out.println();
	}
}
