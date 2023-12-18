import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x, sum;

		while (true) {
			x = sc.nextInt();

			if (x == 0) break;

			sum = 0;
			while (x > 0) {
				sum += x % 10;
				x /= 10;
			}
			System.out.println(sum);
		}

		sc.close();
	}
}