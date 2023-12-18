import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();

		if (n % 2 == 1) {
			System.out.println("No");
			return;
		}
		int half = n / 2;
		String first = s.substring(0, half);
		String second = s.substring(half);
		System.out.println(first.equals(second) ? "Yes" : "No");
	}

}