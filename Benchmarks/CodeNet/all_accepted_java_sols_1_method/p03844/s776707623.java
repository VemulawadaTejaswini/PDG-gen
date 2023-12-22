import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		String operator = sc.next();
		int b = sc.nextInt();

		if ("+".equalsIgnoreCase(operator)) {
			System.out.println(a + b);
		} else {
			System.out.println(a - b);
		}
		sc.close();
	}
}