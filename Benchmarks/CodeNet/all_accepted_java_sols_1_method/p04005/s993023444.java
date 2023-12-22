import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		long A = sc.nextLong();
		long B = sc.nextLong();
		long C = sc.nextLong();
		long ans;
		if (A % 2 == 0 || B % 2 == 0 || C % 2 == 0) {
			ans = 0;
		} else {
			ans = Math.min(A * B, Math.min(B * C, C * A));
		}
		System.out.println(ans);
	}

}
