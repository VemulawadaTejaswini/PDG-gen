import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String in = scan.nextLine();
		System.out.println(in.substring(0,5)+" "+in.substring(6,13)+" "+in.substring(14));
	}
}
