import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int m = sc.nextInt();
		int n = sc.nextInt();

		if (m <= 5) {
			System.out.println(0);
		} else if (m < 13) {
			System.out.println(n / 2);
		} else {
			System.out.println(n);
		}
	}
}