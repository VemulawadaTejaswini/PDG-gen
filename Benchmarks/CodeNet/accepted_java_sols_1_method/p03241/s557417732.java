import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();

		if (M % N == 0) {
			System.out.println(M / N);
			return;
		}

		int max = M / N;
		for (int a = max; a > 0; a--) {
			if (M % a == 0) {
				System.out.println(a);
				break;
			}
		}
	}
}
