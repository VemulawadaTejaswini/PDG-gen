import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		while (N != 0) {
			int k = N % 10;
			if (k == 7) {
				System.out.println("Yes");
				break;
			} else {
				N = N / 10;
			}
		}
		if (N == 0) {
			System.out.println("No");
		}
	}
}
