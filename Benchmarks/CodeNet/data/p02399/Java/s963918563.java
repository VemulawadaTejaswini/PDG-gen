import java.util.Scanner;

/**
 * @author ??\???
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long a = scanner.nextInt();
		long b = scanner.nextInt();
		scanner.close();
		
		System.out.println((a / b) + " " + (a % b) + " " + ((double) a / b));
	}

}