import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String N = scan.next();

		if (N.endsWith("3")) System.out.println("bon");
		else if (N.endsWith("0") || N.endsWith("1") || N.endsWith("6") || N.endsWith("8")) System.out.println("pon");
		else System.out.println("hon");
 	}
}