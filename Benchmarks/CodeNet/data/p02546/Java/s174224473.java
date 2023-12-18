import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String n= scan.next();
		if (n.charAt(n.length()-1) == 's') {
			System.out.println(n + "es");
			return;
		} else {
			System.out.println(n + "s");
			return;
		}
	}

}