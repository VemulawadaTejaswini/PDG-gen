import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int n = sc.nextInt();
		int ans = 1;

		while (n >= ans) {
			ans *= 2;
		}
		System.out.print(ans / 2);

	}
}