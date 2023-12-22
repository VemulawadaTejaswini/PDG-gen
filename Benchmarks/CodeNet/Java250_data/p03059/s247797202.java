import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		double t = sc.nextDouble() + 0.5;
		int sum = 0;
		double time = t / a;

		for (int i = 1; i < time; i++) {
			sum += b;
		}

		System.out.println(sum);

		sc.close();

	}
}
