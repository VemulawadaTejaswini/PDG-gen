import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long A = sc.nextLong();
		long B = sc.nextLong();
		long C = sc.nextLong();

		long ans = 0;
		if (A % 2 == 0 || B % 2 == 0 || C % 2 == 0) {
			ans = 0;
		} else {
			ans = Math.min(Math.min(A * B, B * C), C * A);
		}

		System.out.println(ans);
	}
}
