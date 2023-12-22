import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		scanner.close();
		String ans = null;
		if (a < b && b < c) {
			ans = "Yes";
		} else {
			ans = "No";
		}
		System.out.println(ans);
	}
}