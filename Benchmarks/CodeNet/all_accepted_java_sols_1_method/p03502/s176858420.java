import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();
		int temp = N;
		int sum = 0;

		for (int i = 0; i < 10; i++) {
			sum += N % 10;
			N /= 10;
		}

		if (temp % sum == 0) System.out.println("Yes");
		else System.out.println("No");
 	}
}