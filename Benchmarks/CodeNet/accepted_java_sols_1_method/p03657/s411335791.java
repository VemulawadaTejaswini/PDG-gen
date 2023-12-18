import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int goat = 3;
		int a = scan.nextInt();
		int b = scan.nextInt();
		String message = "Possible";
		if(a % goat == 0) {
		} else if(b % goat == 0) {
		} else if((a + b) % goat == 0) {
		} else {
			message = "Impossible";
		}
		System.out.println(message);
	}
}