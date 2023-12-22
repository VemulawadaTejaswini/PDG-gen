import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String S = sc.next();
		long K = sc.nextLong();

		for (int i = 0; i < K; i++) {
			if (S.charAt(i) - '0' != 1) {
				System.out.println(S.charAt(i) - '0');
				return;
			}
		}

		System.out.println(1);
	}
}