import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str_a = scan.next();
		String str_b = scan.next();
		int a_length = str_a.length();
		int b_length = str_b.length();
		String message = "";
		if(a_length > b_length) {
			message = "GREATER";
		} else if(a_length < b_length) {
			message = "LESS";
		} else {
			int i = 0;
			for(i = 0; i < a_length; i++) {
				int a = Integer.parseInt(str_a.charAt(i) + "");
				int b = Integer.parseInt(str_b.charAt(i) + "");
				if(a > b) {
					message = "GREATER";
					break;
				} else if(a < b) {
					message = "LESS";
					break;
				}
			}
			if(i == a_length) {
				message = "EQUAL";
			}
		}
		System.out.println(message);
	}
}