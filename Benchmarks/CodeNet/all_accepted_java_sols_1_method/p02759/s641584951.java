
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {


	Scanner scan = new Scanner(System.in);
	double N = scan.nextInt();

	System.out.println((int)Math.ceil(N/2));
	scan.close();
	}
}
