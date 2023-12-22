import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long H = sc.nextLong();
		int N = sc.nextInt();
		long con = 0;

		for (int i = 0; i < N; i++) {
			con += sc.nextInt();
		}

		if (con >= H) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}

	}
}