import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try(Scanner scanner = new Scanner(System.in)) {
			int A = scanner.nextInt();
			int B = scanner.nextInt();
			int H = scanner.nextInt();
			int M = scanner.nextInt();

			double sita = ((double)H / 6 * Math.PI - (double)M / 30 * Math.PI);
			sita = sita < 0 ? -(double)sita : sita;
			double answer = Math.sqrt((double)(Math.pow(A, 2) + Math.pow(B, 2) - (double)((double)(2 * A * B) * Math.cos(sita))));
			System.out.print(answer);
		}
	}
}