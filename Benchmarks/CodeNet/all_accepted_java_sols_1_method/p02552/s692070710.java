import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();

		String message = "0";
		if(x == 0) {
			message = "1";
		}

		System.out.println(message);
	}
}