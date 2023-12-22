import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int a = scan.nextInt();
		n = n % 500;
		String message = "No";
		if(n <= a) {
			message = "Yes";
		}
		System.out.println(message);
	}
}