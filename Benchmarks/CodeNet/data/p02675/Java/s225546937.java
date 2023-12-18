import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String N = sc.next();
		String[] NSplit = N.split("");
		if (NSplit[NSplit.length - 1].equals("3")) {
			System.out.println("bon");
		} else if (NSplit[NSplit.length - 1].equals("0") || NSplit[NSplit.length - 1].equals("1")
				|| NSplit[NSplit.length - 1].equals("6") || NSplit[NSplit.length - 1].equals("8")) {
			System.out.println("pon");
		} else {
			System.out.println("hon");
		}
	}
}