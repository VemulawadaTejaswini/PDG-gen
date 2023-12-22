import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		sc.close();

		int sum = A + B + C;
		int count = 0;

		while (true) {
			if (sum % 3 == 0 && sum / 3 >= Math.max(A, Math.max(B, C)))
				break;
			sum += 2;
			count++;
		}

		System.out.println(count);
	}
}