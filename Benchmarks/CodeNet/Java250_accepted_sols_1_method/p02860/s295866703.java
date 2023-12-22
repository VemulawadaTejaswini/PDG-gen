import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String input = sc.next();
		if (N % 2 == 1) {
			System.out.println("No");
			System.exit(0);
		}
		for (int i = 0; i < N / 2; i++) {
			if (input.charAt(i) != input.charAt(N / 2 + i)) {
				System.out.println("No");
				System.exit(0);
			}
		}
		System.out.println("Yes");
	}
}
