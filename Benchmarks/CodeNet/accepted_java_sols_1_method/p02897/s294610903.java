import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (n == 1) {
			System.out.println(1);
		} else if (n % 2 == 0) {
			System.out.println(0.5);
		} else {
			double a = n / 2 + 1;
			System.out.println(a / n);
		}
	}
}
