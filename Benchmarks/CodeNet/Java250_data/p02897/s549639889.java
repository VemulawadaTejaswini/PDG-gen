import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		System.out.println(n % 2 == 0 ? 0.5 : Math.ceil(n / 2.0)  / n);
	}
}