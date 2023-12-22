import java.util.Scanner;

public class Main{
	private static Scanner scan;
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		String str = scan.nextLine();
		System.out.println(str.toUpperCase());
		System.exit(0);
	}
}