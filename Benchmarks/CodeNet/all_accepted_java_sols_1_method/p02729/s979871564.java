import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		sc.close();

		int result = n * (n - 1) / 2  + m * (m - 1) / 2;

		System.out.print(result);
	}
}
