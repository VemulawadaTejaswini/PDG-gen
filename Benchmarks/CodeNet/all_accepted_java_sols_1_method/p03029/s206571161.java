import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int P = sc.nextInt();
		int count = 0;
		int sum = 0;

		for (int i = 0; i < A; i++) {
			count += 3;
		}

		System.out.println((count + P) / 2);
	}
}
