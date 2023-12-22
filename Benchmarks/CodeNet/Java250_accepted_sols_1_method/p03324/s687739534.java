import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int d = sc.nextInt();
			int n = sc.nextInt();

			int result = 0;
			if (n != 100) {
				result = ((int) Math.pow(100, d)) * n;
			} else {
				result = ((int) Math.pow(100, d) * (n + 1));
			}
			System.out.println(result);
		}
	}
}