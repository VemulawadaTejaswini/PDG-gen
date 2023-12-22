import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		int train, taxi;

		train = N * A;
		taxi = B;

		System.out.println(Math.min(train, taxi));
	}
}
