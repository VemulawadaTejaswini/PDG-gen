import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		double A = scan.nextDouble();
		double B = scan.nextDouble();
		double N = scan.nextDouble();
		double answer = 0;

		if (B - 1 <= N) answer = Math.floor(A * (B - 1) / B) - A * Math.floor((B - 1) / B);
		else answer = Math.floor(A * N / B) - A * Math.floor(N / B);

		System.out.println((long)answer);
	}
}