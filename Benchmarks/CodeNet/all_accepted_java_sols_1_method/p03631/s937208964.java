import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int n3 = n / 100;
		int n1 = n % 10;
		String message = "No";
		if(n1 == n3) {
			message = "Yes";
		}
		System.out.println(message);
	}
}