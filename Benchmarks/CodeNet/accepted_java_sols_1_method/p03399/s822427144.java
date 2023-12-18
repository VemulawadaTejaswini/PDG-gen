import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//電車(通常切符)
		int A = scanner.nextInt();
		//電車(乗り放題)
		int B = scanner.nextInt();
		//バス(通常切符)
		int C = scanner.nextInt();
		//バス(乗り放題)
		int D = scanner.nextInt();

		//運賃合計最小値
		int train = A < B ? A : B;
		int bus = C < D ? C : D;
		int fare = train + bus;
		System.out.println(fare);
	}
}
