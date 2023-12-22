/* Click on the checkbox for Add Custom Input and then write the input there before running the program */
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    int n = input.nextInt();
	    System.out.println((int)Math.ceil(n/2.0));
	}
}