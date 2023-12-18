import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int x = scan.nextInt();
		String message = "NO";
		if(a <= x && x <= a + b) {
			message = "YES";
		}
		System.out.println(message);
	}
}