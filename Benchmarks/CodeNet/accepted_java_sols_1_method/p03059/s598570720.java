import java.util.Scanner;

public class Main {

	public static void main(final String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int T = sc.nextInt();
		sc.close();
		System.out.println((int)((T / A) + 0.5) * B);
	}
}