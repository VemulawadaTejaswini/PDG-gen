import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int r = scan.nextInt();
		int g = scan.nextInt();
		int b = scan.nextInt();
		int num = (100 * r) + (10 * g) + b;
		String message = "NO";
		if(num % 4 == 0) {
			message = "YES";
		}
		System.out.println(message);
	}
}