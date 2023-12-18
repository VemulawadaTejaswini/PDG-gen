import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String pass1 = scan.nextLine();
		String pass2 = scan.nextLine();
		String passCheck = "0K";

		int length = pass2.length();

		if(length == 2) {
			passCheck = pass2.substring(0 , 1);
		}else {
			passCheck = pass2.substring(0 , length - 1);
		}

		if(pass1.equals(passCheck)) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}
