import java.util.Scanner;

class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String n = scanner.next();
		System.out.println(n.replaceAll(","," "));
 	}
}