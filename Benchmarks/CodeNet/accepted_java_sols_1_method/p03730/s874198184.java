import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		String message = "NO";
		int n = 0;
		int i = 0;
		for(i = 0; i < b; i++) {
			n = n + a;
			if(n % b == c) {
				message = "YES";
				break;
			}
		}
		System.out.println(message);
	}
}