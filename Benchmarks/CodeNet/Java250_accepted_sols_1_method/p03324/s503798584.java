import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int d = sc.nextInt();
		int n = sc.nextInt();

		if (n == 100) {
			n = 101;
		}

		System.out.println(n * (d == 0 ? 1 : d == 1 ? 100 : 10000));

		sc.close();
	}
}
