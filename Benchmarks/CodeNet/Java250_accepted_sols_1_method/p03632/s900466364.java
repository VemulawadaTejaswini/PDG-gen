
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int d = scan.nextInt();
		scan.close();

		System.out.println((Math.min(b, d)-Math.max(a, c)>0)? Math.min(b, d)-Math.max(a, c):"0");

	}
}
